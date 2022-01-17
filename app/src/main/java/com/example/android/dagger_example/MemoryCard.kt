package com.example.android.dagger_example

import android.util.Log

class MemoryCard{
    init{
        Log.i("MYTAG", "Memory Card Constructed")

    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG", "Memory space available")
    }
}