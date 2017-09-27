package com.example.andrearodriguez.figurasgeometricas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by andrearodriguez on 9/27/17.
 */

public class LienzoLibre extends View{

    float x = 200;
    float y = 200;
    int id = 0;
    Path path = new Path();

    public LienzoLibre(Context context) {
        super(context);
    }
    public void onDraw (Canvas canvas){
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setStyle(paint.getStyle().STROKE);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);

        if(id==1){
            path.moveTo(x,y);

        }if(id==2){
            path.lineTo(x,y);

        }

        canvas.drawPath(path, paint);
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
        return true;
    }

}
