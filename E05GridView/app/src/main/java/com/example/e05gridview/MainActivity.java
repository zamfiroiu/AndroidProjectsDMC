package com.example.e05gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> elemente=new ArrayList<>();
        elemente.add("Elementul 1");
        elemente.add("Elementul 2");
        elemente.add("Elementul 3");
        elemente.add("Elementul 4");
        elemente.add("Elementul 5");
        elemente.add("Elementul 6");
        elemente.add("Elementul 7");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                elemente);
        GridView gv=findViewById(R.id.gridView);
        gv.setAdapter(adapter);
    }
}
