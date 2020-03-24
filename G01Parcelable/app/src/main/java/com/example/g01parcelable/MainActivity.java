package com.example.g01parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trimitereCafea(View view) {
        Cafea cafea=new Cafea("Ciocolata", 450);
        Intent it=new Intent(this,Main2Activity.class);
        it.putExtra("cafea", cafea);
        startActivity(it);
    }
}
