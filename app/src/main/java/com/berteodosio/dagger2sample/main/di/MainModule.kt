package com.berteodosio.dagger2sample.main.di

import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.business.MainUseCases
import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import dagger.Module
import dagger.Provides

@Module
open class MainModule(val mainView: MainContract.View) {

    @Provides
    fun provideMainPresenter(mainView: MainContract.View, mainUseCases: MainContract.UseCases): MainContract.Presenter {
        return MainPresenter(mainView, mainUseCases)
    }

    @Provides
    open fun provideMainUseCases(): MainContract.UseCases {
        return MainUseCases()
    }

    @Provides
    fun provideMainView(): MainContract.View {
        return mainView
    }

}