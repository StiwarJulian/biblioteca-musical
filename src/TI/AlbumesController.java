/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.albumes.Albumes;
import BI.albumes.MysqlAlbumesDAO;
import BI.canciones.Canciones;
import BI.canciones.MysqlCancionesDAO;
import BI.usuarios.Usuarios;
import UI.Principal;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pardo
 */
public class AlbumesController extends MouseAdapter {

    Principal principal;
    Controller controller;
    MysqlAlbumesDAO mysql = new MysqlAlbumesDAO();
    DefaultListModel<Object> modelo = new DefaultListModel<>();
    DefaultListModel<Object> modeloGenero = new DefaultListModel<>();

    public AlbumesController(Principal principal) {
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
            case ("Seleccionar"):
                seleccionar();
                break;
            case ("añadir"):
                añadir();
                break;
            case ("quitar"):
                quitar();
                break;
            case ("Buscar"):
                buscar();
                break;
        }
    }

    void abrirVentanaRegistro() {
        controller.limpiar(principal.getRegistrarCompositor());
        principal.getRegistrarAlbum().setSize(592, 437);
        principal.getRegistrarAlbum().setVisible(true);
        obtenerCancionesGeneral();
    }

    void registrar() {
        if (controller.validarjTextFieldString(principal.getjTextFieldNombreAlbum())
                && controller.validarDate(principal.getjDateChooserFechaLanzamientoAlbum())) {
            if (principal.getjListCancionesAlbum().getModel().getSize() > 0) {
                String nombre = principal.getjTextFieldNombreAlbum().getText();
                Date fechaNacimiento = new Date(principal.getjDateChooserFechaLanzamientoAlbum().getDate().getTime());
                Albumes album = new Albumes(nombre, fechaNacimiento);
                mysql.insertarAlbumes(album);

                int id = ((Albumes) controller.getAlbumes().values().toArray()[controller.getAlbumes().size() - 1]).getId();
                guardarImagen(id + "_" + nombre);
                principal.getRegistrarAlbum().dispose();

                for (int i = 0; i < principal.getjListCancionesAlbum().getModel().getSize(); i++) {
                    Canciones cancion = ((Canciones) principal.getjListCancionesAlbum().getModel().getElementAt(i));
                    cancion.setAlbum(id);
                    new MysqlCancionesDAO().setAlbum(cancion);
                }
                controller.actualizarTodo();
            } else {
                principal.mostrarError("Debe añadir al menos una cancion");
            }
        }

    }

    private void seleccionar() {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileFilter(new FileNameExtensionFilter("Imagenes", "jpeg", "png", "jpg"));
        int returnVal = filechooser.showOpenDialog(principal);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ImageIcon icon = new ImageIcon(filechooser.getSelectedFile().getAbsolutePath());
            icon = new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            principal.getjLabelCaratulaAlbumRegistrar().setIcon(icon);
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
        }
    }

    private boolean guardarImagen(String nombre) {
        Path temp = null;
        try {
            ImageIO.write(toBufferedImage(((ImageIcon) principal.getjLabelCaratulaAlbumRegistrar().getIcon()).getImage()),
                    "png", new File(Usuarios.URL_AVATARS + nombre + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(CancionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp != null;
    }

    public BufferedImage toBufferedImage(Image img) {
        int width = img.getWidth(null);
        int height = img.getHeight(null);
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.getGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();
        return bi;
    }

    void obtenerCancionesGeneral() {
        modeloGenero.clear();
        for (int i = 0; i < principal.getjListCatalogoGeneralAlbum().getModel().getSize(); i++) {
            modeloGenero.addElement(
                    ((Canciones) principal.getjListCatalogoGeneralAlbum().getModel().getElementAt(i)));
        }
    }

    private void añadir() {
        int indice = principal.getjListCatalogoGeneralAlbum().getSelectedIndex();
        if (indice != -1) {
            principal.getjListCancionesAlbum().setModel(modelo);
            principal.getjListCatalogoGeneralAlbum().setModel(modeloGenero);
            Canciones cancion = (Canciones) modeloGenero.getElementAt(indice);
            modeloGenero.remove(indice);
            modelo.addElement(cancion);
        }
    }

    private void quitar() {
        int indice = principal.getjListCancionesAlbum().getSelectedIndex();
        if (indice != -1) {
            principal.getjListCancionesAlbum().setModel(modelo);
            principal.getjListCatalogoGeneralAlbum().setModel(modeloGenero);
            Canciones cancion = (Canciones) modelo.getElementAt(indice);
            modelo.remove(indice);
            modeloGenero.addElement(cancion);
        }
    }

    private void buscar() {
        if (controller.validarString(principal.getjTextFieldBuscarAlbum().getText())) {
            String busqueda = principal.getjTextFieldBuscarAlbum().getText();
            DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableAlbumes().getModel();
            modeloTabla.setRowCount(0);
            for (Albumes album : controller.getAlbumes().values()) {
                if (busqueda.equals(album.getNombre())) {
                    modeloTabla.addRow(new Object[]{album.getId(),
                        album.getNombre(), album.getFechaLanzamiento()
                    });
                }
            }
        } else {
            controller.actualizarAlbumes();
        }
    }

}
