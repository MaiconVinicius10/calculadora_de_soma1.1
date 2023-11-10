package com.example.calculadoradesoma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //criando minhas variaveis globais
    double valor1,valor2,somar,res;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //criando metodo somar
    public void somar(View view){
        //recebendo os valores
        EditText valor1 = (EditText)findViewById(R.id.text_Valor1);
        EditText valor2 = (EditText)findViewById(R.id.text_Valor2);
        TextView somar = (TextView) findViewById(R.id.text_Resultado);


        double n1 = Double.parseDouble(valor1.getText().toString());
        double n2 = Double.parseDouble(valor2.getText().toString());
        double calculo= n1+n2;

        somar.setText("Resultado da soma é:"+calculo);



    }
}