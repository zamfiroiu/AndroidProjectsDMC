package com.example.m01grafica2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DesenPentruPaints extends View {
    public DesenPentruPaints(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint pensulaRosieDoarContur=new Paint();
        pensulaRosieDoarContur.setColor(Color.RED);
        pensulaRosieDoarContur.setStyle(Paint.Style.STROKE);
        pensulaRosieDoarContur.setStrokeWidth(8);

        canvas.drawRect(100,100,400,400,pensulaRosieDoarContur);


        Paint pensulaAlbastraFillStroke=new Paint();
        pensulaAlbastraFillStroke.setColor(Color.BLUE);
        pensulaAlbastraFillStroke.setStyle(Paint.Style.FILL_AND_STROKE);
        pensulaAlbastraFillStroke.setStrokeWidth(8);

        //canvas.drawRect(450,450,600,600,pensulaAlbastraFillStroke);
        canvas.drawArc(100,600,700,1200,270,200,false,pensulaAlbastraFillStroke);

        Paint creion=new Paint();
        creion.setTextSize(70);
        creion.setColor(Color.BLUE);
        creion.setTextAlign(Paint.Align.RIGHT);

        canvas.drawText("Text desenat",500,700,creion);

    }
}
