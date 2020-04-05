package com.example.draggerdemoapp

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){

    init {
        Log.v(Utils.TAG, "Battery Constructed ...")
    }

    fun getBatteryState(){
        Log.v(Utils.TAG, "battery charged!")
    }
}