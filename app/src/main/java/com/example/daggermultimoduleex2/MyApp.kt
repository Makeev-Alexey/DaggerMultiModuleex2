package com.example.daggermultimoduleex2

import android.app.Application
import com.example.myapplication.DaggerMyapplicationComponent
import com.example.myapplication.MyApplicationProvider
import com.example.myapplication.MyapplicationComponent


class MyApp : Application(), MainComponentProvider, MyApplicationProvider {
    override fun onCreate() {
        super.onCreate()
    }

    override fun mainComponentBuilder(): MainComponent {
        return DaggerMainComponent.builder().build()
    }

    override fun myComponentProvider(): MyapplicationComponent {
        return DaggerMyapplicationComponent.builder().build()
    }
}