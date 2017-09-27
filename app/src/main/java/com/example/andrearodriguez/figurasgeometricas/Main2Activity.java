package com.example.andrearodriguez.figurasgeometricas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    String [] arreglo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle datos = this.getIntent().getExtras();
        int posicion = datos.getInt("posicion");
        Lienzo lienzo = new Lienzo(this);
        setContentView(lienzo);
        arreglo = getResources().getStringArray(R.array.figuras);

        switch (posicion){
            case 0:
                setTitle(arreglo[posicion]);

                break;
            case 1:
                setTitle(arreglo[posicion]);
                break;
            case 2:
                setTitle(arreglo[posicion]);
                break;
            case 3:
                setTitle(arreglo[posicion]);
                break;
            case 4:
                setTitle(arreglo[posicion]);
                break;
        }
        lienzo.figura = posicion;

    }

}

