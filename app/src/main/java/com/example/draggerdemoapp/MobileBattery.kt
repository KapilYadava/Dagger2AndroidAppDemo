package com.example.draggerdemoapp

import android.util.Log
import javax.inject.Inject

class MobileBattery @Inject constructor(): Battery {

    override fun getBatteryState() {
        Log.v(Utils.TAG, "Battery Charged!")
    }
}