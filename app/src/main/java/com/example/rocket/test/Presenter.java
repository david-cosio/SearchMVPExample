package com.example.rocket.test;

import com.example.rocket.test.model.Libro;
import com.example.rocket.test.model.ListaLibros;

import java.util.ArrayList;

/**
 * Created by rocket on 15/03/18.
 */

public class Presenter implements Interface.Presenter {

    private Interface.View view;
    private Interface.Model    model;

    public Presenter(Interface.View view){
        this.view   =   view;
        model   =   new Model(this);

    }

    @Override
    public ArrayList<String> search(String query) {
       if(query != ""){
           System.out.println(query);
          return model.search(query);
       }
       return model.load();
    }
    @Override
    public ArrayList<String> load() {
        return model.load();
    }
}
