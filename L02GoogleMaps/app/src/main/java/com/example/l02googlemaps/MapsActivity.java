package com.example.l02googlemaps;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

       // LatLng atm = new LatLng(44.418229, 26.086306);
     //   mMap.addMarker(new MarkerOptions().position(atm).title("Academia Tehnica Militara"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(atm));
//
//        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(atm,18));
//
//        Marker m= mMap.addMarker(new MarkerOptions().position(atm));

//        mMap.addPolygon((new PolygonOptions())
//                .add(new LatLng(-35.016, 143.321),
//                        new LatLng(-34.747, 145.592),
//                        new LatLng(-34.364, 147.891),
//                        new LatLng(-33.501, 150.217),
//                        new LatLng(-32.306, 149.248),
//                        new LatLng(-32.491, 147.309)));
//        mMap.addMarker(new MarkerOptions().position(new LatLng(-35.016, 143.321)));
//        mMap.addMarker(new MarkerOptions().position(new LatLng(-34.747, 145.592)));
//        mMap.addMarker(new MarkerOptions().position(new LatLng(-34.364, 147.891)));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(-32.491, 147.309)));


      mMap.addCircle(new CircleOptions()
                .center(new LatLng(37.4, -122.1))
                .radius(1000000));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(37.4, -122.1)));

    }
}
