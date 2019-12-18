/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.generos.Generos;
import BI.generos.MysqlGenerosDAO;
import UI.Principal;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pardo
 */
public class GenerosController extends MouseAdapter {

    Principal principal;
    MysqlGenerosDAO mysql = new MysqlGenerosDAO();
    Controller controller;
    Generos modificar;

    public GenerosController(Principal principal) {
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
                } catch (Exception ex) {
                    principal.mostrarError("No se puede eliminar pues existen tablas asocidas a este registro");
                }
                break;
        }
    }

    void abrirVentanaRegistro() {
        controller.limpiar(principal.getRegistrarGenero());
        principal.getRegistrarGenero().setSize(318, 230);
        principal.getRegistrarGenero().setLocationRelativeTo(null);
        principal.getRegistrarGenero().setVisible(true);
    }

    void registrar() {
        if (controller.validarjTextFieldString(principal.getjTextFieldNombreGenero())
                && controller.validarTextArea(principal.getjTextAreaDescripcionGenero())) {
            String nombre = principal.getjTextFieldNombreGenero().getText();
            String descripcion = principal.getjTextAreaDescripcionGenero().getText();
            Generos genero = new Generos(nombre, descripcion);
            if (modificar == null) {
                mysql.insertarGenero(genero);
            } else {
                genero.setId(modificar.getId());
                mysql.modificarGeneros(genero);
            }
            controller.actualizarTodo();
            modificar = null;
            principal.getRegistrarGenero().dispose();
        }
    }

    private void modificar() {
        int indice = principal.getjTableGeneros().getSelectedRow();
        if (indice != -1) {
            abrirVentanaRegistro();
            int id = Integer.parseInt(principal.getjTableGeneros().getValueAt(indice, 0).toString());
            modificar = controller.getGeneros().get(id);
            principal.getjTextFieldNombreGenero().setText(modificar.getNombre());
            principal.getjTextAreaDescripcionGenero().setText(modificar.getDescipcion());
        }
    }

    private void buscar() {
        if (controller.validarString(principal.getjTextFieldBusquedaGenero().getText())) {
            String busqueda = principal.getjTextFieldBusquedaGenero().getText();
            DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableGeneros().getModel();
            modeloTabla.setRowCount(0);
            for (Generos genero : controller.getGeneros().values()) {
                if (genero.getNombre().equals(busqueda)) {
                    modeloTabla.addRow(new Object[]{genero.getId(), genero.getNombre(), genero.getDescipcion()});
                }
            }
        } else {
            controller.actualizarGeneros();
        }
    }

    private void eliminar() throws MySQLIntegrityConstraintViolationException {
        int indice = principal.getjTableGeneros().getSelectedRow();
        if (indice != -1) {

            int id = Integer.parseInt(principal.getjTableGeneros().getValueAt(indice, 0).toString());
            if (principal.mostrarConfirmacion("¿Esta seguro que desea eliminar? :" + id)) {
                try {
                    mysql.eliminarGeneros(controller.getGeneros().get(id));
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
