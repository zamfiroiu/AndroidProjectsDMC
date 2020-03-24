package com.example.g01parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Cafea cafea=getIntent().getParcelableExtra("cafea");
        Toast.makeText(this, cafea.toString(), Toast.LENGTH_SHORT).show();
    }
}
