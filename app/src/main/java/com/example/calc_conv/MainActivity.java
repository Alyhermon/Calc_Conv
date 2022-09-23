package com.example.calc_conv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtnombre;
    Button btnsiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnombre = (EditText) findViewById(R.id.edtnombre);
        btnsiguiente = (Button) findViewById(R.id.btnsiguiente);
    }
    public void siguiente(View V){
        if (validar()){
            Toast.makeText(this, "Entrando...", Toast.LENGTH_SHORT).show();
            Bundle enviarDatos = new Bundle();
            enviarDatos.putString("keyDatos", edtnombre.getText().toString());
            Intent i = new Intent(this, CalConvert.class);
            i.putExtras(enviarDatos);
            startActivity (i);
        }

    }

    public boolean validar(){


        boolean retornar = true;
        String edt1 = edtnombre.getText().toString();
        if (edt1.isEmpty()){
            edtnombre.setError("Este campo esta vacio, Escriba su Nombre");
            retornar = false;
        }
        return retornar;
    }
}