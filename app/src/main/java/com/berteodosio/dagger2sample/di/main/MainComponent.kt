package com.berteodosio.dagger2sample.di.main

import com.berteodosio.dagger2sample.presentation.base.view.BaseActivity
import com.berteodosio.dagger2sample.domain.base.BaseContract
import com.berteodosio.dagger2sample.domain.main.MainContract
import com.berteodosio.dagger2sample.presentation.main.presenter.MainPresenter
import com.berteodosio.dagger2sample.presentation.main.view.MainActivity
import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent : BaseContract.Component {

    fun inject(mainPresenter: MainPresenter)

    fun inject(baseActivity: BaseActivity<MainContract.Presenter, BaseContract.Component>)

    fun inject(mainActivity: MainActivity)

    fun getMainPresenter(): MainContract.Presenter

    fun getMainUseCases(): MainContract.UseCases

}