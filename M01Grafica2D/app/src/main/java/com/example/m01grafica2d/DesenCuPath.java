package com.example.m01grafica2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class DesenCuPath extends View {
    public DesenCuPath(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Path cale=new Path();
        cale.addArc(
                300,
                300,
                700,
                700,
                270,
                120
        );

        Paint instrument=new Paint();
        instrument.setTextSize(70);
        instrument.setColor(Color.BLUE);

        canvas.drawTextOnPath(
                "Text curbat",
                cale,
                0,
                0,
                instrument
        );

    }
}
