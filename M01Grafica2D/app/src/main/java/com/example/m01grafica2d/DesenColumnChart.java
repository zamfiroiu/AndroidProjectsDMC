package com.example.m01grafica2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DesenColumnChart extends View {
    public DesenColumnChart(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint paint=new Paint();
        int startP=100;
        int latimeColoana=50;

        //desenam pe suprafata 100 - 800 pe verticala
        //acest lucru presupune ca cea mai mare coloana sa fie de la 100 la 800;
        //o coloana mai mica pleaca de la 400 si merge tot pana la 800.
        //deoarece pe 800 este linia de baza a graficului.
        for(int i=0;i<8;i++){
            paint.setColor(Color.rgb(((i+2)*23)%256,(i*79)%256,(i*157)%256));
            canvas.drawRect(startP,
                    800-((i+1)*100),
                    startP+latimeColoana,
                    800,
                    paint
            );
            startP+=latimeColoana*2;
        }

    }
}
