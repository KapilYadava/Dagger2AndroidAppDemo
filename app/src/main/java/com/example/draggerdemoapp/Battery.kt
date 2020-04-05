package com.example.draggerdemoapp

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){

    init {
        Log.v(Utils.TAG, "Battery Constructed ...")
    }
}