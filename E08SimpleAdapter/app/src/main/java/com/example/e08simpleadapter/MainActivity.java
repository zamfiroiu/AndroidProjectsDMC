package com.example.e08simpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=findViewById(R.id.listView);

        List<Cafea> cafele = new ArrayList<>();
        cafele.add(new Cafea("Caramel",200));
        cafele.add(new Cafea("Scortisoara",180));
        cafele.add(new Cafea("Ciocolata",300));

        String AROMA="AROMA";
        String CANTITATE="CANTITATE";
        List<Map<String,String>> cafeleMapate=new ArrayList<>();
        for(Cafea c:cafele){
            Map<String,String> cafea=new HashMap<>();
            cafea.put(AROMA,c.getAroma());
            cafea.put(CANTITATE,""+c.getCantitate());
            cafeleMapate.add(cafea);
        }

        String[] atribute={AROMA,CANTITATE};
        int[]identificatori={android.R.id.text1,android.R.id.text2};

        SimpleAdapter adapter=
                new SimpleAdapter(
                        this,
                        cafeleMapate,
                        android.R.layout.simple_list_item_2,
                        atribute,
                        identificatori);
        lv.setAdapter(adapter);
    }
}
