package com.example.android.dagger_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerSmartPhoneComponent.create().inject(this)
        smartPhone.makeCall()
//        val smartPhone = SmartPhone(Battery(), SIMCard(ServiceProvider()), MemoryCard()) //Construct injection
//        smartPhone.makeCall()
    }
}