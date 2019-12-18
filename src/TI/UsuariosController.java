/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.listas.Listas;
import BI.usuarios.MysqlUsuariosDAO;
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
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pardo
 */
public class UsuariosController extends MouseAdapter {

    Principal principal;
    MysqlUsuariosDAO mysql = new MysqlUsuariosDAO();
    Controller controller;
    String pass = "";
    int id = -1;

    public UsuariosController(Principal principal) {
        this.principal = principal;
        controller = new Controller(principal);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String boton = (((JButton) e.getSource()).getActionCommand());
        switch (boton) {
            case ("AbrirRegistrar"):
                abrirVentanaRegistro();
                controller.actualizarTodo();
                break;
            case ("Guardar"):
                registrar();
                break;
            case ("IniciarSesion"):
                iniciarSesion();
                break;
            case ("Seleccionar"):
                seleccionar();
                break;
            case ("Modificar"):
                modificar();
                break;
            case ("Buscar"):
                busqueda();
                break;
            case ("Recuperar"):
                recuperarPass();
                break;
        }
    }

    void abrirVentanaRegistro() {
        controller.limpiar(principal.getRegistrarUsuario());
        principal.getRegistrarUsuario().setSize(600, 360);
        principal.getRegistrarUsuario().setLocationRelativeTo(null);
        principal.getRegistrarUsuario().setVisible(true);
        principal.getjCheckBoxSerAdministradorUsuario().setEnabled(true);
        principal.getjTextFieldIdentificacionUsuario().setEnabled(true);
        principal.getjTextFieldCorreoElectronico().setEnabled(true);

        if (Controller.usuarioActual != null) {
            principal.getjCheckBoxSerAdministradorUsuario().setVisible(Controller.usuarioActual.serAdmin()
                    || !ExistirAdmin());
        } else {
            principal.getjCheckBoxSerAdministradorUsuario().setVisible(!ExistirAdmin());
        }
    }

    void registrar() {
        if (controller.validarTextFieldEntero(principal.getjTextFieldIdentificacionUsuario())) {
            int id = Integer.parseInt(principal.getjTextFieldIdentificacionUsuario().getText());
            if (!mysql.existeId(id) || !principal.getjTextFieldIdentificacionUsuario().isEnabled()) {
                if (controller.validarTextFieldEntero(principal.getjTextFieldEdadUsuario())) {
                    int edad = Integer.parseInt(principal.getjTextFieldEdadUsuario().getText());
                    if (edad > 17) {
                        if (controller.validarjTextFieldString(principal.getjTextFieldCorreoElectronico())) {
                            String correo = principal.getjTextFieldCorreoElectronico().getText();
                            if (!mysql.existeCorreo(correo) || !principal.getjTextFieldIdentificacionUsuario().isEnabled()) {
                                char[] claveChar = principal.getjPasswordFieldClaveUsuario().getPassword();
                                if (validarClave(claveChar)) {
                                    if (controller.validarjTextFieldString(principal.getjTextFieldPrimerNombreUsuario())
                                            && controller.validarjTextFieldString(principal.getjTextFieldPrimerApellidoUsuario())
                                            && controller.validarjTextFieldString(principal.getjTextFieldNombreUsuario())
                                            && controller.validarjTextFieldString(principal.getjPasswordFieldClaveUsuario())) {

                                        String primerNombre = principal.getjTextFieldPrimerNombreUsuario().getText();
                                        String segundoNombre = principal.getjTextFieldSegundNombreUsuario().getText();
                                        String primerApellido = principal.getjTextFieldPrimerApellidoUsuario().getText();
                                        String segundoApellido = principal.getjTextFieldSegundoApellidoUsuario().getText();
                                        String nombreUsuario = principal.getjTextFieldNombreUsuario().getText();
                                        String clave = String.valueOf(claveChar);
                                        int pais = principal.getjComboBoxPaisUsuario().getSelectedIndex() + 1;
                                        String autenticacion = generarAutenticacion();
                                        int rol = (principal.getjCheckBoxSerAdministradorUsuario().isSelected()) ? 1 : 2;
                                        Usuarios usuario = new Usuarios(id, primerNombre, segundoNombre, primerApellido, segundoApellido, edad, correo, nombreUsuario, clave, pais, autenticacion, rol);
                                        if (principal.getjTextFieldIdentificacionUsuario().isEnabled()) {
                                            if (enviarCorreo(usuario.getCorreo(), "Codigo autenticacion", "Su codigo de autenticacion es: " + usuario.getAutenticacion())) {
                                                mysql.insertarUsuario(usuario);
                                                controller.usuarioActual = usuario;                                                
                                                principal.getRegistrarUsuario().dispose();
                                                guardarImagen(id + "_" + nombreUsuario);
                                                controller.actualizarTodo();
                                            } else {
                                                principal.mostrarError("No se pudo enviar el correo compruebe si la dirección es correcta");
                                            }
                                        } else {
                                            if (!correo.equals(controller.usuarioActual.getCorreo())) {
                                                if (principal.mostrarConfirmacion("¿Está seguro que desea cambiar su correo se tendrá que autenticar de nuevo?")) {
                                                    if (enviarCorreo(usuario.getCorreo(), "Codigo autenticacion", "Su codigo de autenticacion es: " + usuario.getAutenticacion())) {
                                                        mysql.modificarUsuarios(usuario);
                                                        principal.getRegistrarUsuario().dispose();
                                                        guardarImagen(id + "_" + nombreUsuario);
                                                        controller.actualizarTodo();
                                                        controller.usuarioActual = usuario;

                                                    } else {
                                                        principal.mostrarError("No se pudo enviar el correo compruebe si la dirección es correcta");
                                                    }
                                                }
                                            } else {
                                                mysql.modificarUsuarios(usuario);
                                                principal.getRegistrarUsuario().dispose();
                                                guardarImagen(id + "_" + nombreUsuario);
                                                controller.actualizarTodo();
                                                controller.usuarioActual = usuario;
                                            }
                                        }
                                    }
                                }
                            } else {
                                principal.mostrarError("Correo ya registrado");
                            }
                        }
                    } else {
                        principal.mostrarError("El usuario no puede ser menor a 18");
                    }
                }
            } else {
                principal.mostrarError("Ya existe un usuario con la identificación: " + id);
            }

        }
    }

    boolean validarClave(char[] clave
    ) {
        if (clave.length > 7 && clave.length < 13) {
            boolean mayuscula = false;
            boolean minuscula = false;
            boolean especial = false;
            boolean espacio = false;
            for (Character caracter : clave) {
                if (Character.isUpperCase(caracter)) {
                    mayuscula = true;
                }
                if (Character.isLowerCase(caracter)) {
                    minuscula = true;
                }
                if (Character.isWhitespace(caracter)) {
                    espacio = true;
                }
                if (!Character.isLetterOrDigit(caracter)) {
                    especial = true;
                }
            }
            if (mayuscula && minuscula && especial && !espacio) {
                return true;
            } else {
                principal.mostrarError("La clave debe tener una mayuscula, una minuscula y un caracter especial"
                        + " además de no tener espacios en blancos");
                return false;
            }
        } else {
            principal.mostrarError("La clave debe tener entre 8 y 12 caracteres");
            return false;
        }
    }

    String generarAutenticacion() {
        char[] autenticacion = new char[6];
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            autenticacion[i] = (char) (r.nextInt(26) + 'a');
        }
        return String.valueOf(autenticacion);
    }

    boolean ExistirAdmin() {
        return mysql.existirUnAdmin();
    }

    private void iniciarSesion() {
        char[] claveChar = principal.getjPasswordFieldClaveInicioSesion().getPassword();
        boolean flag = !pass.equals("");
        if(!flag){
            flag = validarClave(claveChar);
        }
        if ((controller.validarTextFieldEntero(principal.getjTextFieldUsuarioInicioSesion()) && flag)) {

            int identificacion = Integer.parseInt(principal.getjTextFieldUsuarioInicioSesion().getText());
            String clave = String.valueOf(claveChar);
            Usuarios usuario = null;
            if (id != identificacion) {
                pass = "";
            }
            if (pass.equals("")) {
                usuario = mysql.getUsuario(identificacion, clave);
            } else {
                usuario = mysql.getUsuario(id);
                usuario = (principal.obtenerInput("Ingrese la clave generada").equals(pass)) ? usuario : null;
            }
            if (usuario != null) {
                if (usuario.getAutenticacion().equals("")) {
                    principal.getjPanelInicioSesion().setVisible(false);
                    principal.getjPanelPrincipal().setVisible(true);
                    controller.actualizarTodo();
                    controller.usuarioActual = usuario;
                    mostrarSesion();
                    controller.actualizarTodo();
                } else {
                    String autenticacion = principal.obtenerInput("Ingrese la validación que se le envió al correo");
                    if (autenticacion != null) {
                        if (autenticacion.equals(usuario.getAutenticacion())) {
                            principal.getjPanelInicioSesion().setVisible(false);
                            principal.getjPanelPrincipal().setVisible(true);
                            mysql.autenticarUsuario(usuario.getId());
                            usuario.setAutenticacion("");
                            controller.actualizarTodo();
                            controller.usuarioActual = usuario;                            
                            mostrarSesion();
                            controller.actualizarTodo();
                        } else {
                            principal.mostrarError("La autenticacion no coincide");
                        }
                    }
                }
            } else {
                principal.mostrarError("No existe la combinacion de identificacion y contraseña");
            }

        }
    }

    public boolean enviarCorreo(String correo, String sujeto, String mensaje) {
        String to = correo;

        String from = "correobiblioteca123@gmail.com";
        String PASSWORD = "123456789aA_";
        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, PASSWORD);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sujeto);
            message.setText(mensaje);
            Transport.send(message);
            return true;
        } catch (MessagingException mex) {
            return false;
        }
    }

    private void seleccionar() {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileFilter(new FileNameExtensionFilter("Imagenes", "jpeg", "png", "jpg"));
        int returnVal = filechooser.showOpenDialog(principal);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ImageIcon icon = new ImageIcon(filechooser.getSelectedFile().getAbsolutePath());
            icon = new ImageIcon(icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
            principal.getjLabelAvatarRegistrarUsuario().setIcon(icon);
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
        }
    }

    private boolean guardarImagen(String nombre) {
        ImageIcon icon = new ImageIcon(Usuarios.URL_AVATARS + controller.usuarioActual.getId() + ".png");
        if (icon.getImage() == null) {
            try {
                Path temp = null;
                ImageIO.write(toBufferedImage(((ImageIcon) principal.getjLabelAvatarRegistrarUsuario().getIcon()).getImage()),
                        "png", new File(Usuarios.URL_AVATARS + nombre + ".png"));

                return temp != null;

            } catch (IOException ex) {
                Logger.getLogger(UsuariosController.class
                        .getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } else {
            return true;
        }
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

    void mostrarSesion() {
        ImageIcon icon;
        icon = new ImageIcon(Usuarios.URL_AVATARS + controller.usuarioActual.getId() + ".png");
        if (icon.getIconHeight() == -1) {
            icon = new ImageIcon(Usuarios.URL_AVATARS + "default_avatar" + ".png");
        }

        principal.getjLabelAvatarUsuario().setIcon(icon);
        principal.getjLabelNombreUsuario().setText(controller.usuarioActual.getUsuario());
        if (!Controller.usuarioActual.serAdmin()) {
            mostrarSesionUsuario();
        }
    }

    void mostrarSesionUsuario() {
        principal.getjButtonEliminarArtista().setVisible(false);
        principal.getjButtonEliminarCompositor().setVisible(false);
        principal.getjButtonEliminarGenero().setVisible(false);
        principal.getjButtonModificarArtista().setVisible(false);
        principal.getjButtonModificarCompositor().setVisible(false);
        principal.getjButtonModificarGenero().setVisible(false);
        principal.getjTableUsuarios().setVisible(false);
        principal.getjButtonRegistrarUsuario().setVisible(false);
    }

    private void modificar() {
        abrirVentanaRegistro();
        principal.getjLabelAvatarRegistrarUsuario().setIcon(principal.getjLabelAvatarUsuario().getIcon());
        principal.getjTextFieldPrimerNombreUsuario().setText(controller.usuarioActual.getPrimerNombre());
        principal.getjTextFieldSegundNombreUsuario().setText(controller.usuarioActual.getSegundoNombre());
        principal.getjTextFieldPrimerApellidoUsuario().setText(controller.usuarioActual.getPrimerApellido());
        principal.getjTextFieldSegundoApellidoUsuario().setText(controller.usuarioActual.getSegundoApellido());
        principal.getjTextFieldNombreUsuario().setText(controller.usuarioActual.getUsuario());
        principal.getjComboBoxPaisUsuario().setSelectedItem(controller.getPaises().get(controller.usuarioActual.getPais()));
        principal.getjTextFieldEdadUsuario().setText(controller.usuarioActual.getEdad() + "");
        principal.getjTextFieldIdentificacionUsuario().setText(controller.usuarioActual.getId() + "");
        principal.getjPasswordFieldClaveUsuario().setText(controller.usuarioActual.getClave());
        principal.getjTextFieldCorreoElectronico().setText(controller.usuarioActual.getCorreo());
        principal.getjCheckBoxSerAdministradorUsuario().setEnabled(false);
        principal.getjTextFieldIdentificacionUsuario().setEnabled(false);
        principal.getjTextFieldCorreoElectronico().setEnabled(false);
    }

    private void busqueda() {
        if (controller.validarString(principal.getjTextFieldBuscarUsuario().getText())) {
            String busqueda = principal.getjTextFieldBuscarUsuario().getText();
            DefaultTableModel modeloTabla = (DefaultTableModel) principal.getjTableUsuarios().getModel();
            modeloTabla.setRowCount(0);
            for (Usuarios usuario : controller.getUsuarios().values()) {
                if (busqueda.equals(usuario.getId() + "")) {
                    modeloTabla.addRow(new Object[]{usuario.getId(),
                        usuario.getPrimerNombre() + " " + usuario.getSegundoNombre(),
                        usuario.getPrimerApellido() + " " + usuario.getSegundoApellido(), usuario.getEdad(), usuario.getUsuario(),
                        controller.getPaises().get(usuario.getPais()), usuario.getCorreo()
                    });
                }
            }
        } else {
            controller.actualizarUsuarios();
        }
    }

    private void recuperarPass() {
        if (controller.validarTextFieldEntero(principal.getjTextFieldUsuarioInicioSesion())) {
            int identificacion = Integer.parseInt(principal.getjTextFieldUsuarioInicioSesion().getText());
            if (mysql.existeId(identificacion)) {
                Usuarios usuario = mysql.getUsuario(identificacion);
                pass = generarAutenticacion();
                enviarCorreo(usuario.getCorreo(), "Nueva clave", " Hola " + usuario.getUsuario() + " su clave temporal es :"
                        + pass);
                principal.mostrarMensaje("Se le hizo llegar a " + usuario.getCorreo() + " una clave temporal");
                id = identificacion;
            } else {
                principal.mostrarError("No existe el usuario");
            }
        }

    }

}
