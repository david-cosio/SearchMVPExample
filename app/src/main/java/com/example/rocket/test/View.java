package com.example.rocket.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rocket.test.model.Libro;

import java.util.ArrayList;

public class View extends AppCompatActivity implements Interface.View{
    private EditText    query;
    private ListView    list;
    private Interface.Presenter    presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        query   =   (EditText)findViewById(R.id.query);
        list  =   findViewById(R.id.list);
        presenter   =   new Presenter(this);
        load();
        System.out.println("Welcome Gustavo");
    }

    public void search(android.view.View view) {
        System.out.println(query.getText().toString());
        System.out.println(presenter.search(query.getText().toString()));
        ArrayAdapter adapter    =   new ArrayAdapter(this,  android.R.layout.simple_list_item_activated_1,  presenter.search(query.getText().toString()));
        list.setAdapter(adapter);

        if(presenter.search((query.getText().toString())).isEmpty()){
            Toast.makeText(this, "No hay resultados", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Busqueda Exitosa", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public void load() {
        System.out.println("Lista cargada");
        ArrayAdapter adapter    =   new ArrayAdapter(this,  android.R.layout.simple_list_item_activated_1,  presenter.load());
        list.setAdapter(adapter);
    }


}
