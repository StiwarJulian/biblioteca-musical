/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.compositores.Compositores;
import BI.compositores.MysqlCompositoresDAO;
import UI.Principal;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pardo
 */
public class CompositoresController extends MouseAdapter {

    Controller controller;
    Principal principal;
    MysqlCompositoresDAO mysql = new MysqlCompositoresDAO();
    Compositores modificar;

    public CompositoresController(Principal principal) {
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
        controller.limpiar(principal.getRegistrarCompositor());
        principal.getRegistrarCompositor().setSize(555, 210);
        principal.getRegistrarCompositor().setLocationRelativeTo(null);
        principal.getRegistrarCompositor().setVisible(true);
    }

    void registrar() {
        if (controller.validarjTextFieldString(principal.getjTextFieldPrimerNombreCompositor())
                && controller.validarjTextFieldString(principal.getjTextFieldPrimerApellidoCompositor())
                && controller.validarTextFieldEntero(principal.getjTextFieldEdadCompositor())) {
            String primerNombre = principal.getjTextFieldPrimerNombreCompositor().getText();
            String primerApellido = principal.getjTextFieldPrimerApellidoCompositor().getText();
            int edad = Integer.parseInt(principal.getjTextFieldEdadCompositor().getText());
            int pais = principal.getjComboBoxPaisCompositor().getSelectedIndex() + 1;
            String segundoNombre = principal.getjTextFieldSegundoNombreCompositor().getText();
            String segundoApellido = principal.getjTextFieldSegundoApellidoCompositor().getText();
            Compositores compositor = new Compositores(primerNombre, segundoNombre, primerApellido, segundoApellido, edad, pais);
            if (modificar == null) {
                mysql.insertarCompositor(compositor);
            } else {
                compositor.setId(modificar.getId());
                mysql.modificarCompositor(compositor);
            }
            controller.actualizarTodo();
            modificar = null;
            principal.getRegistrarCompositor().dispose();
        }

    }

    private void modificar() {
        int indice = principal.getjTableCompositores().getSelectedRow();
        if (indice != -1) {
            int id = Integer.parseInt(principal.getjTableCompositores().getValueAt(indice, 0).toString());
            abrirVentanaRegistro();
            modificar = controller.getCompositores().get(id);
            principal.getjTextFieldPrimerNombreCompositor().setText(modificar.getPrimerNombre());
            principal.getjTextFieldPrimerApellidoCompositor().setText(modificar.getPrimerApellido());
            principal.getjTextFieldEdadCompositor().setText(modificar.getEdad() + "");
            principal.getjComboBoxPaisCompositor().setSelectedItem(controller.getPaises().get(modificar.getPais()));
            principal.getjTextFieldSegundoNombreCompositor().setText(modificar.getSegundoNombre());
            principal.getjTextFieldSegundoApellidoCompositor().setText(modificar.getSegundoApellido());
        }
    }

    private void buscar() {
        if (controller.validarString(principal.getjTextFieldBuscarCompositores().getText())) {
            String busqueda = principal.getjTextFieldBuscarCompositores().getText();
            DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableCompositores().getModel();
            modeloTabla.setRowCount(0);
            for (Compositores compositor : controller.getCompositores().values()) {
                if (compositor.getPrimerNombre().equals(busqueda)) {
                    modeloTabla.addRow(new Object[]{compositor.getId(),
                        compositor.getPrimerNombre() + " " + compositor.getSegundoNombre(),
                        compositor.getPrimerApellido() + " "
                        + compositor.getSegundoApellido(), controller.getPaises().get((compositor.getPais()))
                    });
                }
            }
        } else {
            controller.actualizarCompositores();
        }
    }

    private void eliminar() throws MySQLIntegrityConstraintViolationException {
        int indice = principal.getjTableCompositores().getSelectedRow();
        if (indice != -1) {
            int id = Integer.parseInt(principal.getjTableCompositores().getValueAt(indice, 0).toString());
            if (principal.mostrarConfirmacion("¿Esta seguro que desea eliminar? :" + id)) {
                try {
                    mysql.eliminarCompositor(controller.getCompositores().get(id));
                } catch (Exception ex) {
                    if (ex instanceof MySQLIntegrityConstraintViolationException) {
                        throw new MySQLIntegrityConstraintViolationException();
                    }
                }
            }
            controller.actualizarTodo();
        }
    }
}
