package com.example.daggermultimoduleex2

import dagger.Module
import dagger.Provides

@Module
class CatModule {
    @Provides
    fun createCat() =  Cat()
}