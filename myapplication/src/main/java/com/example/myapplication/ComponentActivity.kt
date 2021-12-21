package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class ComponentActivity : AppCompatActivity() {
    @Inject
    lateinit var dog: Dog
    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplicationProvider).myComponentProvider().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component)
        println(dog)
    }
}