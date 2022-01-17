package com.example.android.dagger_example

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard():MemoryCard{
        return MemoryCard()
    }
}