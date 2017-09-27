package com.example.andrearodriguez.figurasgeometricas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by andrearodriguez on 9/26/17.
 */

public class Lienzo extends View {

    float x = -40;
    float y = -40;
    int id = 0;
    int figura;

    Paint paint = new Paint();
    Path path = new Path();

    public Lienzo(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        paint.setColor(getResources().getColor(R.color.colorAccent));

        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);


        Path.Direction direction1 = Path.Direction.CW;
        canvas.drawPath(path, paint);

        switch (figura){
            case 0:
                path.addCircle(x, y, 50, direction1);
                break;
            case 1:
                path.addOval((x-60), (y-30), (x+60), (y+30), direction1);
                break;
            case 2:
                path.addRect((x-60), (y-60), (x+60), (y+60), direction1);
                break;
            case 3:
                path.addRect((x-60), (y-30), (x+60), (y+30), direction1);
                break;

        }

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