package com.qbitscience.androidgraphicstutorial;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyGraphics extends View {
    String myText="============";
    String qbit="Qbitscience";
    public MyGraphics(Context context) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(Color.GREEN);
        int height=getWidth();
        int width=getHeight();
        canvas.translate(height/2,width/2);
        Paint paint=new Paint();
        paint.setShadowLayer(5.0f,5.0f,7.0f,Color.BLACK);
        paint.setColor(Color.RED);
        canvas.drawCircle(0.0f,0.0f,43.0f,paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.YELLOW);
        for(int i=0;i<28;i++)
        {
            canvas.drawOval(new RectF(300.0f, 0.0f, 50, 30), paint);

             canvas.rotate(14);
        }
        paint.setColor(Color.BLACK);
        paint.setShadowLayer(5.0f,5.0f,7.0f,Color.BLACK);
        paint.setTextSize(70.0f);
        canvas.rotate(30);
        paint.setAlpha(70);
        canvas.drawText(myText,210,0,paint);
        canvas.translate(width/8,height);
        paint.setTextSize(50.0f);

        paint.setShadowLayer(10.0f,15.0f,15.0f,Color.BLACK);
        canvas.rotate(290);
        canvas.drawText(qbit,250.0f,10.0f,paint);

    }
}
