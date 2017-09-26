package com.example.andrearodriguez.figurasgeometricas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by andrearodriguez on 9/25/17.
 */


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    String [] arreglo;
    String [] descripciones;

    Context context;
    LayoutInflater inflater;

    public RecyclerAdapter(Context context){
        this.context=context;
        inflater=LayoutInflater.from(context);
        arreglo = context.getResources().getStringArray(R.array.figuras);
        descripciones = context.getResources().getStringArray(R.array.descripciones);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_figuras,parent,false);
        RecyclerViewHolder view1= new RecyclerViewHolder(v);
        return view1;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.titulo.setText(arreglo[position]);
        holder.contenido.setText(descripciones[position]);

        switch (position){
            case 0:
                holder.figura.setImageResource(R.drawable.ic_circulo);
                break;
            case 1:
                holder.figura.setImageResource(R.drawable.ic_oval);
                break;
            case 2:
                holder.figura.setImageResource(R.drawable.ic_cuadrado);
                break;
            case 3:
                holder.figura.setImageResource(R.drawable.ic_rectangulo);
                break;
            case 4:
                holder.figura.setImageResource(R.drawable.ic_libre);
                break;

        }

        holder.figura.setOnClickListener(onClickListener);
        holder.figura.setTag(holder);

    }
    View.OnClickListener onClickListener= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vh=(RecyclerViewHolder)v.getTag();
            int posicion = vh.getAdapterPosition();
            Toast.makeText(context,"La posicion es"+posicion,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(context, Main2Activity.class);
            intent.putExtra("posicion", posicion);
            context.startActivity(intent);

        }
    };

    @Override
    public int getItemCount() {
        return arreglo.length;
    }
}
