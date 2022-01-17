package com.example.android.dagger_example

import android.util.Log
import javax.inject.Inject

class NIcelCadmiumBaterry @Inject constructor(): Battery {
    override fun getPower() {
        Log.i("MYTAG", "Power from NickelCadmiumBaterry")
    }
}