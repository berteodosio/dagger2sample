package com.berteodosio.dagger2sample.main.di

import com.berteodosio.dagger2sample.base.view.BaseActivity
import com.berteodosio.dagger2sample.base.BaseContract
import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import com.berteodosio.dagger2sample.main.view.MainActivity
import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent : BaseContract.Component {

    fun inject(mainPresenter: MainPresenter)

    fun inject(baseActivity: BaseActivity<MainContract.Presenter, BaseContract.Component>)

    fun inject(mainActivity: MainActivity)

    fun getMainPresenter(): MainContract.Presenter

    fun getMainUseCases(): MainContract.UseCases

}