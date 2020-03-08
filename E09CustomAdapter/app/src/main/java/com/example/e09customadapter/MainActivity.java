package com.example.e09customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Cafea> cafele = new ArrayList<>();
        cafele.add(new Cafea("Caramel",200,R.drawable.caramel));
        cafele.add(new Cafea("Scortisoara",180,R.drawable.scortisoara));
        cafele.add(new Cafea("Ciocolata",300,R.drawable.ciocolata));

        CafeaAdapter adapter=new CafeaAdapter(this,cafele);
        ListView lv=findViewById(R.id.listView);
        lv.setAdapter(adapter);
    }
}
