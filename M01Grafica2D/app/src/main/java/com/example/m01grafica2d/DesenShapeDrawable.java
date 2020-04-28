package com.example.m01grafica2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

public class DesenShapeDrawable extends View {
    public DesenShapeDrawable(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        ShapeDrawable patrat=new ShapeDrawable(new RectShape());
        patrat.setBounds(100,100,500,500);
        patrat.getPaint().setColor(Color.GREEN);
        patrat.draw(canvas);

        ShapeDrawable elipsa=new ShapeDrawable(new OvalShape());
        elipsa.setBounds(100,600,1000,1100);
        elipsa.getPaint().setColor(Color.MAGENTA);
        elipsa.draw(canvas);
    }
}
