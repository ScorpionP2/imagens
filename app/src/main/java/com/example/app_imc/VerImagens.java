package com.example.app_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VerImagens extends AppCompatActivity {
ImageView img;
int cont=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_imagens);
        getSupportActionBar().setTitle("Ver imagens");
        img = (ImageView)findViewById(R.id.img_Ver_Imagens);
    }

    public void mudarImagem(View v){
        if((v==findViewById(R.id.btnProximaImagem))&&(cont<5)){
            cont++;
        }
        else if((v==findViewById(R.id.btnImagemAnterior))&&(cont>1)){
            cont--;
        }
        switch(cont){
            case 1:
                img.setImageResource(R.drawable.patinho);
                break;
            case 2:
                img.setImageResource(R.drawable.gardem);
                break;
            case 3:
                img.setImageResource(R.drawable.cachorro);
                break;
            case 4:
                img.setImageResource(R.drawable.porquinho);
                break;
            case 5:
                img.setImageResource(R.drawable.happy);
                break;
        }
    }
}
