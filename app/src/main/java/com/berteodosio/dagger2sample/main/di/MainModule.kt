package com.berteodosio.dagger2sample.main.di

import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.business.MainUseCases
import com.berteodosio.dagger2sample.main.business.MainUseCasesImpl
import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule(val mainView: MainContract.View) {

    @Provides
    fun provideMainPresenter(): MainPresenter {
        return MainPresenter()
    }

    @Provides
    fun provideMainUseCases(): MainUseCases {
        return MainUseCasesImpl()
    }

    @Provides
    fun provideMainView(): MainContract.View {
        return mainView
    }

}