package com.example.draggerdemoapp

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {

    init {
        Log.v(Utils.TAG, "ServiceProvider Constructed ...")
    }
}