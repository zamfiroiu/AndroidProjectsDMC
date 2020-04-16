package com.example.j02jsonparsing;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class JSONParser extends AsyncTask<String, Void, List<RataSchimb>> {
    @Override
    protected List<RataSchimb> doInBackground(String... strings) {
        URL url= null;
        try {
            List<RataSchimb> lista=new ArrayList<>();
            url = new URL(strings[0]);
            HttpURLConnection http=(HttpURLConnection)url.openConnection();

            InputStream inputStream=http.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder=new StringBuilder();
            String linie=null;
            while((linie=reader.readLine())!=null){
                builder.append(linie);
            }

            JSONObject object=new JSONObject(builder.toString());
            //JSONObject dataset=object.getJSONObject("DataSet");
            JSONObject body=object.getJSONObject("Body");
            JSONObject cube=body.getJSONObject("Cube");
            JSONArray rates=cube.getJSONArray("Rate");
            for(int i=0;i<rates.length();i++){
                JSONObject currency=rates.getJSONObject(i);
                RataSchimb rate=new RataSchimb(
                        currency.getString("@currency"),
                        Double.parseDouble(currency.getString("#text"))
                );
                lista.add(rate);
            }

            return lista;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;
    }

    public static class GetJSON extends AsyncTask<String, Void, List<Double>>{

        @Override
        protected List<Double> doInBackground(String... strings) {
            List<Double> rezultat=new ArrayList<>();
            try {
                URL url=new URL(strings[0]);
                HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
                InputStream inputStream=httpURLConnection.getInputStream();

                BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
                String linie=null;
                StringBuilder builder=new StringBuilder();
                while((linie=reader.readLine())!=null){
                    builder.append(linie);
                }
                JSONObject object =new JSONObject(builder.toString());
                JSONArray vector=object.getJSONArray("DailyForecasts");
                JSONObject primulObiect=vector.getJSONObject(0);
                JSONObject temperatura=primulObiect.getJSONObject("Temperature");
                JSONObject minim=temperatura.getJSONObject("Minimum");
                JSONObject maxim=temperatura.getJSONObject("Maximum");

                double min=minim.getDouble("Value");
                double max=maxim.getDouble("Value");
                rezultat.add(min);
                rezultat.add(max);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return rezultat;
        }
    }
}

