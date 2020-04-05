package com.example.draggerdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var smartPhone: SmartPhone

    @Inject lateinit var battery: MobileBattery

    @Inject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //smartPhone = DaggerSmartPhoneComponent.create().getSmartPhone()

        val daggerSmartPhoneComponent = DaggerSmartPhoneComponent.create()
        daggerSmartPhoneComponent.inject(this)
        smartPhone.makeACall()
        battery.getBatteryState()

    }
}
