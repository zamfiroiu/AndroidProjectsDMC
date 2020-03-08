package com.example.d01fragmentesimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);
        }else{
            setContentView(R.layout.landscape_activity);
        }
    }

    public void deschideFragment1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameID, new Fragment1()).commit();
    }

    public void deschideFragment2(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameID, new Fragment2()).commit();
    }
}
