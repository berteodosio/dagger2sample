package com.berteodosio.dagger2sample.main.presenter

import com.berteodosio.dagger2sample.base.BasePresenter
import com.berteodosio.dagger2sample.main.MainContract
import javax.inject.Inject

class MainPresenter(): BasePresenter(), MainContract.Presenter {

    @Inject
    lateinit var view: MainContract.View

    @Inject
    lateinit var mainUseCases: MainContract.UseCases

    override fun onCreate() {
        view.displayHelloMessage()
        view.displayGeneralMessage(mainUseCases.getServerAddress())
    }
}