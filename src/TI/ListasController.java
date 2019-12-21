/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.canciones.Canciones;
import BI.listas.Listas;
import BI.listas.MysqlListasDAO;
import UI.Principal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pardo
 */
public class ListasController extends MouseAdapter {

    Principal principal;
    Controller controller;
    MysqlListasDAO mysql = new MysqlListasDAO();
    DefaultListModel<Object> modelo = new DefaultListModel<>();
    DefaultListModel<Object> modeloGenero = new DefaultListModel<>();

    public ListasController(Principal principal) {
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
            case ("AbrirComprar"):
                abrirVentanaCompra();
                break;
            case ("<-"):
                añadirCancion();
                break;
            case ("->"):
                eliminarCancion();
                break;
            case ("Comprar"):
                comprar();
                break;
            case ("Busqueda"):
                buscar();
                break;

        }
    }

    void abrirVentanaRegistro() {
        controller.limpiar(principal.getRegistrarLista());
        principal.getRegistrarLista().setSize(573, 482);
        principal.getRegistrarLista().setVisible(true);
        obtenerCancionesGeneral();
    }

    void obtenerCancionesGeneral() {
        modeloGenero.clear();
        for (int i = 0; i < principal.getjListCatalogoGeneralCancionesLista().getModel().getSize(); i++) {
            modeloGenero.addElement(
                    ((Canciones) principal.getjListCatalogoGeneralCancionesLista().getModel().getElementAt(i)));
        }
    }

    void registrar() {
        if (controller.validarjTextFieldString(principal.getjTextFieldNombreLista())) {
            if (principal.getjListCancionesLista().getModel().getSize() != 0) {
                ArrayList<Canciones> canciones = new ArrayList<>();
                DefaultListModel<Object> modelo = (DefaultListModel<Object>) principal.getjListCancionesLista().getModel();
                for (Object cancion : modelo.toArray()) {
                    canciones.add((Canciones) cancion);
                }
                String nombre = principal.getjTextFieldNombreLista().getText();
                int idLista = ((Listas) controller.getListas().values().toArray()[controller.getListas().size() - 1]).getId() + 1;
                Listas lista = new Listas(idLista, new Date(System.currentTimeMillis()), nombre, canciones, controller.usuarioActual.getId());
                mysql.insertarListas(lista);
                for (Canciones cancion : canciones) {
                    mysql.insertarCancionListas(lista, cancion);
                }
                principal.getRegistrarLista().dispose();
                controller.actualizarTodo();
            } else {
                principal.mostrarError("Debe añadir almenos una cancion");
            }
        }
    }

    private void comprar() {
        int indice = principal.getjTableCancionesTienda().getSelectedRow();
        if (indice != -1) {
            Integer id = Integer.parseInt(principal.getjTableCancionesTienda().getValueAt(indice, 0).toString());
            Canciones cancion = controller.getCanciones().get(id);
            if (principal.mostrarConfirmacion("¿Desea comprar? :" + cancion.getNombre() + " $ " + cancion.getPrecio())) {
                boolean flag = false;
                for (Listas lista : controller.getListas().values()) {
                    if (lista.getUsuario() == controller.usuarioActual.getId()) {
                        if (lista.getNombre().equals("Compras")) {
                            if (!flag) {
                                mysql.insertarCancionListas(lista, cancion);
                                flag = true;
                            }
                        }
                    }
                }
                if (!flag) {
                    ArrayList<Canciones> canciones = new ArrayList<>();
                    canciones.add(cancion);
                    Listas list = new Listas(0, new Date(System.currentTimeMillis()), "Compras", canciones, controller.usuarioActual.getId());
                    mysql.insertarListas(list);
                    controller.actualizarTodo();
                    int idLista = ((Listas) controller.getListas().values().toArray()[controller.getListas().size() - 1]).getId();
                    list.setId(idLista);
                    mysql.insertarCancionListas(list, cancion);
                }
                controller.actualizarTodo();
            }
        } else {
            principal.mostrarError("Debe seleccionar al menos una cancion de la tabla");
        }
    }

    private void abrirVentanaCompra() {
        principal.getComprar().setSize(693, 472);
        principal.getComprar().setVisible(true);
    }

    private void añadirCancion() {

        int indice = principal.getjListCatalogoGeneralCancionesLista().getSelectedIndex();
        if (indice != -1) {
            principal.getjListCancionesLista().setModel(modelo);
            principal.getjListCatalogoGeneralCancionesLista().setModel(modeloGenero);
            Canciones cancion = (Canciones) modeloGenero.getElementAt(indice);
            modeloGenero.remove(indice);
            modelo.addElement(cancion);
        }
    }

    private void eliminarCancion() {

        int indice = principal.getjListCancionesLista().getSelectedIndex();
        if (indice != -1) {
            principal.getjListCancionesLista().setModel(modelo);
            principal.getjListCatalogoGeneralCancionesLista().setModel(modeloGenero);
            Canciones cancion = (Canciones) modelo.getElementAt(indice);
            modelo.remove(indice);
            modeloGenero.addElement(cancion);
        }
    }

    private void buscar() {
        if (controller.validarString(principal.getjTextFieldBuscarLista().getText())) {
            String busqueda = principal.getjTextFieldBuscarLista().getText();
            DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableListas().getModel();
            modeloTabla.setRowCount(0);
            for (Listas lista : controller.getListas().values()) {
                if (lista.getNombre().equals(busqueda)) {
                    modeloTabla.addRow(new Object[]{lista.getId(), lista.getNombre(),
                        lista.getFechaCreacion(), lista.getCanciones().size(), controller.getUsuarios().get(lista.getUsuario())
                    });
                }
            }
        } else {
            controller.actualizarListas();
        }
    }

}
