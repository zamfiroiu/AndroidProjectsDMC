package com.example.i04asynctask;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GetImages
        extends AsyncTask<List<String>, Integer, List<Bitmap>> {


    @Override
    protected List<Bitmap> doInBackground(List<String>... lists) {
        List<Bitmap> imagini = new ArrayList<>();
        List<String> strings=lists[0];
        int index=0;
        for (String link:strings) {
            HttpURLConnection con = null;
            try {
                URL url = new URL(link);
                con = (HttpURLConnection) url.openConnection();
                if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    InputStream is = con.getInputStream();
                    imagini.add(BitmapFactory.decodeStream(is));
                    Thread.sleep(1000);
                    publishProgress(++index);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (con != null) {
                    con.disconnect();
                }
            }
        }
        return imagini;
    }
}
