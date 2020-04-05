package com.example.draggerdemoapp

import android.util.Log

/** let's assume, this is a library/sdk class which can not be modified, using this class as dependency **/
class MemoryCard {

    init {
        Log.v(Utils.TAG, "MemoryCard Constructed ...")
    }
}