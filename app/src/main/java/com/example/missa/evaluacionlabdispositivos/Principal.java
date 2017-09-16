package com.example.missa.evaluacionlabdispositivos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    private Button btnEstudiante;
    private Button btnListaEstudiante;
    public static int GUARDADO=47;
   // private AdaptadorEstudiante adaptadorEstudiante;
    private ArrayList<Estudiante> listaestudiante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        this.btnEstudiante= (Button) findViewById(R.id.btnEstudiante);
        this.btnListaEstudiante= (Button) findViewById(R.id.btnLista);


        this.btnListaEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Principal.this,Activity_Estudiante.class);
                startActivity(intent);
            }
        });

        this.btnListaEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Principal.this,Estudiante.class);
                startActivity(intent);
            }
        });
    }
}
