package com.example.draggerdemoapp

import dagger.Component

@Component
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone
}