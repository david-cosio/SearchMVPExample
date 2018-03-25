package com.example.rocket.test.model;

import java.io.Serializable;

/**
 * Created by rocket on 15/03/18.
 */

public class Autor implements Serializable{
    private int codigo;
    private String  apellido;
    private String  nombres;

    public Autor()  {}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
