package com.example.andrearodriguez.figurasgeometricas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String [] arreglo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle datos = this.getIntent().getExtras();
        int posicion = datos.getInt("posicion");

        if (posicion < 4) {
            Lienzo lienzo = new Lienzo(this);
            setContentView(lienzo);
            lienzo.figura = posicion;
        }else if (posicion == 4) {
                LienzoLibre lienzoLibre = new LienzoLibre(this);
                setContentView(lienzoLibre);
        }

            arreglo = getResources().getStringArray(R.array.figuras);

            switch (posicion) {
                case 0:
                    setTitle(arreglo[posicion]);
                    Toast.makeText(this, R.string.mensaje_circulos, Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    setTitle(arreglo[posicion]);
                    Toast.makeText(this, R.string.mensaje_ovalos, Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    setTitle(arreglo[posicion]);
                    Toast.makeText(this, R.string.mensaje_cuadrados, Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    setTitle(arreglo[posicion]);
                    Toast.makeText(this, R.string.mensaje_rectangulos, Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    setTitle(arreglo[posicion]);
                    Toast.makeText(this, R.string.mensaje_libre, Toast.LENGTH_SHORT).show();
                    break;
            }

    }

}

