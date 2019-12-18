/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.generos;

/**
 *
 * @author Pardo
 */
public class Generos {

    private int id;
    private String nombre;
    private String descipcion;

    public Generos(int id, String nombre, String descipcion) {
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public Generos(String nombre, String descipcion) {
        this.nombre = nombre;
        this.descipcion = descipcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
