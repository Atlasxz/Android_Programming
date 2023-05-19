package com.example.prjcalculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSomar=findViewById(R.id.btnSomar);
        Button btnSubtrair=findViewById(R.id.btnSubtrair);
        Button btnMultiplicar=findViewById(R.id.btnMultiplicar);
        Button btnDividir=findViewById(R.id.btnDividar);
        Button btnSeno=findViewById(R.id.btnSeno);
        Button btnPi=findViewById(R.id.btnPi);

        EditText ET_valor1=findViewById(R.id.ET_valor1);
        EditText ET_valor2=findViewById(R.id.ET_valor2);
        TextView TV_Mensagem=findViewById(R.id.TV_Mensagem);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    num1=Double.parseDouble(ET_valor1.getText().toString());
                    num2=Double.parseDouble(ET_valor2.getText().toString());
                    res=num1+num2;

                    String result = String.valueOf(res);

                    TV_Mensagem.setText(result);
                    Toast.makeText(getBaseContext(),result,Toast.LENGTH_LONG).show();
                }
                catch (Exception erro){

                    TV_Mensagem.setText("Erro encontrado:\n"+erro);
                }
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{
                    num1=Double.parseDouble(ET_valor1.getText().toString());
                    num2=Double.parseDouble(ET_valor2.getText().toString());
                    res=num1-num2;

                    String result = String.valueOf(res);

                    TV_Mensagem.setText(result);
                }
                catch (Exception erro){

                    TV_Mensagem.setText("Erro encontrado:\n"+erro);
                }
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    num1=Double.parseDouble(ET_valor1.getText().toString());
                    num2=Double.parseDouble(ET_valor2.getText().toString());
                    res=num1*num2;

                    String result = String.valueOf(res);

                    TV_Mensagem.setText(result);
                }
                catch (Exception erro){

                    TV_Mensagem.setText("Erro encontrado:\n"+erro);
                }
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    num1=Double.parseDouble(ET_valor1.getText().toString());
                    num2=Double.parseDouble(ET_valor2.getText().toString());
                    res=num1/num2;

                    String result = String.valueOf(res);

                    TV_Mensagem.setText(result);
                }
                catch (Exception erro){

                    TV_Mensagem.setText("Erro encontrado:\n"+erro);
                }
            }
        });

        btnSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double angulo = Double.parseDouble(ET_valor1.getText().toString());
                    double angRad = Math.toRadians(angulo);

                    double sin = Math.sin(angRad);
                    String result = String.valueOf(sin);
                    TV_Mensagem.setText(result);
                }
                catch (Exception erro){

                    TV_Mensagem.setText("Erro encontrado:\n"+erro);
                }


            }
        });
        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(ET_valor1.getText().toString());
                res= Math.PI;

                String result = String.valueOf(res);

                TV_Mensagem.setText(result);
            }
        });

    }
}