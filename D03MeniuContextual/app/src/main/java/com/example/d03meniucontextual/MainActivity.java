package com.example.d03meniucontextual;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=findViewById(R.id.tv);
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_meniu, menu);
        menu.setHeaderTitle("Alege o optiune:");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.optiune1){
            Toast.makeText(getApplicationContext(),"Ati ales Optiunea 1",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.optiune2){
            Toast.makeText(getApplicationContext(),"Ati ales Optiunea 2",Toast.LENGTH_LONG).show();
        }else if(item.getItemId()==R.id.optiune3) {
            Toast.makeText(getApplicationContext(), "Ati ales Optiunea 3", Toast.LENGTH_LONG).show();
        } else {
            return false;
        }
        return true;
    }
}
