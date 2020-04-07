package com.example.i03threads;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private Bitmap bitmap = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Runnable runn=new Runnable() {
            @Override
            public void run() {
                HttpURLConnection con = null;
                try{
                    URL url=new URL("https://mta.ro/wp-content/uploads/2018/11/ferdinand.jpg");
                    con= (HttpURLConnection) url.openConnection();
                    if(con.getResponseCode()==HttpURLConnection.HTTP_OK){
                        InputStream is = con.getInputStream();
                        bitmap = BitmapFactory.decodeStream(is);
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                    if(con!=null){
                        con.disconnect();
                    }
                }
            }
        };
        Thread mythread = new Thread(runn);
        mythread.start();


    }

    public void getTheImage(View view) {
        ImageView iv=findViewById(R.id.imageView);
        iv.setImageBitmap(bitmap);
    }
}
