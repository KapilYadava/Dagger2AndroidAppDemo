package com.example.draggerdemoapp


import android.util.Log
import javax.inject.Inject


class SmartPhone @Inject constructor(private val battery: Battery, val simCard: SimCard, val memoryCard: MemoryCard){

    init {
        Log.v(Utils.TAG, "SmartPhone Constructed ...")
        //battery.getBatteryState()
    }

    fun makeACall(){
        Log.v(Utils.TAG,"Making a call ...")
    }
}