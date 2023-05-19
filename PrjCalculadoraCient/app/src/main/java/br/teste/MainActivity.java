package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3,
            btn4, btn5, btn6,
            btn7, btn8, btn9,
            btnSoma, btnSub, btnVezes,btnDividir,
            btnSin, btnCos, btnRaiz, btnPi, btnElevado, btnLimpar, btnResultado;

    Double v1 = 0.0;
    Double total;
    String op ="";
    TextView lblDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn9 = findViewById(R.id.btn9);
        btn8 = findViewById(R.id.btn8);
        btn7 = findViewById(R.id.btn7);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btn0 = findViewById(R.id.btn0);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnCos = findViewById(R.id.btnCos);
        btnSin = findViewById(R.id.btnSin);
        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnVezes = findViewById(R.id.btnVezes);
        btnDividir = findViewById(R.id.btnDividir);
        btnPi = findViewById(R.id.btnPi);
        btnElevado = findViewById(R.id.btnElevado);
        btnResultado = findViewById(R.id.btnResultado);
        btnRaiz = findViewById(R.id.btnRaiz);
        lblDisplay = findViewById(R.id.lblDisplay);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(lblDisplay.getText().toString()+"9");
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblDisplay.setText("");
                v1 = 0.0;
            }
        });
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    v1 = Double.parseDouble(lblDisplay.getText().toString());
                    lblDisplay.setText("");
                    op = "+";
                }catch(Exception erro){
                    Toast.makeText(getBaseContext(),"ERR",Toast.LENGTH_LONG).show();

                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    v1 = Double.parseDouble(lblDisplay.getText().toString());
                    lblDisplay.setText("");
                    op = "-";
                }catch(Exception erro){
                    Toast.makeText(getBaseContext(),"ERR",Toast.LENGTH_LONG).show();

                }
            }
        });
        btnVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    v1 = Double.parseDouble(lblDisplay.getText().toString());
                    lblDisplay.setText("");
                    op = "*";
                }catch(Exception erro){
                    Toast.makeText(getBaseContext(),"ERR",Toast.LENGTH_LONG).show();

                }
            }
        });btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    v1 = Double.parseDouble(lblDisplay.getText().toString());
                    lblDisplay.setText("");
                    op = "/";
                }catch(Exception erro){
                    Toast.makeText(getBaseContext(),"ERR",Toast.LENGTH_LONG).show();

                }
            }
        });
        btnElevado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    v1 = Double.parseDouble(lblDisplay.getText().toString());
                    lblDisplay.setText("");
                    op = "^";
                }catch(Exception erro){
                    Toast.makeText(getBaseContext(),"ERR",Toast.LENGTH_LONG).show();

                }

            }
        });
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(op.equals("+")){
                        Double v2 = Double.parseDouble(lblDisplay.getText().toString());
                        total = v1+v2;
                        lblDisplay.setText(total.toString());
                    }
                    if(op.equals("-")){
                        Double v2 = Double.parseDouble(lblDisplay.getText().toString());
                        total = v1-v2;
                        lblDisplay.setText(total.toString());
                    }
                    if(op.equals("*")){
                        Double v2 = Double.parseDouble(lblDisplay.getText().toString());
                        total = v1*v2;
                        lblDisplay.setText(total.toString());
                    }
                    if(op.equals("/")){
                        Double v2 = Double.parseDouble(lblDisplay.getText().toString());
                        total = v1/v2;
                        lblDisplay.setText(total.toString());
                    }
                    if(op.equals("^")){
                        Double v2 = Double.parseDouble(lblDisplay.getText().toString());
                        Double total = Math.pow(v1, v2);
                        lblDisplay.setText(total.toString());
                    }
                }catch (Exception erro){
                    Toast.makeText(getBaseContext(),"Erro Encontrado",Toast.LENGTH_LONG).show();
                }

            }
        });
        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Pi = Math.PI;

                if(lblDisplay.getText().toString().equals("0"))
                {
                    lblDisplay.setText("");
                }
                lblDisplay.setText(Pi.toString());

            }
        });
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String txt = lblDisplay.getText().toString();
                    v1 = Double.parseDouble(txt);
                    Double result = Math.sqrt(v1);
                    lblDisplay.setText(result.toString());
                }catch(Exception erro){
                    Toast.makeText(getBaseContext(),"ERR",Toast.LENGTH_LONG).show();

                }


            }
        });


        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    v1 = Double.parseDouble(lblDisplay.getText().toString());
                    Double rad = v1 * (Math.PI/180);
                    Double total = Math.cos(rad);
                    lblDisplay.setText(total.toString());
                }catch(Exception erro){
                    Toast.makeText(getBaseContext(),"ERR",Toast.LENGTH_LONG).show();

                }

            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    v1 = Double.parseDouble(lblDisplay.getText().toString());
                    Double rad = v1 * (Math.PI/180);
                    Double total = Math.sin(rad);
                    lblDisplay.setText(total.toString());
                }catch(Exception erro){
                    Toast.makeText(getBaseContext(),"ERR",Toast.LENGTH_LONG).show();

                }


            }
        });

    }
}