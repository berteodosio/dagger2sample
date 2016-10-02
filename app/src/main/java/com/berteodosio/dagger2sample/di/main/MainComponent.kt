package com.berteodosio.dagger2sample.di.main

import com.berteodosio.dagger2sample.domain.base.BaseContract
import com.berteodosio.dagger2sample.presentation.main.view.MainActivity
import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent : BaseContract.Component {

    fun inject(mainActivity: MainActivity)

}