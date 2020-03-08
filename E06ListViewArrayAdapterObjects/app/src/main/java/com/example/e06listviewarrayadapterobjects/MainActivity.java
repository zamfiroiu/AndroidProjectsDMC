package com.example.e06listviewarrayadapterobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Cafea> cafele = new ArrayList<>();
        cafele.add(new Cafea("Caramel",200));
        cafele.add(new Cafea("Scortisoara",180));
        cafele.add(new Cafea("Ciocolata",300));

        ArrayAdapter<Cafea> adapter=
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_list_item_1,
                        cafele);

        ListView lv=findViewById(R.id.listView);
        lv.setAdapter(adapter);

    }
}
