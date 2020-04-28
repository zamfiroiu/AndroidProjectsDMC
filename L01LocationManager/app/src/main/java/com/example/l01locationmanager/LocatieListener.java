package com.example.l01locationmanager;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

public class LocatieListener implements LocationListener {
    private Context ctx;
    public LocatieListener(Context ctx) {
        this.ctx = ctx;
    }
    @Override
    public void onLocationChanged(Location location) {
//        Toast.makeText(ctx, "" +
//                location.getLatitude() + ":" + location.getLongitude(),
//                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
