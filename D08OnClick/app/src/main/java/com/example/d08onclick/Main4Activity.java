package com.example.d08onclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void deschideUrmatoareActivitate(View view) {
        Intent it=new Intent(getApplicationContext(), Main5Activity.class);
        startActivity(it);
    }
}
