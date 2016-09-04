package com.berteodosio.dagger2sample.main.presenter

import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.business.MainUseCases
import javax.inject.Inject

class MainPresenter() {

    @Inject
    lateinit var view: MainContract.View

    @Inject
    lateinit var mainUseCases: MainUseCases

    fun onCreate() {
        view.displayHelloMessage()
        view.displayGeneralMessage(mainUseCases.getServerAddress())
    }
}