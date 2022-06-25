package com.example.tripjump

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tripjump.Destination.BaseMap.IShowBaseMap
import com.example.tripjump.Destination.PlaceCollection.ISetPlace
import com.example.tripjump.Destination.WaitShow.IShowWait
import android.view.View
import android.widget.TextView
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng


class MainActivity : AppCompatActivity(), IShowBaseMap, ISetPlace, IShowWait, OnMapReadyCallback {

    private val TAG: String = MainActivity::class.simpleName.toString()

    private lateinit var infoView: TextView;
    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_main)

        infoView = findViewById(R.id.info_view)
        val fragment =
            supportFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment?
        if (fragment != null) {
            Log.d(TAG, "onCreate: getMapAsync")
            fragment.getMapAsync(this)
        }
    }

    override fun onMapReady(map: GoogleMap) {
        Log.d(TAG, "onMapReady")
        val tokyo: LatLng = LatLng((35).toDouble(), (135).toDouble())
        map.moveCamera(CameraUpdateFactory.newLatLng(tokyo))
        this.map = map
    }
}