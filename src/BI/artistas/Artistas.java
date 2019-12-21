/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.artistas;

import java.sql.Date;

/**
 *
 * @author Pardo
 */
public class Artistas {
    
    private int id;
    private String primerNombre;
    private String primerApellido;
    private String nombreArtistico;
    private Date fechaNacimiento;
    private Date fechaDefuncion;
    private int pais;
    private String descripcion;
    private int genero;
    private String segundoApellido;
    private String segundoNombre;

    public Artistas(String primerNombre, String primerApellido, String nombreArtistico, Date fechaNacimiento, Date fechaDefuncion, int pais, String descripcion, int genero, String segundoApellido, String segundoNombre) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.nombreArtistico = nombreArtistico;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.pais = pais;
        this.descripcion = descripcion;
        this.genero = genero;
        this.segundoApellido = segundoApellido;
        this.segundoNombre = segundoNombre;
    }

    public Artistas(int id, String primerNombre, String primerApellido, String nombreArtistico, Date fechaNacimiento, Date fechaDefuncion, int pais, String descripcion, int genero, String segundoApellido, String segundoNombre) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.nombreArtistico = nombreArtistico;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.pais = pais;
        this.descripcion = descripcion;
        this.genero = genero;
        this.segundoApellido = segundoApellido;
        this.segundoNombre = segundoNombre;
    }

    
    
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombreArtistico;
    }

    public Artistas() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Artistas other = (Artistas) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
