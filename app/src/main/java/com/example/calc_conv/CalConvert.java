package com.example.calc_conv;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalConvert extends AppCompatActivity {

    TextView tvnombre;
    TextView tvvalor;
    float numero1 = 0.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_convert);
        tvvalor = findViewById(R.id.tvvalor);
    }


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
}