package com.example.d02meniuprincipal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimatedImageDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.act1:{
                Intent it=new Intent(this,Main1Activity.class);
                startActivity(it);
            };
            case R.id.act2:{
                Intent it=new Intent(this,Main2Activity.class);
                startActivity(it);
            }
            case R.id.toast1:{
                Toast.makeText(this, "Mesaj 1 din meniu", Toast.LENGTH_SHORT).show();
            }
            case R.id.toast2:{
                Toast.makeText(this, "Mesaj 2 din Meniu", Toast.LENGTH_SHORT).show();
            }
        };
        return true;
    }
}
