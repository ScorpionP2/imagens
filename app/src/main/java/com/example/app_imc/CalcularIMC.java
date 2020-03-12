package com.example.app_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CalcularIMC extends AppCompatActivity {
EditText txtPeso,txtAltura;
ImageView imgResultadoImc;
TextView txtRIMC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_imc);
        getSupportActionBar().setTitle("Calcular IMC");

        txtAltura = (EditText)findViewById(R.id.txtAltura);
        txtPeso = (EditText)findViewById(R.id.txtPeso);
        txtRIMC = (TextView) findViewById(R.id.rimc);

        imgResultadoImc = (ImageView)findViewById(R.id.imgResultadoImc);

    }

    public void calcularImc(View v){
        float peso=0,altura=0,imc=0;
        if((txtPeso.getText().toString().length()>0)&&(txtAltura.getText().toString().length()>0)){
            peso = Float.parseFloat(txtPeso.getText().toString());
            altura = Float.parseFloat(txtAltura.getText().toString());
            if ((peso>0)&&(altura>0)){
                imc=(peso/(altura*altura));
                if(imc<=18.5){
                    imgResultadoImc.setImageResource(R.drawable.abaixopeso);
                    txtRIMC.setText("Abaixo do peso");
                }
                else if((imc>=18.6)&&(imc<=24.9)){
                    imgResultadoImc.setImageResource(R.drawable.normal);
                    txtRIMC.setText("Normal");
                }
                else if((imc>=25.0)&&(imc<=29.9)){
                    imgResultadoImc.setImageResource(R.drawable.sobrepeso);
                    txtRIMC.setText("sobrepeso");
                }
                else if((imc>=30.0)&&(imc<=34.9)){
                    imgResultadoImc.setImageResource(R.drawable.obesidade1);
                    txtRIMC.setText("Obesidade 1");
                }
                else if((imc>=35.0)&&(imc<=39.9)){
                    imgResultadoImc.setImageResource(R.drawable.obesidade2);
                    txtRIMC.setText("Obesidade 2");
                }
                else if(imc>=40.0){
                    imgResultadoImc.setImageResource(R.drawable.obesidade3);
                    txtRIMC.setText("Obesidade 3");
                }
            }
            else{
                Toast.makeText(this, "Peso ou altura inválidos", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "Você deve preencher todos os campos para continuar", Toast.LENGTH_SHORT).show();
        }
    }
}
