package com.example.draggerdemoapp

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(val serviceProvider: ServiceProvider){

    init {
        Log.v(Utils.TAG, "SimCard Constructed ...")
    }

}