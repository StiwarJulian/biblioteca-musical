/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BI.logger.Log;
import TI.AlbumesController;
import TI.ArtistasController;
import TI.CancionesController;
import TI.CompositoresController;
import TI.Controller;
import TI.GenerosController;
import TI.ListasController;
import TI.ReproduccionController;
import TI.UsuariosController;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Pardo
 */
public class Principal extends javax.swing.JFrame {

    CancionesController cancionController = new CancionesController(this);
    AlbumesController albumesController = new AlbumesController(this);
    GenerosController generosController = new GenerosController(this);
    CompositoresController compositoresController = new CompositoresController(this);
    ArtistasController artistaController = new ArtistasController(this);
    UsuariosController usuarioControllers = new UsuariosController(this);
    ListasController listasController = new ListasController(this);
    ReproduccionController reproduccionController = new ReproduccionController(this);

    public JTextField getjTextFieldBuscarLista() {
        return jTextFieldBuscarLista;
    }

    public JTextField getjTextFieldBuscarUsuario() {
        return jTextFieldBuscarUsuario;
    }

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();       
    }

    public CompositoresController getCompositoresController() {
        return compositoresController;
    }

    public JTextField getjTextFieldBusquedaGenero() {
        return jTextFieldBusquedaGenero;
    }

    public JButton getjButtonRegistrarUsuario() {
        return jButtonRegistrarUsuario;
    }

    public JTextField getjTextFieldBuscarCompositores() {
        return jTextFieldBuscarCompositores;
    }

    public JTextField getjTextFieldBuscarAlbum() {
        return jTextFieldBuscarAlbum;
    }

    public JTextField getjTextFieldBusquedaArtistas() {
        return jTextFieldBusquedaArtistas;
    }

    public JComboBox<String> getjComboBoxBusquedaArtista() {
        return jComboBoxBusquedaArtista;
    }

    public JComboBox<String> getjComboBoxBusquedaCancion() {
        return jComboBoxBusquedaCancion;
    }

    public JTextField getjTextFieldBuscarCancion() {
        return jTextFieldBuscarCancion;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        RegistrarUsuario = new javax.swing.JFrame();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jTextFieldPrimerNombreUsuario = new javax.swing.JTextField();
        jTextFieldSegundNombreUsuario = new javax.swing.JTextField();
        jTextFieldEdadUsuario = new javax.swing.JTextField();
        jTextFieldIdentificacionUsuario = new javax.swing.JTextField();
        jTextFieldCorreoElectronico = new javax.swing.JTextField();
        jLabelAvatarRegistrarUsuario = new javax.swing.JLabel();
        jButtonSeleccionarAvatarUsuario = new javax.swing.JButton();
        jPasswordFieldClaveUsuario = new javax.swing.JPasswordField();
        jButtonGuardarUsuario = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jComboBoxPaisUsuario = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldPrimerApellidoUsuario = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextFieldSegundoApellidoUsuario = new javax.swing.JTextField();
        jCheckBoxSerAdministradorUsuario = new javax.swing.JCheckBox();
        RegistrarAlbum = new javax.swing.JFrame();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldNombreAlbum = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabelCaratulaAlbumRegistrar = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListCancionesAlbum = new javax.swing.JList<>();
        jLabel38 = new javax.swing.JLabel();
        jButtonSeleccionarCaratulaAlbum = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListCatalogoGeneralAlbum = new javax.swing.JList<>();
        jButtonAñadir = new javax.swing.JButton();
        jButtonQuitar = new javax.swing.JButton();
        jButtonGuardarAlbum = new javax.swing.JButton();
        jDateChooserFechaLanzamientoAlbum = new com.toedter.calendar.JDateChooser();
        RegistrarLista = new javax.swing.JFrame();
        jLabel40 = new javax.swing.JLabel();
        jTextFieldNombreLista = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        jListCancionesLista = new javax.swing.JList<>();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jListCatalogoGeneralCancionesLista = new javax.swing.JList<>();
        jButtonAñadirListaCanciones = new javax.swing.JButton();
        jButtonQuitarListaCancion = new javax.swing.JButton();
        jButtonGuardarLista = new javax.swing.JButton();
        RegistrarArtista = new javax.swing.JFrame();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextFieldNombreArtisticoArtista = new javax.swing.JTextField();
        jTextFieldPrimerNombreArtista = new javax.swing.JTextField();
        jTextFieldSegundoNombreArtista = new javax.swing.JTextField();
        jButtonGuardarArtista = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jComboBoxPaisArtista = new javax.swing.JComboBox<>();
        jDateChooserFechaNacimientoArtista = new com.toedter.calendar.JDateChooser();
        jDateChooserFechaDefuncionArtista = new com.toedter.calendar.JDateChooser();
        jComboBoxGeneroArtista = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextAreaDescripcionArtista = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jTextFieldPrimerApellidoArtista = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextFieldSegundoApellidoArtista = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        RegistrarCancion = new javax.swing.JFrame();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jDateChooserFechaLanzamientoCancion = new com.toedter.calendar.JDateChooser();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jSpinnerCalificacionCancion = new javax.swing.JSpinner();
        jComboBoxAlbumCancion = new javax.swing.JComboBox<>();
        jComboBoxCompositorCancion = new javax.swing.JComboBox<>();
        jComboBoxArtistaCancion = new javax.swing.JComboBox<>();
        jComboBoxGeneroCancion = new javax.swing.JComboBox<>();
        jTextFieldNombreCancion = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jTextFieldURL = new javax.swing.JTextField();
        jButtonSeleccionar = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        AbrirRegistrarAlbumCancion = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jLabelPrecioCancion = new javax.swing.JLabel();
        jTextFieldPrecioCancion = new javax.swing.JTextField();
        jButtonGuardarCancion = new javax.swing.JButton();
        RegistrarCompositor = new javax.swing.JFrame();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jTextFieldPrimerApellidoCompositor = new javax.swing.JTextField();
        jTextFieldSegundoNombreCompositor = new javax.swing.JTextField();
        jTextFieldEdadCompositor = new javax.swing.JTextField();
        jButtonGuardarCompositor = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jComboBoxPaisCompositor = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jTextFieldPrimerNombreCompositor = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jTextFieldSegundoApellidoCompositor = new javax.swing.JTextField();
        RegistrarGenero = new javax.swing.JFrame();
        jLabel68 = new javax.swing.JLabel();
        jTextFieldNombreGenero = new javax.swing.JTextField();
        jButtonGuardarGenero = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextAreaDescripcionGenero = new javax.swing.JTextArea();
        Comprar = new javax.swing.JFrame();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTableCancionesTienda = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        jButtonGuardarCompraCancion = new javax.swing.JButton();
        Reproductor = new javax.swing.JFrame();
        jPanelInicioSesion = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextFieldUsuarioInicioSesion = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jPasswordFieldClaveInicioSesion = new javax.swing.JPasswordField();
        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonRegistrarUsuarioSesion = new javax.swing.JButton();
        jButtonRegistrarUsuarioSesion1 = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableColaReproduccion = new javax.swing.JTable();
        jButtonReproducirCancion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGeneros = new javax.swing.JTable();
        jButtonEliminarGenero = new javax.swing.JButton();
        jButtonRegistrarGenero = new javax.swing.JButton();
        jButtonModificarGenero = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBusquedaGenero = new javax.swing.JTextField();
        jButtonBuscarGenero = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableAlbumes = new javax.swing.JTable();
        jButtonAñadirAlbumCola = new javax.swing.JButton();
        jButtonRegistrarAlbum = new javax.swing.JButton();
        jButtonBuscarAlbum = new javax.swing.JButton();
        jTextFieldBuscarAlbum = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableArtistas = new javax.swing.JTable();
        jButtonEliminarArtista = new javax.swing.JButton();
        jButtonRegistrarArtista = new javax.swing.JButton();
        jButtonModificarArtista = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldBusquedaArtistas = new javax.swing.JTextField();
        jComboBoxBusquedaArtista = new javax.swing.JComboBox<>();
        jButtonBusquedaArtista = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableCompositores = new javax.swing.JTable();
        jButtonEliminarCompositor = new javax.swing.JButton();
        jButtonRegistrarCompositor = new javax.swing.JButton();
        jButtonModificarCompositor = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldBuscarCompositores = new javax.swing.JTextField();
        jButtonBuscarCompositores = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTableCanciones = new javax.swing.JTable();
        jTextFieldBuscarCancion = new javax.swing.JTextField();
        jComboBoxBusquedaCancion = new javax.swing.JComboBox<>();
        jButtonAbrirRegistrarCancion = new javax.swing.JButton();
        jButtonComprarCancion = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jButtonBuscarCancion = new javax.swing.JButton();
        jButtonAñadirCancionCola = new javax.swing.JButton();
        jPanelUsuarios = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonRegistrarUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBuscarUsuario = new javax.swing.JTextField();
        jButtonBuscarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTableListas = new javax.swing.JTable();
        jButtonRegistrarLista = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButtonAñadirListaCola = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldBuscarLista = new javax.swing.JTextField();
        jButtonBuscarLista = new javax.swing.JButton();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jLabelAvatarUsuario = new javax.swing.JLabel();
        jButtonModificarUsuario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonPausar = new javax.swing.JButton();
        jButtonResumir = new javax.swing.JButton();
        jButtonDetener = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        RegistrarUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RegistrarUsuario.setTitle("Registrar usuario");
        RegistrarUsuario.setResizable(false);
        RegistrarUsuario.getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel22.setText("Primer nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 62, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel22, gridBagConstraints);

        jLabel23.setText("Segundo nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 62, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel23, gridBagConstraints);

        jLabel24.setText("Nombre usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 10, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel24, gridBagConstraints);

        jLabel25.setText("Edad (+18)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 62, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel25, gridBagConstraints);

        jLabel26.setText("Identificacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 62, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel26, gridBagConstraints);

        jLabel27.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel27, gridBagConstraints);

        jLabel28.setText("Correo electrónico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel28, gridBagConstraints);

        jLabel29.setText("Avatar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 62, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel29, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 5, 0, 0);
        RegistrarUsuario.getContentPane().add(jTextFieldNombreUsuario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 26, 0, 14);
        RegistrarUsuario.getContentPane().add(jTextFieldPrimerNombreUsuario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 14);
        RegistrarUsuario.getContentPane().add(jTextFieldSegundNombreUsuario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 14);
        RegistrarUsuario.getContentPane().add(jTextFieldEdadUsuario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 14);
        RegistrarUsuario.getContentPane().add(jTextFieldIdentificacionUsuario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 142;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        RegistrarUsuario.getContentPane().add(jTextFieldCorreoElectronico, gridBagConstraints);

        jLabelAvatarRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/default_small.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabelAvatarRegistrarUsuario, gridBagConstraints);

        jButtonSeleccionarAvatarUsuario.setText("Seleccionar");
        jButtonSeleccionarAvatarUsuario.addMouseListener(usuarioControllers);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 26, 0, 0);
        RegistrarUsuario.getContentPane().add(jButtonSeleccionarAvatarUsuario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 142;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        RegistrarUsuario.getContentPane().add(jPasswordFieldClaveUsuario, gridBagConstraints);

        jButtonGuardarUsuario.setText("Guardar");
        jButtonGuardarUsuario.addMouseListener(usuarioControllers);
        jButtonGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 10, 0, 0);
        RegistrarUsuario.getContentPane().add(jButtonGuardarUsuario, gridBagConstraints);

        jLabel31.setText("País");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel31, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 4, 0, 0);
        RegistrarUsuario.getContentPane().add(jComboBoxPaisUsuario, gridBagConstraints);

        jLabel32.setText("Primer Apellido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel32, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        RegistrarUsuario.getContentPane().add(jTextFieldPrimerApellidoUsuario, gridBagConstraints);

        jLabel33.setText("Segundo apellido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        RegistrarUsuario.getContentPane().add(jLabel33, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 143;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 3, 0, 0);
        RegistrarUsuario.getContentPane().add(jTextFieldSegundoApellidoUsuario, gridBagConstraints);

        jCheckBoxSerAdministradorUsuario.setText("¿Es administrador?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 5, 0, 0);
        RegistrarUsuario.getContentPane().add(jCheckBoxSerAdministradorUsuario, gridBagConstraints);

        RegistrarAlbum.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RegistrarAlbum.setTitle("Registrar Album");
        RegistrarAlbum.setResizable(false);

        jLabel34.setText("Nombre");

        jLabel35.setText("Fecha lanzamiento");

        jLabel36.setText("Caratula");

        jLabelCaratulaAlbumRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/default_big.png"))); // NOI18N

        jScrollPane5.setViewportView(jListCancionesAlbum);

        jLabel38.setText("Canciones album");

        jButtonSeleccionarCaratulaAlbum.setText("Seleccionar");
        jButtonSeleccionarCaratulaAlbum.addMouseListener(albumesController);

        jLabel39.setText("Catalogo general");

        jScrollPane6.setViewportView(jListCatalogoGeneralAlbum);

        jButtonAñadir.setText("<-");
        jButtonAñadir.setActionCommand("añadir");
        jButtonAñadir.addMouseListener(albumesController);

        jButtonQuitar.setText("->");
        jButtonQuitar.setActionCommand("quitar");
        jButtonQuitar.addMouseListener(albumesController);

        jButtonGuardarAlbum.setText("Guardar");
        jButtonGuardarAlbum.addMouseListener(albumesController);

        javax.swing.GroupLayout RegistrarAlbumLayout = new javax.swing.GroupLayout(RegistrarAlbum.getContentPane());
        RegistrarAlbum.getContentPane().setLayout(RegistrarAlbumLayout);
        RegistrarAlbumLayout.setHorizontalGroup(
            RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                        .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                                .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                                        .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel35))
                                        .addGap(35, 35, 35)
                                        .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNombreAlbum)
                                            .addComponent(jDateChooserFechaLanzamientoAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                                    .addComponent(jLabel38))
                                .addGap(23, 23, 23))
                            .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                                .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAñadir)
                                    .addComponent(jButtonQuitar))
                                .addGap(26, 26, 26)))
                        .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(28, 28, 28)
                                .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSeleccionarCaratulaAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCaratulaAlbumRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                        .addComponent(jButtonGuardarAlbum)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        RegistrarAlbumLayout.setVerticalGroup(
            RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCaratulaAlbumRegistrar)
                    .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                        .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jTextFieldNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jDateChooserFechaLanzamientoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSeleccionarCaratulaAlbum)
                .addGap(18, 18, 18)
                .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addGroup(RegistrarAlbumLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButtonAñadir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonQuitar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardarAlbum))
        );

        RegistrarLista.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RegistrarLista.setTitle("Registrar lista");
        RegistrarLista.setResizable(false);

        jLabel40.setText("Nombre");

        jScrollPane17.setViewportView(jListCancionesLista);

        jLabel41.setText("Canciones lista");

        jLabel42.setText("Catalogo general");

        jScrollPane18.setViewportView(jListCatalogoGeneralCancionesLista);

        jButtonAñadirListaCanciones.setText("<-");
        jButtonAñadirListaCanciones.addMouseListener(listasController);

        jButtonQuitarListaCancion.setText("->");
        jButtonQuitarListaCancion.addMouseListener(listasController);

        jButtonGuardarLista.setText("Guardar");
        jButtonGuardarLista.addMouseListener(listasController);

        javax.swing.GroupLayout RegistrarListaLayout = new javax.swing.GroupLayout(RegistrarLista.getContentPane());
        RegistrarLista.getContentPane().setLayout(RegistrarListaLayout);
        RegistrarListaLayout.setHorizontalGroup(
            RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarListaLayout.createSequentialGroup()
                        .addGroup(RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarListaLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(190, 227, Short.MAX_VALUE))
                            .addGroup(RegistrarListaLayout.createSequentialGroup()
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAñadirListaCanciones)
                                    .addComponent(jButtonQuitarListaCancion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegistrarListaLayout.createSequentialGroup()
                        .addComponent(jButtonGuardarLista)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(RegistrarListaLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNombreLista)))
                .addGap(23, 23, 23))
        );
        RegistrarListaLayout.setVerticalGroup(
            RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextFieldNombreLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGroup(RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarListaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane18)
                            .addComponent(jScrollPane17))
                        .addGap(18, 18, 18))
                    .addGroup(RegistrarListaLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButtonAñadirListaCanciones)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonQuitarListaCancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)))
                .addComponent(jButtonGuardarLista))
        );

        RegistrarArtista.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RegistrarArtista.setTitle("Registrar artista");
        RegistrarArtista.setResizable(false);

        jLabel43.setText("Primer nombre");

        jLabel44.setText("Segundo nombre");

        jLabel45.setText("Nombre artistico");

        jLabel46.setText("Fecha defuncion");

        jLabel47.setText("Genero");

        jLabel48.setText("Fecha nacimiento");

        jButtonGuardarArtista.setText("Guardar");
        jButtonGuardarArtista.addMouseListener(artistaController);

        jLabel49.setText("País");

        jLabel50.setText("Descripcion");

        jTextAreaDescripcionArtista.setColumns(20);
        jTextAreaDescripcionArtista.setRows(5);
        jScrollPane19.setViewportView(jTextAreaDescripcionArtista);

        jLabel51.setText("Primer apellido");

        jLabel52.setText("Segundo apellido");

        jButton7.setText("Nuevo");
        jButton7.setActionCommand("abrirRegistrar");
        jButton7.addMouseListener(generosController);

        javax.swing.GroupLayout RegistrarArtistaLayout = new javax.swing.GroupLayout(RegistrarArtista.getContentPane());
        RegistrarArtista.getContentPane().setLayout(RegistrarArtistaLayout);
        RegistrarArtistaLayout.setHorizontalGroup(
            RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jButton7))
            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel48)
                .addGap(4, 4, 4)
                .addComponent(jDateChooserFechaNacimientoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarArtista))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                            .addComponent(jLabel45)
                            .addGap(10, 10, 10)
                            .addComponent(jTextFieldNombreArtisticoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jLabel43)
                            .addGap(23, 23, 23)
                            .addComponent(jTextFieldPrimerNombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addGap(19, 19, 19)
                                .addComponent(jTextFieldPrimerApellidoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel44)
                                .addGap(11, 11, 11)
                                .addComponent(jTextFieldSegundoNombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                    .addComponent(jLabel52)
                                    .addGap(7, 7, 7)
                                    .addComponent(jTextFieldSegundoApellidoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel46)
                                    .addGap(15, 15, 15)
                                    .addComponent(jDateChooserFechaDefuncionArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                    .addComponent(jLabel47)
                                    .addGap(53, 53, 53)
                                    .addComponent(jComboBoxGeneroArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel49)
                                    .addGap(75, 75, 75)
                                    .addComponent(jComboBoxPaisArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        RegistrarArtistaLayout.setVerticalGroup(
            RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreArtisticoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrimerNombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel43))))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel51))
                            .addComponent(jTextFieldPrimerApellidoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel44))
                            .addComponent(jTextFieldSegundoNombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel52))
                            .addComponent(jTextFieldSegundoApellidoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addComponent(jDateChooserFechaDefuncionArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel47))
                            .addComponent(jComboBoxGeneroArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel49))))
                    .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jComboBoxPaisArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton7)
                        .addGap(6, 6, 6)
                        .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserFechaNacimientoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addGap(145, 145, 145))
                            .addGroup(RegistrarArtistaLayout.createSequentialGroup()
                                .addComponent(jScrollPane19)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarArtistaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardarArtista)
                        .addContainerGap())))
        );

        RegistrarCancion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RegistrarCancion.setTitle("Registrar cancion");
        RegistrarCancion.setResizable(false);

        jLabel53.setText("Nombre");

        jLabel54.setText("Genero");

        jLabel55.setText("Artista");

        jLabel56.setText("Compositor");

        jLabel57.setText("Fecha Lanzamiento");

        jLabel58.setText("Album");

        jLabel59.setText("Calificacion");

        jSpinnerCalificacionCancion.setModel(new javax.swing.SpinnerNumberModel(5, 1, 5, 1));
        jSpinnerCalificacionCancion.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinnerCalificacionCancion, ""));

        jLabel60.setText("URL");

        jTextFieldURL.setEditable(false);

        jButtonSeleccionar.setText("Seleccionar");
        jButtonSeleccionar.setActionCommand("Mover");
        jButtonSeleccionar.addMouseListener(cancionController);

        jButton30.setText("Nuevo");
        jButton30.setActionCommand("AbrirRegistrar");
        jButton30.addMouseListener(compositoresController);

        jButton31.setText("Nuevo");
        jButton31.setActionCommand("AbrirRegistrar");
        jButton31.addMouseListener(generosController);

        AbrirRegistrarAlbumCancion.setText("Nuevo");
        AbrirRegistrarAlbumCancion.setActionCommand("AbrirRegistrar");
        AbrirRegistrarAlbumCancion.addMouseListener(albumesController);

        jButton46.setText("Nuevo");
        jButton46.setActionCommand("AbrirRegistrar");
        jButton46.addMouseListener(artistaController);

        jLabelPrecioCancion.setText("Precio");

        jButtonGuardarCancion.setText("Guardar");
        jButtonGuardarCancion.addMouseListener(cancionController);

        javax.swing.GroupLayout RegistrarCancionLayout = new javax.swing.GroupLayout(RegistrarCancion.getContentPane());
        RegistrarCancion.getContentPane().setLayout(RegistrarCancionLayout);
        RegistrarCancionLayout.setHorizontalGroup(
            RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(jButton31))
            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(AbrirRegistrarAlbumCancion))
            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel59)
                .addGap(43, 43, 43)
                .addComponent(jSpinnerCalificacionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(jLabel60)
                .addGap(69, 69, 69)
                .addComponent(jTextFieldURL, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                .addGap(559, 559, 559)
                .addComponent(jButtonSeleccionar))
            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegistrarCancionLayout.createSequentialGroup()
                        .addComponent(jLabelPrecioCancion)
                        .addGap(67, 67, 67)
                        .addComponent(jTextFieldPrecioCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(RegistrarCancionLayout.createSequentialGroup()
                            .addComponent(jLabel53)
                            .addGap(59, 59, 59)
                            .addComponent(jTextFieldNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton30)
                            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(42, 42, 42)
                                .addComponent(jComboBoxCompositorCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserFechaLanzamientoCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarCancionLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(59, 59, 59)
                                .addComponent(jComboBoxAlbumCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(56, 56, 56)
                                .addComponent(jComboBoxArtistaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(RegistrarCancionLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jButton46))
                    .addGroup(RegistrarCancionLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel54)
                        .addGap(53, 53, 53)
                        .addComponent(jComboBoxGeneroCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGuardarCancion))
        );
        RegistrarCancionLayout.setVerticalGroup(
            RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarCancionLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGeneroCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistrarCancionLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54))))
                .addGap(8, 8, 8)
                .addComponent(jButton31)
                .addGap(11, 11, 11)
                .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarCancionLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel56))
                    .addComponent(jComboBoxCompositorCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(jComboBoxArtistaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30)
                    .addComponent(jButton46))
                .addGap(18, 18, 18)
                .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jDateChooserFechaLanzamientoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(jComboBoxAlbumCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(AbrirRegistrarAlbumCancion)
                .addGap(11, 11, 11)
                .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerCalificacionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistrarCancionLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60))))
                .addGap(6, 6, 6)
                .addComponent(jButtonSeleccionar)
                .addGap(10, 10, 10)
                .addGroup(RegistrarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarCancionLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelPrecioCancion))
                    .addComponent(jTextFieldPrecioCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGuardarCancion)
                .addContainerGap())
        );

        RegistrarCompositor.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RegistrarCompositor.setTitle("Registrar compositor");
        RegistrarCompositor.setResizable(false);

        jLabel61.setText("Primer apellido");

        jLabel62.setText("Segundo nombre");

        jLabel63.setText("Edad");

        jButtonGuardarCompositor.setText("Guardar");
        jButtonGuardarCompositor.addMouseListener(compositoresController);

        jLabel65.setText("País");

        jLabel66.setText("Primer nombre");

        jLabel67.setText("Segundo apellido");

        javax.swing.GroupLayout RegistrarCompositorLayout = new javax.swing.GroupLayout(RegistrarCompositor.getContentPane());
        RegistrarCompositor.getContentPane().setLayout(RegistrarCompositorLayout);
        RegistrarCompositorLayout.setHorizontalGroup(
            RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarCompositorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarCompositorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarCompositor))
                    .addGroup(RegistrarCompositorLayout.createSequentialGroup()
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarCompositorLayout.createSequentialGroup()
                                    .addComponent(jLabel66)
                                    .addGap(27, 27, 27))
                                .addGroup(RegistrarCompositorLayout.createSequentialGroup()
                                    .addComponent(jLabel67)
                                    .addGap(15, 15, 15)))
                            .addGroup(RegistrarCompositorLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(90, 90, 90)))
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEdadCompositor, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jTextFieldSegundoApellidoCompositor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPrimerNombreCompositor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(66, 66, 66)
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel65))
                        .addGap(11, 11, 11)
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPaisCompositor, 0, 148, Short.MAX_VALUE)
                            .addComponent(jTextFieldSegundoNombreCompositor, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrimerApellidoCompositor))))
                .addContainerGap())
        );
        RegistrarCompositorLayout.setVerticalGroup(
            RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarCompositorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarCompositorLayout.createSequentialGroup()
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jTextFieldPrimerApellidoCompositor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(jTextFieldSegundoNombreCompositor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(jComboBoxPaisCompositor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegistrarCompositorLayout.createSequentialGroup()
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jTextFieldPrimerNombreCompositor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jTextFieldSegundoApellidoCompositor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarCompositorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jTextFieldEdadCompositor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonGuardarCompositor)
                .addContainerGap())
        );

        RegistrarGenero.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RegistrarGenero.setTitle("Registrar genero");
        RegistrarGenero.setResizable(false);

        jLabel68.setText("Nombre");

        jButtonGuardarGenero.setText("Guardar");
        jButtonGuardarGenero.addMouseListener(generosController);

        jLabel69.setText("Descripcion");

        jTextAreaDescripcionGenero.setColumns(20);
        jTextAreaDescripcionGenero.setLineWrap(true);
        jTextAreaDescripcionGenero.setRows(5);
        jTextAreaDescripcionGenero.setWrapStyleWord(true);
        jScrollPane20.setViewportView(jTextAreaDescripcionGenero);

        javax.swing.GroupLayout RegistrarGeneroLayout = new javax.swing.GroupLayout(RegistrarGenero.getContentPane());
        RegistrarGenero.getContentPane().setLayout(RegistrarGeneroLayout);
        RegistrarGeneroLayout.setHorizontalGroup(
            RegistrarGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarGeneroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextFieldNombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(RegistrarGeneroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(RegistrarGeneroLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButtonGuardarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RegistrarGeneroLayout.setVerticalGroup(
            RegistrarGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarGeneroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(RegistrarGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarGeneroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel68))
                    .addComponent(jTextFieldNombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(RegistrarGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addGroup(RegistrarGeneroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jButtonGuardarGenero))
        );

        Comprar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Comprar.setResizable(false);

        jTableCancionesTienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Artista", "Genero", "Fecha", "Album", "Calificacion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane21.setViewportView(jTableCancionesTienda);

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Canciones en la tienda");

        jButtonGuardarCompraCancion.setText("Comprar");
        jButtonGuardarCompraCancion.addMouseListener(listasController);

        javax.swing.GroupLayout ComprarLayout = new javax.swing.GroupLayout(Comprar.getContentPane());
        Comprar.getContentPane().setLayout(ComprarLayout);
        ComprarLayout.setHorizontalGroup(
            ComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ComprarLayout.createSequentialGroup()
                .addComponent(jButtonGuardarCompraCancion)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ComprarLayout.setVerticalGroup(
            ComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComprarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonGuardarCompraCancion)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout ReproductorLayout = new javax.swing.GroupLayout(Reproductor.getContentPane());
        Reproductor.getContentPane().setLayout(ReproductorLayout);
        ReproductorLayout.setHorizontalGroup(
            ReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ReproductorLayout.setVerticalGroup(
            ReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanelInicioSesion.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("INICIO DE SESION");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setText("USUARIO");

        jTextFieldUsuarioInicioSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setText("CLAVE");

        jPasswordFieldClaveInicioSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonIniciarSesion.setText("INICIAR");
        jButtonIniciarSesion.setActionCommand("IniciarSesion");
        jButtonIniciarSesion.addMouseListener(usuarioControllers);

        jButtonRegistrarUsuarioSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegistrarUsuarioSesion.setText("REGISTRAR");
        jButtonRegistrarUsuarioSesion.setActionCommand("AbrirRegistrar");
        jButtonRegistrarUsuarioSesion.addMouseListener(usuarioControllers);

        jButtonRegistrarUsuarioSesion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegistrarUsuarioSesion1.setText("RECUPERAR");
        jButtonRegistrarUsuarioSesion1.setActionCommand("Recuperar");
        jButtonRegistrarUsuarioSesion1.addMouseListener(usuarioControllers);

        javax.swing.GroupLayout jPanelInicioSesionLayout = new javax.swing.GroupLayout(jPanelInicioSesion);
        jPanelInicioSesion.setLayout(jPanelInicioSesionLayout);
        jPanelInicioSesionLayout.setHorizontalGroup(
            jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                                .addComponent(jButtonRegistrarUsuarioSesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(jButtonIniciarSesion))
                            .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                                        .addComponent(jLabel72)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUsuarioInicioSesion)
                                    .addComponent(jPasswordFieldClaveInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRegistrarUsuarioSesion1))
                    .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanelInicioSesionLayout.setVerticalGroup(
            jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel12)
                .addGap(39, 39, 39)
                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jTextFieldUsuarioInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jPasswordFieldClaveInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarUsuarioSesion1))
                .addGap(36, 36, 36)
                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIniciarSesion)
                    .addComponent(jButtonRegistrarUsuarioSesion))
                .addGap(313, 313, 313))
        );

        getContentPane().add(jPanelInicioSesion, "card2");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cola de reproducción");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 850, -1));

        jTableColaReproduccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cancion", "Artista", "Album", "Duracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableColaReproduccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 850, 450));

        jButtonReproducirCancion.setText("Reproducir");
        jButtonReproducirCancion.setActionCommand("reproducir");
        jButtonReproducirCancion.addMouseListener(reproduccionController);
        jPanel1.add(jButtonReproducirCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 120, -1));

        jTabbedPane1.addTab("Principal", jPanel1);

        jTableGeneros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(jTableGeneros);

        jButtonEliminarGenero.setText("Eliminar");
        jButtonEliminarGenero.addMouseListener(generosController);

        jButtonRegistrarGenero.setText("Registrar");
        jButtonRegistrarGenero.setActionCommand("AbrirRegistrar");
        jButtonRegistrarGenero.addMouseListener(generosController);

        jButtonModificarGenero.setText("Modificar");
        jButtonModificarGenero.addMouseListener(generosController);

        jLabel4.setText("Busqueda");

        jButtonBuscarGenero.setText("Buscar");
        jButtonBuscarGenero.addMouseListener(generosController);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonRegistrarGenero)
                        .addGap(331, 331, 331)
                        .addComponent(jButtonModificarGenero)
                        .addGap(337, 337, 337)
                        .addComponent(jButtonEliminarGenero))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldBusquedaGenero)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonBuscarGenero))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldBusquedaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscarGenero)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEliminarGenero)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRegistrarGenero)
                            .addComponent(jButtonModificarGenero)))))
        );

        jTabbedPane2.addTab("Genero", jPanel5);

        jTableAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha Lanzamiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTableAlbumes);

        jButtonAñadirAlbumCola.setText("Añadir a la cola");
        jButtonAñadirAlbumCola.setActionCommand("añadirAlbum");
        jButtonAñadirAlbumCola.addMouseListener(reproduccionController);

        jButtonRegistrarAlbum.setText("Registrar");
        jButtonRegistrarAlbum.setActionCommand("AbrirRegistrar");
        jButtonRegistrarAlbum.addMouseListener(albumesController);

        jButtonBuscarAlbum.setText("Buscar");
        jButtonBuscarAlbum.addMouseListener(albumesController);

        jLabel20.setText("Busqueda");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButtonRegistrarAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAñadirAlbumCola))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscarAlbum)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarAlbum)))
                .addGap(379, 379, 379))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldBuscarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscarAlbum)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarAlbum)
                    .addComponent(jButtonAñadirAlbumCola)))
        );

        jTabbedPane2.addTab("Albumes", jPanel7);

        jTableArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Nombres", "Apellidos", "Edad", "Fechas", "Pais", "Descripcion", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTableArtistas);
        if (jTableArtistas.getColumnModel().getColumnCount() > 0) {
            jTableArtistas.getColumnModel().getColumn(0).setResizable(false);
            jTableArtistas.getColumnModel().getColumn(1).setResizable(false);
            jTableArtistas.getColumnModel().getColumn(2).setResizable(false);
            jTableArtistas.getColumnModel().getColumn(3).setResizable(false);
            jTableArtistas.getColumnModel().getColumn(4).setResizable(false);
            jTableArtistas.getColumnModel().getColumn(5).setResizable(false);
            jTableArtistas.getColumnModel().getColumn(6).setResizable(false);
            jTableArtistas.getColumnModel().getColumn(7).setResizable(false);
            jTableArtistas.getColumnModel().getColumn(8).setResizable(false);
        }

        jButtonEliminarArtista.setText("Eliminar");
        jButtonEliminarArtista.addMouseListener(artistaController);

        jButtonRegistrarArtista.setText("Registrar");
        jButtonRegistrarArtista.setToolTipText("");
        jButtonRegistrarArtista.setActionCommand("AbrirRegistrar");
        jButtonRegistrarArtista.addMouseListener(artistaController);

        jButtonModificarArtista.setText("Modificar");
        jButtonModificarArtista.addMouseListener(artistaController);

        jLabel19.setText("Busqueda");

        jComboBoxBusquedaArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Nacionalidad", "Alias" }));

        jButtonBusquedaArtista.setText("Buscar");
        jButtonBusquedaArtista.addMouseListener(artistaController);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldBusquedaArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxBusquedaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBusquedaArtista))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jButtonRegistrarArtista)
                            .addGap(328, 328, 328)
                            .addComponent(jButtonModificarArtista)
                            .addGap(340, 340, 340)
                            .addComponent(jButtonEliminarArtista))))
                .addGap(136, 136, 136))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusquedaArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBoxBusquedaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBusquedaArtista))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarArtista)
                    .addComponent(jButtonModificarArtista)
                    .addComponent(jButtonEliminarArtista)))
        );

        jTabbedPane2.addTab("Artistas", jPanel6);

        jTableCompositores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTableCompositores);

        jButtonEliminarCompositor.setText("Eliminar");
        jButtonEliminarCompositor.addMouseListener(compositoresController);

        jButtonRegistrarCompositor.setText("Registrar");
        jButtonRegistrarCompositor.setActionCommand("AbrirRegistrar");
        jButtonRegistrarCompositor.addMouseListener(compositoresController);

        jButtonModificarCompositor.setText("Modificar");
        jButtonModificarCompositor.addMouseListener(compositoresController);

        jLabel18.setText("Busqueda");

        jButtonBuscarCompositores.setText("Buscar");
        jButtonBuscarCompositores.addMouseListener(compositoresController);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscarCompositores, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButtonRegistrarCompositor)
                        .addGap(300, 300, 300)
                        .addComponent(jButtonModificarCompositor))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonBuscarCompositores)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminarCompositor)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldBuscarCompositores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCompositores))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButtonRegistrarCompositor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEliminarCompositor)
                            .addComponent(jButtonModificarCompositor))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Compositores", jPanel8);

        jTableCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Artista", "Genero", "Compositor", "Lanzamiento", "Album"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(jTableCanciones);

        jComboBoxBusquedaCancion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Clasificacion", "Genero", "Artista" }));

        jButtonAbrirRegistrarCancion.setText("Registrar");
        jButtonAbrirRegistrarCancion.setActionCommand("AbrirRegistrar");
        jButtonAbrirRegistrarCancion.addMouseListener(cancionController);

        jButtonComprarCancion.setText("Comprar");
        jButtonComprarCancion.setActionCommand("AbrirComprar");
        jButtonComprarCancion.addMouseListener(listasController);

        jLabel64.setText("Busqueda");

        jButtonBuscarCancion.setText("Buscar");
        jButtonBuscarCancion.addMouseListener(cancionController);

        jButtonAñadirCancionCola.setText("Añadir a la cola");
        jButtonAñadirCancionCola.setActionCommand("añadirCancion");
        jButtonAñadirCancionCola.addMouseListener(reproduccionController);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxBusquedaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscarCancion))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jButtonComprarCancion)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonAbrirRegistrarCancion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAñadirCancionCola))
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(155, 155, 155))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldBuscarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBuscarCancion)
                        .addComponent(jComboBoxBusquedaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAbrirRegistrarCancion)
                    .addComponent(jButtonComprarCancion)
                    .addComponent(jButtonAñadirCancionCola))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Canciones", jPanel12);

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Edad", "Usuario", "Pais", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTableUsuarios);

        jButtonRegistrarUsuario.setText("Registrar");
        jButtonRegistrarUsuario.setActionCommand("AbrirRegistrar");
        jButtonRegistrarUsuario.addMouseListener(usuarioControllers);

        jLabel7.setText("Busqueda");

        jButtonBuscarUsuario.setText("Buscar");
        jButtonBuscarUsuario.addMouseListener(usuarioControllers);

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldBuscarUsuario)
                            .addGap(86, 86, 86)
                            .addComponent(jButtonBuscarUsuario))
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonRegistrarUsuario))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBuscarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButtonRegistrarUsuario)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Usuarios", jPanelUsuarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Explorar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Explorar", jPanel2);

        jTableListas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha", "Canciones", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(jTableListas);

        jButtonRegistrarLista.setText("Registrar");
        jButtonRegistrarLista.setActionCommand("AbrirRegistrar");
        jButtonRegistrarLista.addMouseListener(listasController);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Listas");

        jButtonAñadirListaCola.setText("Añadir cola");
        jButtonAñadirListaCola.setActionCommand("añadirLista");
        jButtonAñadirListaCola.addMouseListener(reproduccionController);

        jLabel21.setText("Busqueda");

        jButtonBuscarLista.addMouseListener(listasController);
        jButtonBuscarLista.setText("Buscar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAñadirListaCola)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldBuscarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(jButtonBuscarLista))))
                .addContainerGap(438, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonRegistrarLista)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(438, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldBuscarLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addComponent(jButtonAñadirListaCola)
                .addGap(48, 48, 48))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)
                    .addComponent(jButtonRegistrarLista)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Listas", jPanel3);

        jLabelNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombreUsuario.setText("Nombre usuario");

        jLabelAvatarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/default_small.png"))); // NOI18N

        jButtonModificarUsuario.setText("Ver información");
        jButtonModificarUsuario.setActionCommand("Modificar");
        jButtonModificarUsuario.addMouseListener(usuarioControllers);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPausar.setActionCommand("pause");
        jButtonPausar.setBorderPainted(false);
        jButtonPausar.setContentAreaFilled(false);
        jButtonPausar.addMouseListener(reproduccionController);
        jPanel4.add(jButtonPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 70, 40));

        jButtonResumir.setActionCommand("resume");
        jButtonResumir.setBorderPainted(false);
        jButtonResumir.setContentAreaFilled(false);
        jButtonPausar.addMouseListener(reproduccionController);
        jPanel4.add(jButtonResumir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 70, 60));

        jButtonDetener.setActionCommand("stop");
        jButtonDetener.setBorderPainted(false);
        jButtonDetener.setContentAreaFilled(false);
        jButtonPausar.addMouseListener(reproduccionController);
        jPanel4.add(jButtonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 70, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/imagenes/Background.png"))); // NOI18N
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        jPanel4.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(726, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAvatarUsuario)
                .addGap(28, 28, 28))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jTabbedPane1)
                    .addGap(5, 5, 5)))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAvatarUsuario)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonModificarUsuario)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 790, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(349, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelPrincipal, "card3");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getjLabelCaratulaAlbumRegistrar() {
        return jLabelCaratulaAlbumRegistrar;
    }

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(rootPane, mensaje);
    }
    public JButton getjButtonEliminarArtista() {
        return jButtonEliminarArtista;
    }

    public JButton getjButtonEliminarCompositor() {
        return jButtonEliminarCompositor;
    }

    public JButton getjButtonEliminarGenero() {
        return jButtonEliminarGenero;
    }

    public JButton getjButtonModificarArtista() {
        return jButtonModificarArtista;
    }

    public JButton getjButtonModificarCompositor() {
        return jButtonModificarCompositor;
    }

    public JButton getjButtonModificarGenero() {
        return jButtonModificarGenero;
    }

    public JPanel getjPanelUsuarios() {
        return jPanelUsuarios;
    }

    private void jButtonGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarUsuarioActionPerformed
    }//GEN-LAST:event_jButtonGuardarUsuarioActionPerformed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
       
    }//GEN-LAST:event_BackgroundMouseDragged

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed

    }//GEN-LAST:event_BackgroundMousePressed

    public JLabel getjLabelAvatarRegistrarUsuario() {
        return jLabelAvatarRegistrarUsuario;
    }

    public JLabel getjLabelAvatarUsuario() {
        return jLabelAvatarUsuario;
    }

    public JLabel getjLabelNombreUsuario() {
        return jLabelNombreUsuario;
    }

    public JButton getjButtonGuardarCompraCancion() {
        return jButtonGuardarCompraCancion;
    }

    public void mostrarError(String error) {
        JOptionPane.showMessageDialog(rootPane, error, "¡Error!", JOptionPane.ERROR_MESSAGE);
        Log.escribirLog(error);
    }

    public boolean mostrarConfirmacion(String mensaje) {
        return JOptionPane.showConfirmDialog(rootPane, mensaje, "Confirmacion",
                 JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

    }

    public String obtenerInput(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public JLabel getjLabelPrecioCancion() {
        return jLabelPrecioCancion;
    }

    public JTextField getjTextFieldPrecioCancion() {
        return jTextFieldPrecioCancion;
    }

    public JTextArea getjTextAreaDescripcionGenero() {
        return jTextAreaDescripcionGenero;
    }

    public JTextField getjTextFieldNombreGenero() {
        return jTextFieldNombreGenero;
    }

    public JCheckBox getjCheckBoxSerAdministradorUsuario() {
        return jCheckBoxSerAdministradorUsuario;
    }

    public JPasswordField getjPasswordFieldClaveInicioSesion() {
        return jPasswordFieldClaveInicioSesion;
    }

    public JPanel getjPanelInicioSesion() {
        return jPanelInicioSesion;
    }

    public JPanel getjPanelPrincipal() {
        return jPanelPrincipal;
    }

    public JTextField getjTextFieldUsuarioInicioSesion() {
        return jTextFieldUsuarioInicioSesion;
    }

    public JFrame getComprar() {
        return Comprar;
    }

    public JFrame getRegistrarAlbum() {
        return RegistrarAlbum;
    }

    public JFrame getRegistrarArtista() {
        return RegistrarArtista;
    }

    public JFrame getRegistrarCancion() {
        return RegistrarCancion;
    }

    public JFrame getRegistrarCompositor() {
        return RegistrarCompositor;
    }

    public JFrame getRegistrarGenero() {
        return RegistrarGenero;
    }

    public JFrame getRegistrarLista() {
        return RegistrarLista;
    }

    public JFrame getRegistrarUsuario() {
        return RegistrarUsuario;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBoxBusquedaArtista;
    }

    public JComboBox<Object> getjComboBoxGeneroCancion() {
        return jComboBoxGeneroCancion;
    }

    public JButton getjButton18() {
        return jButtonBuscarGenero;
    }

    public JComboBox<Object> getjComboBoxPaisCompositor() {
        return jComboBoxPaisCompositor;
    }
    public JComboBox<Object> getjComboBoxPaisUsuario() {
        return jComboBoxPaisUsuario;
    }

    public JComboBox<String> getjComboBox4() {
        return jComboBoxBusquedaCancion;
    }

    public JComboBox<Object> getjComboBoxPaisArtista() {
        return jComboBoxPaisArtista;
    }

    public JComboBox<Object> getjComboBoxGeneroArtista() {
        return jComboBoxGeneroArtista;
    }

    public JComboBox<Object> getjComboBoxAlbumCancion() {
        return jComboBoxAlbumCancion;
    }

    public JComboBox<Object> getjComboBoxCompositorCancion() {
        return jComboBoxCompositorCancion;
    }

    public JComboBox<Object> getjComboBoxArtistaCancion() {
        return jComboBoxArtistaCancion;
    }

    public JDateChooser getjDateChooserFechaLanzamientoAlbum() {
        return jDateChooserFechaLanzamientoAlbum;
    }

    public JDateChooser getjDateChooserFechaNacimientoArtista() {
        return jDateChooserFechaNacimientoArtista;
    }

    public JDateChooser getjDateChooserFechaDefuncionArtista() {
        return jDateChooserFechaDefuncionArtista;
    }

    public JDateChooser getjDateChooserFechaLanzamientoCancion() {
        return jDateChooserFechaLanzamientoCancion;
    }


    public JList<Object> getjListCatalogoGeneralCancionesLista() {
        return jListCatalogoGeneralCancionesLista;
    }

    public JTable getjTableColaReproduccion() {
        return jTableColaReproduccion;
    }

 
 

    

    public JList<Object> getjListCancionesAlbum() {
        return jListCancionesAlbum;
    }

    public JList<Object> getjListCatalogoGeneralAlbum() {
        return jListCatalogoGeneralAlbum;
    }

    public JList<Object> getjListCancionesLista() {
        return jListCancionesLista;
    }

    public JPasswordField getjPasswordFieldClaveUsuario() {
        return jPasswordFieldClaveUsuario;
    }



    public JButton getjButton15() {
        return jButtonModificarArtista;
    }

    public JSpinner getjSpinnerCalificacionCancion() {
        return jSpinnerCalificacionCancion;
    }

    public JTable getjTable1() {
        return jTableColaReproduccion;
    }

    public JTable getjTableCanciones() {
        return jTableCanciones;
    }

    public JTable getjTableGeneros() {
        return jTableGeneros;
    }

    public JTable getjTableCancionesTienda() {
        return jTableCancionesTienda;
    }

    public JTable getjTableArtistas() {
        return jTableArtistas;
    }

    public JTable getjTableCompositores() {
        return jTableCompositores;
    }

    public JTable getjTableAlbumes() {
        return jTableAlbumes;
    }

    public JTable getjTableUsuarios() {
        return jTableUsuarios;
    }

    public JTable getjTableListas() {
        return jTableListas;
    }

    public JTextArea getjTextAreaDescripcionArtista() {
        return jTextAreaDescripcionArtista;
    }

    public JTextField getjTextField1() {
        return jTextFieldBusquedaGenero;
    }

    public JTextField getjTextFieldSegundNombreUsuario() {
        return jTextFieldSegundNombreUsuario;
    }

    public JTextField getjTextFieldEdadUsuario() {
        return jTextFieldEdadUsuario;
    }

    public JTextField getjTextFieldIdentificacionUsuario() {
        return jTextFieldIdentificacionUsuario;
    }

    public JTextField getjTextFieldCorreoElectronico() {
        return jTextFieldCorreoElectronico;
    }

    public JTextField getjTextFieldPrimerApellidoUsuario() {
        return jTextFieldPrimerApellidoUsuario;
    }

    public JTextField getjTextFieldSegundoApellidoUsuario() {
        return jTextFieldSegundoApellidoUsuario;
    }

    public JTextField getjTextFieldNombreAlbum() {
        return jTextFieldNombreAlbum;
    }

    public JTextField getjTextFieldNombreLista() {
        return jTextFieldNombreLista;
    }

    public JTextField getjTextFieldNombreArtisticoArtista() {
        return jTextFieldNombreArtisticoArtista;
    }

    public JTextField getjTextFieldPrimerNombreArtista() {
        return jTextFieldPrimerNombreArtista;
    }

    public JTextField getjTextField2() {
        return jTextFieldBuscarCompositores;
    }

    public JTextField getjTextFieldSegundoNombreArtista() {
        return jTextFieldSegundoNombreArtista;
    }

    public JTextField getjTextFieldPrimerApellidoArtista() {
        return jTextFieldPrimerApellidoArtista;
    }

    public JTextField getjTextFieldSegundoApellidoArtista() {
        return jTextFieldSegundoApellidoArtista;
    }

    public JTextField getjTextFieldPrimerApellidoCompositor() {
        return jTextFieldPrimerApellidoCompositor;
    }

    public JTextField getjTextFieldSegundoNombreCompositor() {
        return jTextFieldSegundoNombreCompositor;
    }

    public JTextField getjTextFieldEdadCompositor() {
        return jTextFieldEdadCompositor;
    }

    public JTextField getjTextFieldSegundoApellidoCompositor() {
        return jTextFieldSegundoApellidoCompositor;
    }

    public JTextField getjTextFieldPrimerNombreCompositor() {
        return jTextFieldPrimerNombreCompositor;
    }

    public JTextField getjTextField3() {
        return jTextFieldBusquedaArtistas;
    }

    public JTextField getjTextField30() {
        //return jTextField30;
        return null;
    }

    public JTextField getjTextField4() {
        return jTextFieldBuscarCancion;
    }

    public JTextField getjTextField5() {
        return jTextFieldBuscarAlbum;
    }

    public JTextField getjTextField6() {
        return jTextFieldBuscarUsuario;
    }

    public JTextField getjTextField7() {
        return jTextFieldBuscarLista;
    }

    public JTextField getjTextFieldNombreUsuario() {
        return jTextFieldNombreUsuario;
    }

    public JTextField getjTextFieldPrimerNombreUsuario() {
        return jTextFieldPrimerNombreUsuario;
    }

    public JTextField getjTextFieldNombreCancion() {
        return jTextFieldNombreCancion;
    }

    public JTextField getjTextFieldURL() {
        return jTextFieldURL;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirRegistrarAlbumCancion;
    private javax.swing.JLabel Background;
    private javax.swing.JFrame Comprar;
    private javax.swing.JFrame RegistrarAlbum;
    private javax.swing.JFrame RegistrarArtista;
    private javax.swing.JFrame RegistrarCancion;
    private javax.swing.JFrame RegistrarCompositor;
    private javax.swing.JFrame RegistrarGenero;
    private javax.swing.JFrame RegistrarLista;
    private javax.swing.JFrame RegistrarUsuario;
    private javax.swing.JFrame Reproductor;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonAbrirRegistrarCancion;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonAñadirAlbumCola;
    private javax.swing.JButton jButtonAñadirCancionCola;
    private javax.swing.JButton jButtonAñadirListaCanciones;
    private javax.swing.JButton jButtonAñadirListaCola;
    private javax.swing.JButton jButtonBuscarAlbum;
    private javax.swing.JButton jButtonBuscarCancion;
    private javax.swing.JButton jButtonBuscarCompositores;
    private javax.swing.JButton jButtonBuscarGenero;
    private javax.swing.JButton jButtonBuscarLista;
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonBusquedaArtista;
    private javax.swing.JButton jButtonComprarCancion;
    private javax.swing.JButton jButtonDetener;
    private javax.swing.JButton jButtonEliminarArtista;
    private javax.swing.JButton jButtonEliminarCompositor;
    private javax.swing.JButton jButtonEliminarGenero;
    private javax.swing.JButton jButtonGuardarAlbum;
    private javax.swing.JButton jButtonGuardarArtista;
    private javax.swing.JButton jButtonGuardarCancion;
    private javax.swing.JButton jButtonGuardarCompositor;
    private javax.swing.JButton jButtonGuardarCompraCancion;
    private javax.swing.JButton jButtonGuardarGenero;
    private javax.swing.JButton jButtonGuardarLista;
    private javax.swing.JButton jButtonGuardarUsuario;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonModificarArtista;
    private javax.swing.JButton jButtonModificarCompositor;
    private javax.swing.JButton jButtonModificarGenero;
    private javax.swing.JButton jButtonModificarUsuario;
    private javax.swing.JButton jButtonPausar;
    private javax.swing.JButton jButtonQuitar;
    private javax.swing.JButton jButtonQuitarListaCancion;
    private javax.swing.JButton jButtonRegistrarAlbum;
    private javax.swing.JButton jButtonRegistrarArtista;
    private javax.swing.JButton jButtonRegistrarCompositor;
    private javax.swing.JButton jButtonRegistrarGenero;
    private javax.swing.JButton jButtonRegistrarLista;
    private javax.swing.JButton jButtonRegistrarUsuario;
    private javax.swing.JButton jButtonRegistrarUsuarioSesion;
    private javax.swing.JButton jButtonRegistrarUsuarioSesion1;
    private javax.swing.JButton jButtonReproducirCancion;
    private javax.swing.JButton jButtonResumir;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JButton jButtonSeleccionarAvatarUsuario;
    private javax.swing.JButton jButtonSeleccionarCaratulaAlbum;
    private javax.swing.JCheckBox jCheckBoxSerAdministradorUsuario;
    private javax.swing.JComboBox<Object> jComboBoxAlbumCancion;
    private javax.swing.JComboBox<Object> jComboBoxArtistaCancion;
    private javax.swing.JComboBox<String> jComboBoxBusquedaArtista;
    private javax.swing.JComboBox<String> jComboBoxBusquedaCancion;
    private javax.swing.JComboBox<Object> jComboBoxCompositorCancion;
    private javax.swing.JComboBox<Object> jComboBoxGeneroArtista;
    private javax.swing.JComboBox<Object> jComboBoxGeneroCancion;
    private javax.swing.JComboBox<Object> jComboBoxPaisArtista;
    private javax.swing.JComboBox<Object> jComboBoxPaisCompositor;
    private javax.swing.JComboBox<Object> jComboBoxPaisUsuario;
    private com.toedter.calendar.JDateChooser jDateChooserFechaDefuncionArtista;
    private com.toedter.calendar.JDateChooser jDateChooserFechaLanzamientoAlbum;
    private com.toedter.calendar.JDateChooser jDateChooserFechaLanzamientoCancion;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNacimientoArtista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAvatarRegistrarUsuario;
    private javax.swing.JLabel jLabelAvatarUsuario;
    private javax.swing.JLabel jLabelCaratulaAlbumRegistrar;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelPrecioCancion;
    private javax.swing.JList<Object> jListCancionesAlbum;
    private javax.swing.JList<Object> jListCancionesLista;
    private javax.swing.JList<Object> jListCatalogoGeneralAlbum;
    private javax.swing.JList<Object> jListCatalogoGeneralCancionesLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelInicioSesion;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JPasswordField jPasswordFieldClaveInicioSesion;
    private javax.swing.JPasswordField jPasswordFieldClaveUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinnerCalificacionCancion;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableAlbumes;
    private javax.swing.JTable jTableArtistas;
    private javax.swing.JTable jTableCanciones;
    private javax.swing.JTable jTableCancionesTienda;
    private javax.swing.JTable jTableColaReproduccion;
    private javax.swing.JTable jTableCompositores;
    private javax.swing.JTable jTableGeneros;
    private javax.swing.JTable jTableListas;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextArea jTextAreaDescripcionArtista;
    private javax.swing.JTextArea jTextAreaDescripcionGenero;
    private javax.swing.JTextField jTextFieldBuscarAlbum;
    private javax.swing.JTextField jTextFieldBuscarCancion;
    private javax.swing.JTextField jTextFieldBuscarCompositores;
    private javax.swing.JTextField jTextFieldBuscarLista;
    private javax.swing.JTextField jTextFieldBuscarUsuario;
    private javax.swing.JTextField jTextFieldBusquedaArtistas;
    private javax.swing.JTextField jTextFieldBusquedaGenero;
    private javax.swing.JTextField jTextFieldCorreoElectronico;
    private javax.swing.JTextField jTextFieldEdadCompositor;
    private javax.swing.JTextField jTextFieldEdadUsuario;
    private javax.swing.JTextField jTextFieldIdentificacionUsuario;
    private javax.swing.JTextField jTextFieldNombreAlbum;
    private javax.swing.JTextField jTextFieldNombreArtisticoArtista;
    private javax.swing.JTextField jTextFieldNombreCancion;
    private javax.swing.JTextField jTextFieldNombreGenero;
    private javax.swing.JTextField jTextFieldNombreLista;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JTextField jTextFieldPrecioCancion;
    private javax.swing.JTextField jTextFieldPrimerApellidoArtista;
    private javax.swing.JTextField jTextFieldPrimerApellidoCompositor;
    private javax.swing.JTextField jTextFieldPrimerApellidoUsuario;
    private javax.swing.JTextField jTextFieldPrimerNombreArtista;
    private javax.swing.JTextField jTextFieldPrimerNombreCompositor;
    private javax.swing.JTextField jTextFieldPrimerNombreUsuario;
    private javax.swing.JTextField jTextFieldSegundNombreUsuario;
    private javax.swing.JTextField jTextFieldSegundoApellidoArtista;
    private javax.swing.JTextField jTextFieldSegundoApellidoCompositor;
    private javax.swing.JTextField jTextFieldSegundoApellidoUsuario;
    private javax.swing.JTextField jTextFieldSegundoNombreArtista;
    private javax.swing.JTextField jTextFieldSegundoNombreCompositor;
    private javax.swing.JTextField jTextFieldURL;
    private javax.swing.JTextField jTextFieldUsuarioInicioSesion;
    // End of variables declaration//GEN-END:variables

}
