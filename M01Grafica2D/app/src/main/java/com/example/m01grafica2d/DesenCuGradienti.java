package com.example.m01grafica2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.view.View;

public class DesenCuGradienti extends View {
    public DesenCuGradienti(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int culoareRosie = Color.RED;
        int culoareRGB = Color.rgb(35,200,160);
        int culoareARGB=Color.argb(50,45,222,120);

        Shader gradientLiniar=
                new LinearGradient(
                        0,
                        0,
                        500,
                        500,
                        culoareRosie,
                        culoareRGB,
                        Shader.TileMode.MIRROR
                );

        Shader gradientCircular=new RadialGradient(
                500,
                500,
                400,
                culoareRosie,
                culoareRGB,
                Shader.TileMode.REPEAT
        );

//        Shader gradientUnghiular=
//                new SweepGradient(
//                        500,
//                        500,
//                        culoareRosie,
//                        Color.BLUE
//                );
        //utilizare gradient circular
        Paint paint=new Paint();
        paint.setShader(gradientCircular);
        canvas.drawRect(300,300,700,700,paint);

//        //utilizare gradientLiniar
//        Paint paint=new Paint();
//        paint.setShader(gradientLiniar);
//        canvas.drawRect(300,300,700,700,paint);

        //utilizare gradientUnghiular
        //Paint paint=new Paint();
        //paint.setShader(gradientUnghiular);
        //canvas.drawRect(0,0,1000,1000,paint);
    }
}
