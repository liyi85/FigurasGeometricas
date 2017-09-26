package com.example.andrearodriguez.figurasgeometricas;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by andrearodriguez on 9/25/17.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView titulo,contenido;
    ImageView figura;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        titulo= (TextView)itemView.findViewById(R.id.titulo);
        contenido= (TextView)itemView.findViewById(R.id.contenido);
        figura=(ImageView)itemView.findViewById(R.id.figura);
    }
}
