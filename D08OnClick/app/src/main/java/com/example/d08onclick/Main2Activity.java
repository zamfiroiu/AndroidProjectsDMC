package com.example.d08onclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn=findViewById(R.id.btn2);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it=new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(it);
    }
}
