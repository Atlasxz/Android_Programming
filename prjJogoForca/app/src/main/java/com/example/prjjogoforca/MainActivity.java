package com.example.prjjogoforca;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btnJogar, btnNovo;
    ImageView imgCabeca, imgPernas, imgCorpo;
    TextView txtNome, lbl1, lbl2, lbl3;
    int Erros = 0;



    private void playSound() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.aplausos);
        mediaPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String palavra = "SOL";

        btnJogar = findViewById(R.id.btnJogar);
        btnNovo = findViewById(R.id.btnNovo);
        imgCabeca = findViewById(R.id.imgCabeca);
        imgPernas = findViewById(R.id.imgPernas);
        imgCorpo = findViewById(R.id.imgCorpo);
        txtNome = findViewById(R.id.txtNome);
        lbl1 = findViewById(R.id.lbl1);
        lbl2 = findViewById(R.id.lbl2);
        lbl3 = findViewById(R.id.lbl3);

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNome.setText("");
                lbl1.setText("");
                lbl2.setText("");
                lbl3.setText("");
                Erros = 0;
                imgCabeca.setImageResource(0);
                imgCorpo.setImageResource(0);
                imgPernas.setImageResource(0);
            }
        });

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = txtNome.getText().toString().toUpperCase();

                Erros = 0;
                try {
                    if(texto.toString()==""){

                        txtNome.setText("Insira 3 letras");

                    }else {
                        char a = palavra.charAt(0);
                        char b = palavra.charAt(1);
                        char c = palavra.charAt(2);

                        char d = texto.charAt(0);
                        char e = texto.charAt(1);
                        char f = texto.charAt(2);



                        if (d != a){
                            lbl1.setText("?");
                            Erros = Erros + 1;
                        }
                        else {
                            lbl1.setText(""+d);
                        }
                        if (e != b){
                            lbl2.setText("?");
                            Erros = Erros + 1;

                        }
                        else{
                            lbl2.setText(""+e);
                        }
                        if (f != c){
                            lbl3.setText("?");
                            Erros = Erros + 1;

                        }
                        else {
                            lbl3.setText(""+f);
                        }
                        if(Erros==0){
                            playSound();
                        }
                        if(Erros==1){
                            imgCabeca.setImageResource(R.drawable.img1);

                        } else if (Erros==2) {
                            imgCabeca.setImageResource(R.drawable.img1);
                            imgCorpo.setImageResource(R.drawable.img2);

                        } else if (Erros==3) {
                            imgCabeca.setImageResource(R.drawable.img1);
                            imgCorpo.setImageResource(R.drawable.img2);
                            imgPernas.setImageResource(R.drawable.img3);
                        }
                    }
                }
                catch (Exception e){
                    Toast.makeText(getBaseContext(),"Insira EXATAMENTE 3 letras",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}