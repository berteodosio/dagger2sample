package com.berteodosio.dagger2sample.di.main

import com.berteodosio.dagger2sample.domain.main.MainContract
import com.berteodosio.dagger2sample.domain.main.MainUseCases
import com.berteodosio.dagger2sample.presentation.main.presenter.MainPresenter
import dagger.Module
import dagger.Provides

@Module
open class MainModule(val mainView: MainContract.View) {

    @Provides
    fun provideMainPresenter(mainPresenter: MainPresenter): MainContract.Presenter = mainPresenter

    @Provides
    open fun provideMainUseCases(mainUseCases: MainUseCases): MainContract.UseCases = mainUseCases

    @Provides
    fun provideMainView(): MainContract.View {
        return mainView
    }

}