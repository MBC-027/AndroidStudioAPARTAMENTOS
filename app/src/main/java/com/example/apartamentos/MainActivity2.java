package com.example.apartamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btnapartamentos;
    Button btnrequisitos;
    Button btncontacto;
    Button btnservicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnapartamentos=findViewById(R.id.btnapartamentos);
        btnapartamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity3.class));



        btnrequisitos=findViewById(R.id.btnrequisitos);
        btnrequisitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity4.class));



        btncontacto=findViewById(R.id.btncontacto);
        btncontacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity5.class));




        btnservicios=findViewById(R.id.btnservicios);
        btnservicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity6.class));
            }
        });

            }
        });
            }
        });
            }
        });






    }
}