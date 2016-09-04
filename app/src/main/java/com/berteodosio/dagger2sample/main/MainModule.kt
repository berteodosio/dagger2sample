package com.berteodosio.dagger2sample.main

import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import com.berteodosio.dagger2sample.main.view.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainModule(val mainActivity: MainActivity) {

    @Provides
    fun provideMainPresenter(): MainPresenter {
        return MainPresenter(mainActivity)
    }
}