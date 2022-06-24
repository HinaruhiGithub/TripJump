package com.example.tripjump

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tripjump.Destination.BaseMap.IShowBaseMap
import com.example.tripjump.Destination.PlaceCollection.ISetPlace
import com.example.tripjump.Destination.WaitShow.IShowWait

class MainActivity : AppCompatActivity(), IShowBaseMap, ISetPlace, IShowWait {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}