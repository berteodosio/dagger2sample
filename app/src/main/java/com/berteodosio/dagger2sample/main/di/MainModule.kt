package com.berteodosio.dagger2sample.main.di

import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.business.MainUseCases
import dagger.Module
import dagger.Provides

@Module
class MainModule(val mainView: MainContract.View) {

    @Provides
    fun provideMainUseCases(): MainContract.UseCases {
        return MainUseCases()
    }

    @Provides
    fun provideMainView(): MainContract.View {
        return mainView
    }

}