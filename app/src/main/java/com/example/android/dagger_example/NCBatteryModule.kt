package com.example.android.dagger_example

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NCBatteryModule {
    @Binds
    abstract fun providesNCBattery(nIcelCadmiumBaterry: NIcelCadmiumBaterry):Battery
}