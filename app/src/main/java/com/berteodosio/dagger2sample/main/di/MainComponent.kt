package com.berteodosio.dagger2sample.main.di

import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import com.berteodosio.dagger2sample.main.view.MainActivity
import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(mainPresenter: MainPresenter)

}