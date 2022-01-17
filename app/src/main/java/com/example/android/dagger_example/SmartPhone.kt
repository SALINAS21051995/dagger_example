package com.example.android.dagger_example

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {
    init{
        battery.getPower()
        simCard.geConnection()
        memoryCard.getSpaceAvailablity()
    }

    fun makeCall(){

        Log.i("MYTAG", "Making a call...")
    }
}