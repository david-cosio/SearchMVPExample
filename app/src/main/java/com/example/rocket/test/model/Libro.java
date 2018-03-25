package com.example.rocket.test.model;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by rocket on 15/03/18.
 */

public class Libro  implements Serializable {
    private int codigo;
    private String  isbn;
    private String  nombre;
    private Date    fechaEdicion;
    private Autor   autor;

    public Libro()  {}


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
