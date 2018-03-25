package com.example.rocket.test;

import java.util.ArrayList;

import com.example.rocket.test.model.Autor;
import com.example.rocket.test.model.Libro;

/**
 * Created by rocket on 15/03/18.
 */

public interface Interface {

    interface   View{
        void load();
    }

    interface Presenter{
        ArrayList<String> search(String query);
        ArrayList<String> load();
    }

    interface Model{
        ArrayList<String>    search(String data);
        ArrayList<String>    load();
    }
}
