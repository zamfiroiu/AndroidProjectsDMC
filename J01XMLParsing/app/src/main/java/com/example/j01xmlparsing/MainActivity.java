package com.example.j01xmlparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BNRRatesParser xmlParser=new BNRRatesParser(){
            @Override
            protected void onPostExecute(List<RataSchimb> rates) {
                ListView listView = findViewById(R.id.listView);
                List<String> rateSchimb=new ArrayList<>();
                for(RataSchimb rate:rates){
                    rateSchimb.add(rate.toString());
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,rateSchimb);
                listView.setAdapter(adapter);
            }
        };
        xmlParser.execute("https://www.bnr.ro/nbrfxrates.xml");
    }
}
