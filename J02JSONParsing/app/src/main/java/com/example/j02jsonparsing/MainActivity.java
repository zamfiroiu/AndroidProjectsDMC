package com.example.j02jsonparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.JsonReader;
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
        JSONParser xmlParser=new JSONParser(){
            @Override
            protected void onPostExecute(List<RataSchimb> rates) {
                ListView listView =findViewById(R.id.listView);
                List<String> rateSchimb=new ArrayList<>();
                for(RataSchimb rate:rates){
                    rateSchimb.add(rate.toString());
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,rateSchimb);
                listView.setAdapter(adapter);
            }
        };
        xmlParser.execute("http://acs.ase.ro/Media/Default/documents/cts/zamfiroiu/curs2020/BNRRates.json.txt");


        JSONParser.GetJSON parser=new JSONParser.GetJSON(){

            @Override
            protected void onPostExecute(List<Double> doubles) {
                Toast.makeText(MainActivity.this, ""+doubles.get(0)+" - "+doubles.get(1), Toast.LENGTH_SHORT).show();
            }
        };
        parser.execute("http://dataservice.accuweather.com/forecasts/v1/daily/1day/287430?apikey=APIKEY&metric=true");

    }
}
