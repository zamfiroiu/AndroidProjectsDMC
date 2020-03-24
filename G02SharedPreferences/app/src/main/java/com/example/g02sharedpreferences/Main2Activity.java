package com.example.g02sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void citestePreferinte(View view) {
        SharedPreferences sp;
        sp = getSharedPreferences("sharedPref", MODE_PRIVATE);
        String mesaj = sp.getString("mesaj", "");
        int valoare = sp.getInt("valoare", 0);
        Toast.makeText(this,
                mesaj + ":" + valoare,
                Toast.LENGTH_SHORT).show();

    }
}
