package com.berteodosio.dagger2sample.dagger


import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.location.LocationManager
import com.berteodosio.dagger2sample.AppApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AndroidModule(val application: AppApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideLocationManager(): LocationManager {
        return application.getSystemService(LOCATION_SERVICE) as LocationManager
    }
}