package com.example.draggerdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        smartPhone = DaggerSmartPhoneComponent.create().getSmartPhone()
        smartPhone.makeACall()

    }
}
