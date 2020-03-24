package com.example.g02sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salveazaSharePreferences(View view) {
        SharedPreferences sp;
        sp = getSharedPreferences("sharedPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("mesaj", "text salvat in preferinte");
        editor.putInt("valoare", 321);
        editor.commit();
    }

    public void urmatoareActivitate(View view) {
        Intent it=new Intent(this,Main2Activity.class);
        startActivity(it);
    }
}
