/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI.compositores;

/**
 *
 * @author Pardo
 */
public class Compositores {

    private int id;
    private String primerNombre;
    private String primerApellido;
    private int edad;
    private int pais;
    private String segundoNombre;
    private String segundoApellido;

    public Compositores(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int edad, int pais) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.pais = pais;
    }

    public Compositores(int id, String primerNombre, String primerApellido, int edad, int pais, String segundoNombre, String segundoApellido) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
        this.pais = pais;
        this.segundoNombre = segundoNombre;
        this.segundoApellido = segundoApellido;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return primerNombre + " " + primerApellido + " " + segundoNombre + " " + segundoApellido;
    }

}
