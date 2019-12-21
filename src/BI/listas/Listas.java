/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.listas;

import BI.canciones.Canciones;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Pardo
 */
public class Listas {
    private int id;
    private Date fechaCreacion;
    private String nombre;
    private ArrayList<Canciones> canciones;
    private int usuario;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public Listas(int id, Date fechaCreacion, String nombre, ArrayList<Canciones> canciones, int usuario) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.nombre = nombre;
        this.canciones = canciones;
        this.usuario = usuario;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public Listas() {
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
        final Listas other = (Listas) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
}
