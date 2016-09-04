package com.berteodosio.dagger2sample.main.di

import com.berteodosio.dagger2sample.base.BaseContract
import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent : BaseContract.Component {

    fun inject(mainPresenter: MainPresenter)

}