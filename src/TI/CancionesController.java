/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.albumes.Albumes;
import BI.artistas.Artistas;
import BI.canciones.Canciones;
import BI.canciones.MysqlCancionesDAO;
import BI.compositores.Compositores;
import BI.generos.Generos;
import UI.Principal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pardo
 */
public class CancionesController extends MouseAdapter {

    Principal principal;
    MysqlCancionesDAO mysql = new MysqlCancionesDAO();
    Controller controller;

    public CancionesController(Principal principal) {
        this.principal = principal;
        controller = new Controller(principal);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String boton = (((JButton) e.getSource()).getActionCommand());
        switch (boton) {
            case ("AbrirRegistrar"):
                abrirVentanaRegistro();
                break;
            case ("Guardar"):
                registrar();
                break;
            case ("Mover"):
                mover();
                break;
            case ("Buscar"):
                buscar();
                break;
        }
    }

    void abrirVentanaRegistro() {
        controller.limpiar(principal.getRegistrarCancion());
        controller.limpiar(principal.getComprar());
        principal.getRegistrarCancion().setSize(677, 390);
        principal.getRegistrarCancion().setLocationRelativeTo(null);
        principal.getRegistrarCancion().setVisible(true);
    }

    void registrar() {
        if (controller.validarjTextFieldString(principal.getjTextFieldNombreCancion())) {
            if (!principal.getjTextFieldURL().getText().equals("")) {
                principal.getjTextFieldPrecioCancion().setText("0");
            }
            if (controller.validarTextFieldDouble(principal.getjTextFieldPrecioCancion())) {
                String nombre = principal.getjTextFieldNombreCancion().getText();
                int artista = ((Artistas) principal.getjComboBoxArtistaCancion().getSelectedItem()).getId();
                int genero = ((Generos) principal.getjComboBoxGeneroCancion().getSelectedItem()).getId();
                int compositor = ((Compositores) principal.getjComboBoxCompositorCancion().getSelectedItem()).getId();
                Date fechaLanzamiento = new Date(principal.getjDateChooserFechaLanzamientoCancion().getDate().getTime());
                int calificacion = Integer.parseInt(principal.getjSpinnerCalificacionCancion().getValue().toString());
                Object album = (principal.getjComboBoxAlbumCancion().getSelectedItem());
                album = (album != null) ? ((Albumes) album).getId() : null;
                double precio = Double.parseDouble(principal.getjTextFieldPrecioCancion().getText());
                Canciones cancion = new Canciones(0, nombre, artista, genero, compositor, fechaLanzamiento, calificacion, album, precio);
                mysql.insertarCanciones(cancion);
                controller.actualizarTodo();
                if (precio == 0) {
                    int id = ((Canciones) controller.getCanciones().values().toArray()[controller.getCanciones().size() - 1]).getId();
                    moverCancionBiblioteca(principal.getjTextFieldURL().getText(), id + "_" + nombre);
                }
                principal.getRegistrarCancion().dispose();
                controller.actualizarTodo();
            } else {
                principal.mostrarError("Se debe asignar un precio o una url, no ambas o ninguna");
            }
        }
    }

    private void mover() {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileFilter(new FileNameExtensionFilter("Canciones mp3", "mp3"));
        int returnVal = filechooser.showOpenDialog(principal);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            principal.getjTextFieldURL().setText(filechooser.getSelectedFile().getAbsolutePath());
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            principal.getjTextFieldURL().setText("");
        }
    }

    private boolean moverCancionBiblioteca(String url, String nombre) {
        Path temp = null;
        try {
            temp = Files.move(Paths.get(url),
                    Paths.get(Canciones.URL_CATALOGO + nombre + ".mp3"));
        } catch (IOException ex) {
            Logger.getLogger(CancionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp != null;
    }

    private void buscar() {
        if (controller.validarString(principal.getjTextFieldBuscarCancion().getText())) {
            String busqueda = principal.getjTextFieldBuscarCancion().getText();
            int tipo = principal.getjComboBoxBusquedaCancion().getSelectedIndex();
            boolean bandera = false;
            DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableCanciones().getModel();
            modeloTabla.setRowCount(0);
            for (Canciones cancion : controller.getCanciones().values()) {
                switch (tipo) {
                    case 0:
                        bandera = cancion.getNombre().equals(busqueda);
                        break;
                    case 1:
                        bandera = (cancion.getCalificacion() + "").equals(busqueda);
                        break;
                    case 2:
                        bandera = controller.getGeneros().get(cancion.getGenero()).getNombre().equals(busqueda);
                        break;
                    case 3:
                        bandera = controller.getArtistas().get(cancion.getArtista()).equals(busqueda);
                        break;
                }
                if (bandera) {
                    modeloTabla.addRow(new Object[]{cancion.getId(), cancion.getNombre(), controller.getArtistas().get(cancion.getArtista()),
                        controller.getGeneros().get(cancion.getGenero()), controller.getCompositores().get(cancion.getCompositor()), cancion.getFechaLanzamiento(),
                        controller.getAlbumes().get(cancion.getAlbum())});
                }
            }
        } else {
            controller.actualizarCanciones();
        }
    }
}
