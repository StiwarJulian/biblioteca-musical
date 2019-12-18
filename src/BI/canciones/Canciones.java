/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.canciones;

import java.sql.Date;

/**
 *
 * @author Pardo
 */
public class Canciones {

    public static String URL_CATALOGO = System.getProperty("user.dir") + "\\catalogo\\";
    private int id;
    private String nombre;
    private int artista;
    private int genero;
    private int compositor;
    private Date fechaLanzamiento;
    private int calificacion;
    private Object album;
    private double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getArtista() {
        return artista;
    }

    public void setArtista(int artista) {
        this.artista = artista;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getCompositor() {
        return compositor;
    }

    public void setCompositor(int compositor) {
        this.compositor = compositor;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Object getAlbum() {
        return album;
    }

    public void setAlbum(int album) {
        this.album = album;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Canciones(int id, String nombre, int artista, int genero, int compositor, Date fechaLanzamiento, int calificacion, Object album, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.calificacion = calificacion;
        this.album = album;
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Canciones other = (Canciones) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre + "-" + artista;
    }

}
