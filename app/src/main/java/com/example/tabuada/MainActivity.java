package com.example.tabuada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

  private   EditText campoNumero;
  private   TextView campoTabDo,campoResultado;
  private   Integer numero,resultado;
    private  String r="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNumero = findViewById(R.id.editNumero);
        campoTabDo = findViewById(R.id.textTabuadaDo);
        campoResultado = findViewById(R.id.textResultado);

    }

    public void gerarTabuada(View view){
        String n = campoNumero.getText().toString();
          campoTabDo.setText("do: "+n);
           numero =Integer.parseInt(n);
        for(int i=1;i<11;i++){
                 r+=(numero+" x "+i+" = "+numero*i+"\n");
            campoResultado.setText(r);

        }


    }
    public void limpar(View view){
        campoNumero.setText("");
        campoTabDo.setText("");
        campoResultado.setText("");

    }




}
