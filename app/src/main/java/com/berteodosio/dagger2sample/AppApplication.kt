package com.berteodosio.dagger2sample

import android.app.Application
import com.berteodosio.dagger2sample.dagger.ApplicationComponent

class AppApplication : Application() {

    var applicationComponent: ApplicationComponent? = null
        private set

    override fun onCreate() {
        super.onCreate()

        initDagger()
    }

    private fun initDagger() {
//        applicationComponent = DaggerApplicationComponent
//                .builder()
//                .androidModule(AndroidModule(this))
//                .build()
    }
}