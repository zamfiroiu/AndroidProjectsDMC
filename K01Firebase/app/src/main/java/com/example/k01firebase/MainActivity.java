package com.example.k01firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = null;
    DatabaseReference myRef = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Cafele");


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Iterable<DataSnapshot> cafele = dataSnapshot.getChildren();
                List<String> listaStringuri = new ArrayList<>();
                for (DataSnapshot ds : cafele) {
                    listaStringuri.add(ds.getValue().toString());
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, listaStringuri);
                ListView lv = findViewById(R.id.listView);
                lv.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
    }

    public void salveazaCafea(View view) {
        EditText aroma = findViewById(R.id.aromaET);
        EditText cantitate = findViewById(R.id.cantitateET);

        Cafea c = new Cafea(
                aroma.getText().toString(),
                Double.parseDouble(cantitate.getText().toString()));
        DatabaseReference cRef = myRef.child("Cafea" + c.hashCode());
        cRef.setValue(c);
    }
}
