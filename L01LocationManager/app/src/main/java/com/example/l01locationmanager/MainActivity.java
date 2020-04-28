package com.example.l01locationmanager;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        LocatieListener locatieListener = new LocatieListener(this);
        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {

            } else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        1234);
            }
            return;
        }

        lm.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                3000,
                0,
                locatieListener);

        Location locatie = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        if (locatie != null) {
            //Toast.makeText(this, "" + locatie.getLatitude() + ":" + locatie.getLongitude(), Toast.LENGTH_SHORT).show();


            if (Geocoder.isPresent()) {
                Geocoder geo = new Geocoder(getApplicationContext());
                try {
                    List<Address> adrese = geo.getFromLocation(
                            locatie.getLatitude(),
                            locatie.getLongitude(),
                            1);

                    if (adrese != null && adrese.size() > 0) {
                       // String adresa = adrese.get(0).getAddressLine(0);

                        StringBuilder builder=new StringBuilder();
                        builder.append(adrese.get(0).getCountryName());
                        builder.append(" - ");
                        builder.append(adrese.get(0).getLocality());

                        Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
