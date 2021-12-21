package com.example.myapplication

import dagger.Component

@Component
interface MyapplicationComponent {
    @Component.Builder
    interface Builder{
        fun build(): MyapplicationComponent
    }
    fun inject(componentActivity: ComponentActivity)
}