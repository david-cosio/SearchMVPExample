package com.example.rocket.test;

import com.example.rocket.test.model.Libro;
import com.example.rocket.test.model.ListaLibros;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by rocket on 15/03/18.
 */

public class Model implements Interface.Model {

    private Interface.Presenter    presenter;
    private ArrayList<String> lista;
    private ArrayList<String> result;

    public Model(Interface.Presenter    presenter){
        this.presenter  =   presenter;
    }

    @Override
    public ArrayList<String> search(String query) {

        lista   =   ListaLibros.getLibros(query);

        return lista;
    }
    @Override
    public ArrayList<String > load() {
        return ListaLibros.getLibros();
    }

}
