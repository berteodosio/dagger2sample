package com.berteodosio.dagger2sample.main.di

import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.business.MainUseCases
import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule(val mainView: MainContract.View) {

    val component: MainComponent = DaggerMainComponent.builder().mainModule(this).build()

    @Provides
    fun provideMainPresenter(): MainContract.Presenter {
        val presenter = MainPresenter()
        component.inject(presenter)

        return presenter
    }

    @Provides
    fun provideMainUseCases(): MainContract.UseCases {
        return MainUseCases()
    }

    @Provides
    fun provideMainView(): MainContract.View {
        return mainView
    }

}