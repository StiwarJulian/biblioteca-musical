/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.artistas.Artistas;
import BI.artistas.MysqlArtistasDAO;
import BI.generos.Generos;
import UI.Principal;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pardo
 */
public class ArtistasController extends MouseAdapter {

    Controller controller;
    Principal principal;
    MysqlArtistasDAO mysql = new MysqlArtistasDAO();
    Artistas modificar;

    public ArtistasController(Principal principal) {
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
            case ("Modificar"):
                modificar();
                break;
            case ("Buscar"):
                buscar();
                break;
            case ("Eliminar"):
                try {
                    eliminar();
                } catch (MySQLIntegrityConstraintViolationException ex) {

                    principal.mostrarError("No se puede eliminar pues existen tablas asocidas a este registro");
                }
                break;
        }
    }

    void abrirVentanaRegistro() {
        controller.limpiar(principal.getRegistrarArtista());
        principal.getRegistrarArtista().setSize(751, 443);
        principal.getRegistrarArtista().setLocationRelativeTo(null);
        principal.getRegistrarArtista().setVisible(true);
    }

    void registrar() {
        if (controller.validarjTextFieldString(principal.getjTextFieldPrimerNombreArtista())
                && controller.validarjTextFieldString(principal.getjTextFieldPrimerApellidoArtista())
                && controller.validarjTextFieldString(principal.getjTextFieldNombreArtisticoArtista())
                && controller.validarDate(principal.getjDateChooserFechaNacimientoArtista())) {

            String primerNombre = principal.getjTextFieldPrimerNombreArtista().getText();
            String primerApellido = principal.getjTextFieldPrimerApellidoArtista().getText();
            String nombreArtistico = principal.getjTextFieldNombreArtisticoArtista().getText();
            Date fechaNacimiento = new Date(principal.getjDateChooserFechaNacimientoArtista().getDate().getTime());
            Object fechaDefuncionob = principal.getjDateChooserFechaDefuncionArtista().getDate();
            Date fechaDefuncion = (fechaDefuncionob != null) ? new Date(((java.util.Date) fechaDefuncionob).getTime()) : null;
            int pais = principal.getjComboBoxPaisArtista().getSelectedIndex() + 1;
            String decripcion = principal.getjTextAreaDescripcionArtista().getText();
            int genero = (((Generos) principal.getjComboBoxGeneroArtista().getSelectedItem()).getId());
            String segundoNombre = principal.getjTextFieldSegundoNombreArtista().getText();
            String segundoApellido = principal.getjTextFieldSegundoApellidoArtista().getText();
            Artistas artista = new Artistas(primerNombre, primerApellido, nombreArtistico, fechaNacimiento, fechaDefuncion, pais, decripcion, genero, segundoApellido, segundoNombre);

            if (modificar == null) {
                mysql.insertarArtistas(artista);
            } else {
                artista.setId(modificar.getId());
                mysql.modificarArtistas(artista);
            }
            modificar = null;
            controller.actualizarTodo();
            principal.getRegistrarArtista().dispose();

        }

    }

    private void modificar() {
        int indice = principal.getjTableArtistas().getSelectedRow();
        if (indice != -1) {
            abrirVentanaRegistro();
            int id = Integer.parseInt(principal.getjTableArtistas().getValueAt(indice, 0).toString());
            modificar = controller.getArtistas().get(id);
            principal.getjTextFieldPrimerNombreArtista().setText(modificar.getPrimerNombre());
            principal.getjTextFieldPrimerApellidoArtista().setText(modificar.getPrimerApellido());
            principal.getjTextFieldNombreArtisticoArtista().setText(modificar.getNombreArtistico());
            principal.getjDateChooserFechaNacimientoArtista().setDate(modificar.getFechaNacimiento());
            principal.getjDateChooserFechaDefuncionArtista().setDate(modificar.getFechaDefuncion());
            principal.getjComboBoxPaisArtista().setSelectedItem(controller.getPaises().get(modificar.getPais()));
            principal.getjTextAreaDescripcionArtista().setText(modificar.getDescripcion());
            principal.getjComboBoxGeneroArtista().setSelectedItem(controller.getGeneros().get(modificar.getGenero()));
            principal.getjTextFieldSegundoNombreArtista().setText(modificar.getNombreArtistico());
            principal.getjTextFieldSegundoApellidoArtista().setText(modificar.getSegundoApellido());
        }
    }

    private void buscar() {
        if (controller.validarString(principal.getjTextFieldBusquedaArtistas().getText())) {
            String busqueda = principal.getjTextFieldBusquedaArtistas().getText();
            int tipo = principal.getjComboBoxBusquedaArtista().getSelectedIndex();
            boolean bandera = false;
            DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableArtistas().getModel();
            modeloTabla.setRowCount(0);
            for (Artistas artista : controller.getArtistas().values()) {
                switch (tipo) {
                    case 0:
                        bandera = artista.getPrimerNombre().equals(busqueda);
                        break;
                    case 1:
                        bandera = controller.getPaises().get(artista.getPais()).getNombre().equals(busqueda);
                        break;
                    case 2:
                        bandera = artista.getNombreArtistico().equals(busqueda);
                        break;
                }
                if (bandera) {
                    int edad = controller.calcularEdad(artista.getFechaNacimiento(), artista.getFechaDefuncion());
                    modeloTabla.addRow(new Object[]{artista.getId(),
                        artista.getNombreArtistico(), artista.getPrimerNombre() + " " + artista.getSegundoNombre(),
                        artista.getPrimerApellido() + " " + artista.getSegundoApellido(), edad, artista.getFechaNacimiento()
                        + " - " + artista.getFechaDefuncion(), controller.getPaises().get(artista.getPais()), artista.getDescripcion(),
                        controller.getGeneros().get(artista.getGenero())
                    });
                }
            }
        } else {
            controller.actualizarArtistas();
        }
    }

    private void eliminar() throws MySQLIntegrityConstraintViolationException {
        int indice = principal.getjTableArtistas().getSelectedRow();
        if (indice != -1) {
            int id = Integer.parseInt(principal.getjTableArtistas().getValueAt(indice, 0).toString());
            if (principal.mostrarConfirmacion("¿Esta seguro que desea eliminar? :" + id)) {
                try {
                    mysql.eliminarArtistas(controller.getArtistas().get(id));
                } catch (Exception ex) {
                    if (ex instanceof MySQLIntegrityConstraintViolationException) {
                        throw new MySQLIntegrityConstraintViolationException();
                    }
                }
                controller.actualizarTodo();
            }
        }
    }
}
