package com.example.i04asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getImages(View view) {
        GetImages getImages=new GetImages(){
            @Override
            protected void onProgressUpdate(Integer... values) {
                ProgressBar pb=findViewById(R.id.progress);
                pb.setProgress(values[0]);
            }

            @Override
            protected void onPostExecute(List<Bitmap> bitmaps) {
                LinearLayout ll=findViewById(R.id.linearLayout);
                for(Bitmap imagine:bitmaps){
                    ImageView iv=new ImageView(getApplicationContext());
                    iv.setImageBitmap(imagine);
                    ll.addView(iv);
                }
            }
        };
        List<String> links=new ArrayList<>();
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Adj.-Pr.-Chindris-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Adj.-Diaconita-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Adj.-Feraru-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Adj.-Neculcea-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Adj.-Nistor-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Maj.-Bureaca-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Maj.-Buduleci-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Maj.-Moldovan-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Maj.-Olar-Pop-min-200x300.jpeg");
        links.add("https://mta.ro/wp-content/uploads/2019/12/Sd.-Plt.-Maj.-Baluta-min-200x300.jpeg");

        ProgressBar pb=findViewById(R.id.progress);
        pb.setIndeterminate(false);
        pb.setMax(links.size());

        getImages.execute(links);

    }
}
