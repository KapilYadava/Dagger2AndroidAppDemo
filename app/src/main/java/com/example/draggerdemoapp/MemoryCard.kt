package com.example.draggerdemoapp

import android.util.Log
import javax.inject.Inject


class MemoryCard @Inject constructor(){

    init {
        Log.v(Utils.TAG, "MemoryCard Constructed ...")
    }
}