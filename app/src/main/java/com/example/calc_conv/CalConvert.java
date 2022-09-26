package com.example.calc_conv;

import static android.text.method.TextKeyListener.clear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalConvert extends AppCompatActivity implements View.OnClickListener{


    EditText editText;

    EditText nombre;
    TextView tvnombre;
    TextView tvvalor;
    float numero1 = 0.0f;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;

    Button activar;
    Button clear;
    Button dr;
    Button usa;
    Button punto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_convert);
        tvvalor = findViewById(R.id.tvvalor);
        tvnombre = findViewById(R.id.tvnombre);

        Bundle recibeDatos = getIntent().getExtras();
        String info = recibeDatos.getString("KeyDatos");

        tvnombre.setText(info);


        //Declaracion de los botones
        nombre = findViewById(R.id.nombre);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);

        //Declaracion de los botones funcionales, como clear, DR, y US

        clear = findViewById(R.id.clear_text);
        dr = findViewById(R.id.pesos);
        usa = findViewById(R.id.americano);
        punto = findViewById(R.id.punto);

        //editText


        num1.setOnClickListener(this);
        num1.setEnabled(false);
        num2.setEnabled(false);
        num3.setEnabled(false);
        num4.setEnabled(false);
        num5.setEnabled(false);
        num6.setEnabled(false);
        num7.setEnabled(false);
        num8.setEnabled(false);
        num9.setEnabled(false);
        num0.setEnabled(false);
        clear.setEnabled(false);
        dr.setEnabled(false);
        usa.setEnabled(false);
        punto.setEnabled(false);




        nombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().equals("")) {
                    num1.setEnabled(false);
                    num2.setEnabled(false);
                    num3.setEnabled(false);
                    num4.setEnabled(false);
                    num5.setEnabled(false);
                    num6.setEnabled(false);
                    num7.setEnabled(false);
                    num8.setEnabled(false);
                    num9.setEnabled(false);
                    num0.setEnabled(false);
                    clear.setEnabled(false);
                    dr.setEnabled(false);
                    usa.setEnabled(false);
                    punto.setEnabled(false);



                }else{
                    num1.setEnabled(true);
                    num2.setEnabled(true);
                    num3.setEnabled(true);
                    num4.setEnabled(true);
                    num5.setEnabled(true);
                    num6.setEnabled(true);
                    num7.setEnabled(true);
                    num8.setEnabled(true);
                    num9.setEnabled(true);
                    num0.setEnabled(true);
                    clear.setEnabled(true);
                    dr.setEnabled(true);
                    usa.setEnabled(true);
                    punto.setEnabled(true);
                    tvnombre.setText(nombre.getText().toString());
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().equals("")) {
                    num1.setEnabled(false);
                    num2.setEnabled(false);
                    num3.setEnabled(false);
                    num4.setEnabled(false);
                    num5.setEnabled(false);
                    num6.setEnabled(false);
                    num7.setEnabled(false);
                    num8.setEnabled(false);
                    num9.setEnabled(false);
                    num0.setEnabled(false);
                    clear.setEnabled(false);
                    dr.setEnabled(false);
                    usa.setEnabled(false);
                    punto.setEnabled(false);
                }else{
                    num1.setEnabled(true);
                    num2.setEnabled(true);
                    num3.setEnabled(true);
                    num4.setEnabled(true);
                    num5.setEnabled(true);
                    num6.setEnabled(true);
                    num7.setEnabled(true);
                    num8.setEnabled(true);
                    num9.setEnabled(true);
                    num0.setEnabled(true);
                    clear.setEnabled(true);
                    dr.setEnabled(true);
                    usa.setEnabled(true);
                    punto.setEnabled(true);
                    for (int i = 10; i == i; ++i ){

                        if (nombre.length() <10)
                        {
                            tvnombre.setText(nombre.getText().toString());
                            break;

                        }

                    }






                }

            }
        });
    }


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Botones...
    public void numero7(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("7");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "7");
        }
    }

    public void numero4(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("4");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "4");
        }
    }


    public void numero1(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("1");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "1");
        }
    }

    public void numero0(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("0");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "0");
        }
    }

    public void numero8(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("8");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "8");
        }
    }

    public void numero5(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("5");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "5");
        }
    }

    public void numero2(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("2");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "2");
        }
    }

    public void numero9(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("9");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "9");
        }
    }

    public void numero6(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("6");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "6");
        }
    }

    public void numero3(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText("3");
        }
        else{
            tvvalor.setText(tvvalor.getText() + "3");
        }
    }

    public void clear_text(View view) {
        tvvalor.setText("0");
        numero1 = 0.0f;
    }

    public void pesos(View view) {
        String procedimiento = tvvalor.getText().toString();

        String rpesos = "";

            String valor = procedimiento.toString();
            double resultado = Integer.parseInt(valor);
            resultado = resultado * 53.50;

            rpesos = String.valueOf(resultado);

        tvvalor.setText(rpesos);

    }

    public void Dolares(View view) {
        String procedimiento = tvvalor.getText().toString();

        String rdolar = "";

            String valor = procedimiento.toString();
            double resultado = Integer.parseInt(valor);
            resultado = resultado / 53.50;

            rdolar = String.valueOf(resultado);

        tvvalor.setText(rdolar);


    }

    public void punto(View view) {
        numero1 = Float.parseFloat(tvvalor.getText().toString());
        if (numero1 == 0.0f){
            tvvalor.setText(".");
        }
        else{
            tvvalor.setText(tvvalor.getText() + ".");
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.num1: {
                nombre.setText("");
                break;
            }
        }

    }
}