package com.example.d07controalesimpleprocedurale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        //adaugare TextView
        TextView tv=new TextView(this);
        tv.setText(R.string.tv1_text);
        ll.addView(tv);

        //Adaugare EditText
        EditText et = new EditText(this);
        et.setText("");
        et.setHint(R.string.et1_hint);
        et.setLayoutParams(
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
        ll.addView(et);

        //Adaugare Buton
        Button buton = new Button(this);
        buton.setText(R.string.btn_text);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.gravity= Gravity.CENTER_HORIZONTAL;
        buton.setLayoutParams(lp);
        buton.setGravity(Gravity.RIGHT);

        ll.addView(buton);
        setContentView(ll);
    }
}
