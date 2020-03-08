package com.example.e02datepicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker datePicker=findViewById(R.id.dp1);
        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(MainActivity.this, "Data selectata este:"+dayOfMonth+"/"+monthOfYear+"/"+year+".", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void selectDate(View view) {
        DatePicker datePicker=findViewById(R.id.dp1);
        Calendar c=new GregorianCalendar(
                datePicker.getYear(),
                datePicker.getMonth(),
                datePicker.getDayOfMonth());
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
        Date date=c.getTime();
        Toast.makeText(this, "Data:"+sdf.format(date), Toast.LENGTH_SHORT).show();
    }
}
