/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI;

import BI.albumes.Albumes;
import BI.canciones.Canciones;
import BI.listas.Listas;
import UI.Principal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Pardo
 */
public class ReproduccionController extends MouseAdapter {

    Principal principal;
    Controller controller;
    ArrayList<Canciones> cola = new ArrayList<>();
    FileInputStream FIS;
    BufferedInputStream BIS;
    public Player player;
    public long tiempoPausa;
    public long duracionCancion;
    public String direccionCancion;

    @Override
    public void mouseClicked(MouseEvent e) {
        String boton = (((JButton) e.getSource()).getActionCommand());
        switch (boton) {
            case ("reproducir"):
                reproducir();
                break;
            case ("stop"):
                parar();
                break;
            case ("resume"):
                continuar();
                break;
            case ("pause"):
                pausar();
                break;
            case ("añadirCancion"):
                añadirCancion();
                break;
            case ("añadirAlbum"):
                añadirAlbum();
                break;
            case ("añadirLista"):
                añadirLista();
                break;
        }
    }

    public ReproduccionController(Principal principal) {
        this.principal = principal;
        controller = new Controller(principal);
    }

    public void parar() {
        if (player != null) {
            player.close();
            tiempoPausa = 0;
            duracionCancion = 0;
        }
    }

    public void pausar() {
        if (player != null) {
            try {
                tiempoPausa = FIS.available();
                player.close();
            } catch (IOException ex) {

            }

        }
    }

    public void reproducir() {

        int indice = principal.getjTableColaReproduccion().getSelectedRow();
        if (indice != -1) {
            int id = Integer.parseInt(principal.getjTableColaReproduccion().getValueAt(indice, 0).toString());
            Canciones cancion = controller.getCanciones().get(id);
            String path = Canciones.URL_CATALOGO + cancion.getId() + "_" + cancion.getNombre() + ".mp3";
            try {
                FIS = new FileInputStream(path);
                BIS = new BufferedInputStream(FIS);

                player = new Player(BIS);
                duracionCancion = FIS.available();
                direccionCancion = path + "";

            } catch (FileNotFoundException | JavaLayerException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);

            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        if (player != null) {
                            player.play();
                            if (player.isComplete() && player != null) {
                                parar();
                            }
                        }
                    } catch (JavaLayerException ex) {

                    }
                }
            }.start();
        }
    }

    public void continuar() {

        try {
            FIS = new FileInputStream(direccionCancion);
            BIS = new BufferedInputStream(FIS);

            player = new Player(BIS);
            FIS.skip(duracionCancion - tiempoPausa);

        } catch (FileNotFoundException | JavaLayerException ex) {

        } catch (IOException ex) {

        }

        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {

                }
            }
        }.start();

    }

    public void actualizarColaReproduccion() {
        DefaultTableModel modeloTablaCompra = (DefaultTableModel) principal.getjTableColaReproduccion().getModel();
        modeloTablaCompra.setRowCount(0);
        for (Canciones cancion : cola) {
            modeloTablaCompra.addRow(new Object[]{
                cancion.getId(),
                cancion.getNombre(),
                controller.getArtistas().get(cancion.getArtista()),
                controller.getAlbumes().get(cancion.getAlbum())});
        }

    }

    void añadirCancion() {
        int indice = principal.getjTableCanciones().getSelectedRow();
        if (indice != -1) {
            int id = Integer.parseInt(principal.getjTableCanciones().getValueAt(indice, 0).toString());
            Canciones cancion = controller.getCanciones().get(id);
            if (cancion.getPrecio() == 0) {
                cola.add(cancion);
                principal.mostrarMensaje("Se añadió al final de la cola de reproducción");
                actualizarColaReproduccion();
            }
        }

    }

    void añadirLista() {
        int indice = principal.getjTableListas().getSelectedRow();
        if (indice != -1) {
            int id = Integer.parseInt(principal.getjTableListas().getValueAt(indice, 0).toString());
            Listas lista = controller.getListas().get(id);
            cola.addAll(lista.getCanciones());
            actualizarColaReproduccion();
            principal.mostrarMensaje("Se añadió al final de la cola de reproducción");

        }
    }

    void añadirAlbum() {
        int indice = principal.getjTableAlbumes().getSelectedRow();
        if (indice != -1) {
            int id = Integer.parseInt(principal.getjTableAlbumes().getValueAt(indice, 0).toString());
            Albumes album = controller.getAlbumes().get(id);
            cola.addAll(controller.getCancionesAlbum(album));
            actualizarColaReproduccion();
            principal.mostrarMensaje("Se añadió al final de la cola de reproducción");
        }
    }
}
