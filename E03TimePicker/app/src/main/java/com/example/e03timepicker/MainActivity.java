package com.example.e03timepicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimePicker tp=findViewById(R.id.tp1);
//        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//                Toast.makeText(MainActivity.this, "Ora selectata:"+hourOfDay+":"+minute, Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    //@RequiresApi(api = Build.VERSION_CODES.M)
    public void seteazaOra(View view) {
        TimePicker tp=findViewById(R.id.tp1);
        Toast.makeText(this,
                "Ora selectata:"+
                        tp.getCurrentHour()+
                        ":"+
                        tp.getCurrentMinute(),
                Toast.LENGTH_SHORT).show();
    }
}
