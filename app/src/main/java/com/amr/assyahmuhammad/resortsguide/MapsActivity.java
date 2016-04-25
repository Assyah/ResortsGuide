package com.amr.assyahmuhammad.resortsguide;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.view.MenuItem;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        }
        else {}

        // Add markers.
        final LatLng PalaceResort = new LatLng(26.427721, 43.911891); //Create new marker & setup their coordinates
        Marker palaceresort = mMap.addMarker(new MarkerOptions().position(PalaceResort).title("Palace Resort").snippet("")); // Setup the name of the location
        palaceresort.showInfoWindow();

        final LatLng StrawberryResort = new LatLng(26.427836, 43.911205);
        Marker strawberryresort = mMap.addMarker(new MarkerOptions().position(StrawberryResort).title("Strawberry Resort").snippet(""));
        strawberryresort.showInfoWindow();

        final LatLng Lindalana = new LatLng(26.338790, 43.924912);
        Marker lindalana = mMap.addMarker(new MarkerOptions().position(Lindalana).title("Linda lana").snippet(""));
        lindalana.showInfoWindow();

        final LatLng Tulip = new LatLng(26.324060, 43.865161);
        Marker tulip = mMap.addMarker(new MarkerOptions().position(Tulip).title("Tulip").snippet(""));
        tulip.showInfoWindow();

        final LatLng Bana = new LatLng(26.442635, 43.909391);
        Marker bana = mMap.addMarker(new MarkerOptions().position(Bana).title("Bana").snippet(""));
        bana.showInfoWindow();

        final LatLng Sakora = new LatLng(26.351075, 43.880339);
        Marker sakora = mMap.addMarker(new MarkerOptions().position(Sakora).title("Sakora").snippet(""));
        sakora.showInfoWindow();

        final LatLng Nurses = new LatLng(26.429902, 43.911516);
        Marker nurses = mMap.addMarker(new MarkerOptions().position(Nurses).title("Nurses").snippet(""));
        nurses.showInfoWindow();

        final LatLng Noralea = new LatLng(26.439452, 43.910197);
        Marker noralea = mMap.addMarker(new MarkerOptions().position(Noralea).title("Noralea").snippet(""));
        noralea.showInfoWindow();

        final LatLng BlackGolden = new LatLng(26.443143, 43.910463);
        Marker blackgolden = mMap.addMarker(new MarkerOptions().position(BlackGolden).title("Black Gold").snippet(""));
        blackgolden.showInfoWindow();

        final LatLng Paradise = new LatLng(26.373846, 44.022476);
        Marker paradise = mMap.addMarker(new MarkerOptions().position(Paradise).title("Paradise").snippet(""));
        paradise.showInfoWindow();

        final LatLng Kabron = new LatLng(26.373428, 44.023416);
        Marker kabron = mMap.addMarker(new MarkerOptions().position(Kabron).title("Kabron").snippet(""));
        kabron.showInfoWindow();

        final LatLng Ghanaty = new LatLng(26.380882, 44.046502);
        Marker ghanaty = mMap.addMarker(new MarkerOptions().position(Ghanaty).title("Kabron").snippet(""));
        ghanaty.showInfoWindow();
    }}