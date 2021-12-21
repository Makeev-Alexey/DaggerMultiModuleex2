package com.example.daggermultimoduleex2

import dagger.Component

@Component(modules = [CatModule::class])
interface MainComponent {
    @Component.Builder
    interface Builder{
        fun build(): MainComponent
    }
    fun inject(mainActivity: MainActivity)
}