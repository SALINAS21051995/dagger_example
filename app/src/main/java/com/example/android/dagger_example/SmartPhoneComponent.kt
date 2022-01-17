package com.example.android.dagger_example

import dagger.Component

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone(): SmartPhone
}