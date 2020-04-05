package com.example.draggerdemoapp

import dagger.Component

@Component(modules = arrayOf(MemoryCardModules::class, MobileBatteryModules::class))
interface SmartPhoneComponent {

    //fun getSmartPhone(): SmartPhone

    fun inject(mainActivity: MainActivity)
}