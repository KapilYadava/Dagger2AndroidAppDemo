package com.example.draggerdemoapp


import android.util.Log


class SmartPhone(val battery: Battery, val simCard: SimCard, val memoryCard: MemoryCard){

    init {
        Log.v(Utils.TAG, "SmartPhone Constructed ...")
    }

    fun makeACall(){
        Log.v(Utils.TAG,"Making a call ...")
    }
}