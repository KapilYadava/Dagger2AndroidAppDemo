package com.example.draggerdemoapp

import dagger.Binds
import dagger.Module

@Module
abstract class MobileBatteryModules {

    @Binds
    abstract fun getMobileBattery(mobileBattery: MobileBattery): Battery
}