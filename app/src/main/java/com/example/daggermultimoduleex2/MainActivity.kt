package com.example.daggermultimoduleex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggermultimoduleex2.databinding.ActivityMainBinding
import com.example.myapplication.ComponentActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    @Inject
    lateinit var cat: Cat
    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainComponentProvider).mainComponentBuilder().inject(this)
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        println(cat)
        binding.button.setOnClickListener{
            var intent = Intent(this, ComponentActivity::class.java)
            startActivity(intent)
        }
    }
}