package com.berteodosio.dagger2sample.main.presenter

import com.berteodosio.dagger2sample.base.BasePresenter
import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.business.MainUseCases
import javax.inject.Inject

class MainPresenter(): BasePresenter(), MainContract.Presenter {

    @Inject
    lateinit var view: MainContract.View

    @Inject
    lateinit var mainUseCases: MainUseCases

    override fun onCreate() {
        view.displayHelloMessage()
        view.displayGeneralMessage(mainUseCases.getServerAddress())
    }
}