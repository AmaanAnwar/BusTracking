package com.np.bustracking;

import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class StudentMapsView extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_maps_view);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Lalghati = new LatLng(23.273151, 77.369912);
        LatLng truba = new LatLng(23.308832, 77.387583);
        mMap.addMarker(new MarkerOptions().position(Lalghati).title("Lalghati Bus Stop"));
        mMap.addMarker(new MarkerOptions().position(truba).title("Truba (Destination)"));
         mMap.moveCamera(CameraUpdateFactory.zoomTo(15f));
         mMap.moveCamera(CameraUpdateFactory.newLatLng(Lalghati));
    }
}

