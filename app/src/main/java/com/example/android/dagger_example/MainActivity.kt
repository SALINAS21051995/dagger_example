package com.example.android.dagger_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerSmartPhoneComponent.create().getSmartPhone().makeCall()
//        val smartPhone = SmartPhone(Battery(), SIMCard(ServiceProvider()), MemoryCard()) //Construct injection
//        smartPhone.makeCall()
    }
}