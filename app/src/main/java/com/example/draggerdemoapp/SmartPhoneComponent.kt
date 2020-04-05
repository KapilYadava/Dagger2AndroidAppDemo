package com.example.draggerdemoapp

import dagger.Component

@Component(modules = arrayOf(MemoryCardModules::class))
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone
}