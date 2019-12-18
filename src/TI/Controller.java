/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.albumes.Albumes;
import BI.albumes.MysqlAlbumesDAO;
import BI.artistas.Artistas;
import BI.artistas.MysqlArtistasDAO;
import BI.canciones.Canciones;
import BI.canciones.MysqlCancionesDAO;
import BI.compositores.Compositores;
import BI.compositores.MysqlCompositoresDAO;
import BI.generos.Generos;
import BI.generos.MysqlGenerosDAO;
import BI.listas.Listas;
import BI.listas.MysqlListasDAO;
import BI.paises.MysqlPaisesDAO;
import BI.paises.Paises;
import BI.usuarios.MysqlUsuariosDAO;
import BI.usuarios.Usuarios;
import UI.Principal;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pardo
 */
public class Controller {

    private final Principal principal;

    private final MysqlCancionesDAO mysqlCanciones = new MysqlCancionesDAO();
    private final MysqlGenerosDAO mysqlGeneros = new MysqlGenerosDAO();
    private final MysqlPaisesDAO mysqlPaises = new MysqlPaisesDAO();
    private final MysqlArtistasDAO mysqlArtistas = new MysqlArtistasDAO();
    private final MysqlCompositoresDAO mysqlCompositores = new MysqlCompositoresDAO();
    private final MysqlAlbumesDAO mysqlAlbumes = new MysqlAlbumesDAO();
    private final MysqlUsuariosDAO mysqlUsuarios = new MysqlUsuariosDAO();
    private final MysqlListasDAO mysqlListasDAO = new MysqlListasDAO();

    private static HashMap<Integer, Canciones> canciones = new HashMap<>();
    private static HashMap<Integer, Albumes> albumes = new HashMap<>();
    private static HashMap<Integer, Artistas> artistas = new HashMap<>();
    private static HashMap<Integer, Compositores> compositores = new HashMap<>();
    private static HashMap<Integer, Generos> generos = new HashMap<>();
    private static HashMap<Integer, Paises> paises = new HashMap<>();
    private static HashMap<Integer, Usuarios> usuarios = new HashMap<>();
    private static HashMap<Integer, Listas> listas = new HashMap<>();

    static Usuarios usuarioActual;

    public Controller(Principal principal) {
        this.principal = principal;
    }

    boolean validarString(String string) {
        return !"".equals(string.replace(" ", ""));
    }

    boolean validarEntero(String string) {
        if (validarString(string)) {
            try {
                Integer.parseInt(string);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return false;
    }

    boolean validarDouble(String string) {
        if (validarString(string)) {
            try {
                Double.parseDouble(string);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return false;
    }

    boolean validarjTextFieldString(JTextField textfield) {
        if (validarString(textfield.getText())) {
            return true;
        } else {
            principal.mostrarError(textfield.getName() + " esta vacio");
            return false;
        }
    }

    boolean validarDate(JDateChooser date) {
        if (date.getDate() != null) {
            return true;
        } else {
            principal.mostrarError("No puede ser nulo :" + date.getName());
            return false;
        }
    }

    boolean validarTextFieldEntero(JTextField textfield) {
        if (validarEntero(textfield.getText())) {
            return true;
        } else {
            principal.mostrarError(textfield.getName() + " no es entero");
            return false;
        }
    }

    boolean validarTextFieldDouble(JTextField textfield) {
        if (validarDouble(textfield.getText())) {
            return true;
        } else {
            principal.mostrarError(textfield.getName() + " no es entero");
            return false;
        }
    }

    boolean validarTextArea(JTextArea textArea) {
        if (validarString(textArea.getText())) {
            return true;
        } else {
            principal.mostrarError(textArea.getName() + " No puede estar vacio");
            return false;
        }
    }

    public void actualizarTodo() {
        actualizarPaises();
        actualizarGeneros();
        actualizarArtistas();
        actualizarCompositores();
        actualizarAlbumes();
        actualizarCanciones();
        actualizarUsuarios();
        actualizarListas();
    }

    void actualizarCanciones() {
        canciones = mysqlCanciones.listarCanciones();
        DefaultListModel<Object> modeloLista = new DefaultListModel<>();
        DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableCanciones().getModel();
        DefaultTableModel modeloTablaCompra = (DefaultTableModel) principal.getjTableCancionesTienda().getModel();
        modeloTablaCompra.setRowCount(0);
        modeloTabla.setRowCount(0);
        for (Canciones cancion : canciones.values()) {
            if (Integer.parseInt(cancion.getAlbum().toString()) == 0) {
                modeloLista.addElement(cancion);
            }
            modeloTabla.addRow(new Object[]{cancion.getId(), cancion.getNombre(), artistas.get(cancion.getArtista()),
                generos.get(cancion.getGenero()), compositores.get(cancion.getCompositor()), cancion.getFechaLanzamiento(),
                albumes.get(cancion.getAlbum())});
            if (cancion.getPrecio() != 0) {
                modeloTablaCompra.addRow(new Object[]{cancion.getId(), cancion.getNombre(), artistas.get(cancion.getArtista()),
                    generos.get(cancion.getGenero()), compositores.get(cancion.getCompositor()), cancion.getFechaLanzamiento(),
                    albumes.get(cancion.getAlbum()), cancion.getCalificacion(), cancion.getPrecio()});
            }
        }

        principal.getjListCatalogoGeneralCancionesLista().setModel(modeloLista);
        principal.getjListCatalogoGeneralAlbum().setModel(modeloLista);

    }

    public HashMap<Integer, Usuarios> getUsuarios() {
        return usuarios;
    }

    public HashMap<Integer, Listas> getListas() {
        return listas;
    }

    void actualizarGeneros() {
        generos = mysqlGeneros.listarGeneros();

        DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableGeneros().getModel();
        DefaultComboBoxModel<Object> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.removeAllElements();
        modeloTabla.setRowCount(0);
        for (Generos genero : generos.values()) {
            modeloCombo.addElement(genero);
            modeloTabla.addRow(new Object[]{genero.getId(), genero.getNombre(), genero.getDescipcion()});
        }
        principal.getjComboBoxGeneroArtista().setModel(modeloCombo);
        principal.getjComboBoxGeneroCancion().setModel(modeloCombo);
        principal.getjTableGeneros().setModel(modeloTabla);
    }

    void actualizarArtistas() {
        artistas = mysqlArtistas.listarArtistas();
        DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableArtistas().getModel();
        DefaultComboBoxModel<Object> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.removeAllElements();
        modeloTabla.setRowCount(0);
        for (Artistas artista : artistas.values()) {
            modeloCombo.addElement(artista);
            int edad = calcularEdad(artista.getFechaNacimiento(), artista.getFechaDefuncion());
            modeloTabla.addRow(new Object[]{artista.getId(),
                artista.getNombreArtistico(), artista.getPrimerNombre() + " " + artista.getSegundoNombre(),
                artista.getPrimerApellido() + " " + artista.getSegundoApellido(), edad, artista.getFechaNacimiento()
                + " - " + artista.getFechaDefuncion(), paises.get(artista.getPais()), artista.getDescripcion(),
                generos.get(artista.getGenero())
            });
        }
        principal.getjComboBoxArtistaCancion().setModel(modeloCombo);
        principal.getjTableArtistas().setModel(modeloTabla);
    }

    void actualizarPaises() {
        paises = mysqlPaises.listarPaises();
        DefaultComboBoxModel<Object> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.removeAllElements();

        for (Paises pais : paises.values()) {
            modeloCombo.addElement(pais);
        }
        principal.getjComboBoxPaisUsuario().setModel(modeloCombo);
        principal.getjComboBoxPaisCompositor().setModel(modeloCombo);
        principal.getjComboBoxPaisArtista().setModel(modeloCombo);
    }

    void actualizarCompositores() {
        compositores = mysqlCompositores.listarCompositores();
        DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableCompositores().getModel();
        DefaultComboBoxModel<Object> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.removeAllElements();;
        modeloTabla.setRowCount(0);
        for (Compositores compositor : compositores.values()) {
            modeloTabla.addRow(new Object[]{compositor.getId(),
                compositor.getPrimerNombre() + " " + compositor.getSegundoNombre(),
                compositor.getPrimerApellido() + " " + compositor.getSegundoApellido(), paises.get(compositor.getPais())
            });
            modeloCombo.addElement(compositor);
        }
        principal.getjComboBoxCompositorCancion().setModel(modeloCombo);
        principal.getjTableCompositores().setModel(modeloTabla);
    }

    void actualizarAlbumes() {
        albumes = mysqlAlbumes.listarAlbumes();
        DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableAlbumes().getModel();
        DefaultComboBoxModel<Object> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.removeAllElements();
        modeloTabla.setRowCount(0);
        for (Albumes album : albumes.values()) {
            modeloTabla.addRow(new Object[]{album.getId(),
                album.getNombre(), album.getFechaLanzamiento()
            });
            modeloCombo.addElement(album);
        }

        principal.getjTableAlbumes().setModel(modeloTabla);
        principal.getjComboBoxAlbumCancion().setModel(modeloCombo);
        principal.getjComboBoxAlbumCancion().setSelectedItem(null);
    }

    void actualizarUsuarios() {
        usuarios = mysqlUsuarios.listarUsuario();
        DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableUsuarios().getModel();
        modeloTabla.setRowCount(0);
        for (Usuarios usuario : usuarios.values()) {
            modeloTabla.addRow(new Object[]{usuario.getId(),
                usuario.getPrimerNombre() + " " + usuario.getSegundoNombre(),
                usuario.getPrimerApellido() + " " + usuario.getSegundoApellido(), usuario.getEdad(), usuario.getUsuario(),
                paises.get(usuario.getPais()), usuario.getCorreo()
            });
        }
        principal.getjTableUsuarios().setModel(modeloTabla);
    }

    void actualizarListas() {
        listas = mysqlListasDAO.listarListas();
        DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableListas().getModel();
        modeloTabla.setRowCount(0);
        for (Listas lista : listas.values()) {
            if (usuarioActual != null) {
                modeloTabla.addRow(new Object[]{lista.getId(),lista.getNombre(),
                    lista.getFechaCreacion(), lista.getCanciones().size(), usuarios.get(lista.getUsuario())
                });
            }
        }
        principal.getjTableListas().setModel(modeloTabla);
    }

    public void limpiar(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setText("");
            } else if (c instanceof Container) {
                limpiar((Container) c);
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setText("");
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(0);
            }
        }
    }

    public ArrayList<Canciones> getCancionesAlbum(Albumes album) {
        ArrayList<Canciones> cancionesAlbumes = new ArrayList<>();
        for (Canciones cancion : canciones.values()) {
            if (cancion.getAlbum() != null) {
                if (Integer.parseInt(cancion.getAlbum().toString()) == album.getId()) {
                    cancionesAlbumes.add(cancion);
                }
            }
        }
        return cancionesAlbumes;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public MysqlCancionesDAO getMysqlCanciones() {
        return mysqlCanciones;
    }

    public MysqlGenerosDAO getMysqlGeneros() {
        return mysqlGeneros;
    }

    public MysqlPaisesDAO getMysqlPaises() {
        return mysqlPaises;
    }

    public HashMap<Integer, Canciones> getCanciones() {
        return canciones;
    }

    public HashMap<Integer, Albumes> getAlbumes() {
        return albumes;
    }

    public HashMap<Integer, Artistas> getArtistas() {
        return artistas;
    }

    public HashMap<Integer, Compositores> getCompositores() {
        return compositores;
    }

    public HashMap<Integer, Generos> getGeneros() {
        return generos;
    }

    public HashMap<Integer, Paises> getPaises() {
        return paises;
    }

    int calcularEdad(Date fechaNacimiento, Date fechaDefuncion) {
        long a = fechaNacimiento.getTime();
        long b = System.currentTimeMillis();
        if (fechaDefuncion != null) {
            b = fechaDefuncion.getTime();
        }
        return (int) Math.round((b - a) * 3.17098e-11);
    }

}
