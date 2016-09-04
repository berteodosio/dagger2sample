package com.berteodosio.dagger2sample.dagger

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidModule::class))
interface ApplicationComponent {

//    fun inject(application: Application)

    // all parameters of methods in this interface must be supplied by modules of this interface
//    fun injectA(mainActivity: MainActivity)

}