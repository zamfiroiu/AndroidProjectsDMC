package com.example.h02roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static CafeaDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database = Room.databaseBuilder(
                this,
                CafeaDatabase.class,
                "CafeaDatabase"
        ).allowMainThreadQueries().build();
    }

    public void selectMethod(View view) {
        List<Cafea> cafele=database.cafeaDAO().getAllCafele();
        Toast.makeText(this, cafele.toString(), Toast.LENGTH_SHORT).show();
    }

    public void insertMethod(View view) {
        Cafea cafea=new Cafea("Caramel",300);
        database.cafeaDAO().insertCafea(cafea);
    }
}
