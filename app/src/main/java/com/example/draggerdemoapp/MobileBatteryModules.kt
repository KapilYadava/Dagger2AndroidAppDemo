package com.example.draggerdemoapp

import dagger.Module
import dagger.Provides

@Module
class MobileBatteryModules {

    @Provides
    fun getMobileBattery(mobileBattery: MobileBattery): Battery{
        mobileBattery.getBatteryState()
        return mobileBattery
    }
}