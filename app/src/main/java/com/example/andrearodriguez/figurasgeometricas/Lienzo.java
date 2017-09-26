package com.example.andrearodriguez.figurasgeometricas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by andrearodriguez on 9/26/17.
 */

public class Lienzo extends View {

    float x = 200;
    float y = 200;
    int id = 0;


    public Lienzo(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorAccent));
        int alto = canvas.getHeight();
        int ancho = canvas.getWidth();

        paint.setStyle(Paint.Style.FILL);
        canvas.drawOval(x, y, x+90, y+50, paint);

    }
    public boolean onTouchEvent (MotionEvent event){
        int a = event.getAction();
        x = event.getX();
        y = event.getY();

        if(a==MotionEvent.ACTION_DOWN){
            id=1;
        }if (a == MotionEvent.ACTION_MOVE){
            id=2;
        }
        invalidate();
        return false;
    }

}