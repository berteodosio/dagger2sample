package com.berteodosio.dagger2sample.di.main

import com.berteodosio.dagger2sample.data.main.MainDataRepository
import com.berteodosio.dagger2sample.domain.base.ObserveSchedulerWrapper
import com.berteodosio.dagger2sample.domain.base.SubscribeSchedulerWrapper
import com.berteodosio.dagger2sample.domain.main.MainContract
import com.berteodosio.dagger2sample.domain.main.MainUseCases
import com.berteodosio.dagger2sample.domain.model.MainRepository
import com.berteodosio.dagger2sample.presentation.main.presenter.MainPresenter
import dagger.Module
import dagger.Provides
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

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

    @Provides
    fun provideMainRepository(mainDataRepository: MainDataRepository): MainRepository = mainDataRepository

    @Provides
    fun provideSubscribeScheduler() = SubscribeSchedulerWrapper(Schedulers.newThread())

    @Provides
    fun provideObserveScheduler() = ObserveSchedulerWrapper(AndroidSchedulers.mainThread())

}