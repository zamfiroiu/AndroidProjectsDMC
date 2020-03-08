package com.example.e10listviewonitemclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Cafea> cafele = new ArrayList<>();
        cafele.add(new Cafea("Caramel",200,R.drawable.caramel));
        cafele.add(new Cafea("Scortisoara",180,R.drawable.scortisoara));
        cafele.add(new Cafea("Ciocolata",300,R.drawable.ciocolata));

        CafeaAdapter adapter=new CafeaAdapter(this,cafele);
        ListView lv=findViewById(R.id.listView);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cafele.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
