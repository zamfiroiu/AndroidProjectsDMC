package com.example.h01bazadedatesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afiseazaOCafea(View view) {
        DBAdapter adapter=new DBAdapter(this);
        adapter.openConnection();
        Cafea cafea=adapter.selectCafeaByAroma("Caramel");
        Toast.makeText(this, cafea.toString(), Toast.LENGTH_SHORT).show();
    }

    public void insereazaCafele(View view) {
        Cafea c1=new Cafea("Caramel",200);
        Cafea c2=new Cafea("Scortisoara",180);
        Cafea c3=new Cafea("Ciocolata",300);
        //obtinem un adapter
        DBAdapter adapter=new DBAdapter(this);
        //deschidem conexiunea
        adapter.openConnection();
        //inseram trei cafele
        adapter.insertCafea(c1);
        adapter.insertCafea(c2);
        adapter.insertCafea(c3);
    }
}
