package com.example.rocket.test.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by rocket on 15/03/18.
 */

public class ListaLibros {

    public static ArrayList<Libro>    libros;

    static {

        libros  =   new ArrayList<Libro>();
        Autor a1,a2;
        Libro   l1,l2,l3,l4;

        a1  =   new Autor();
        a1.setCodigo(01);
        a1.setApellido("Borges");
        a1.setNombres("Jorge Luis");

        a2  =   new Autor();
        a2.setCodigo(02);
        a2.setApellido("Cortazar");
        a2.setNombres("Julio");

        l1  =   new Libro();
        l1.setCodigo(01);
        l1.setIsbn("AA1");
        l1.setNombre("La biblioteca de Babel");

        l1.setFechaEdicion(new Date());
        l1.setAutor(a1);

        libros.add(l1);

        l2  =   new Libro();
        l2.setCodigo(02);
        l2.setIsbn("BB1");
        l2.setNombre("Ficciones");

        l2.setFechaEdicion(new Date(80,1,1));
        l2.setAutor(a1);

        libros.add(l2);

        l3  =   new Libro();
        l3.setCodigo(01);
        l3.setIsbn("CC1");
        l3.setNombre("Casa Tomada");

        l3.setFechaEdicion(new Date(0,11,12));
        l3.setAutor(a2);

        libros.add(l3);

    }

    public static ArrayList<String> getLibros(){
        ArrayList<String> nombres = new ArrayList<String>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

        for (Libro libro:libros) {
            String fechaComoCadena = sdf.format(libro.getFechaEdicion());
            nombres.add(libro.getNombre()+  " - " + libro.getAutor().getApellido() + " " + libro.getAutor().getNombres() + " - " + fechaComoCadena);
        }
        return nombres;
    }

    public static ArrayList<String> getLibros(String query){
        System.out.println("Estamos Modelo 1");
        System.out.println(query);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

        ArrayList<String> nombres = new ArrayList<String>();
        for (Libro libro:libros) {
            String fechaComoCadena = sdf.format(libro.getFechaEdicion());

            if(query.toLowerCase().equals(libro.getAutor().getApellido().toLowerCase())){
                System.out.println("Estamos Modelo 2");
                nombres.add(libro.getNombre()+  " - " + libro.getAutor().getApellido() + " " + libro.getAutor().getNombres() + " - " + fechaComoCadena);

            }

        }
        return nombres;
    }
}
