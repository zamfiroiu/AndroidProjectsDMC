package com.example.m01grafica2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DesenPieChart extends View {
    public DesenPieChart(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        for (int i = 0; i < 4; i++) {
            paint.setColor(Color.rgb((i*23)%256,(i*79)%256,(i*157)%256));
            canvas.drawArc(
                    100,
                    100,
                    600,
                    600,
                    90*i,
                    90,
                    true,
                    paint
            );
        }
    }
}
