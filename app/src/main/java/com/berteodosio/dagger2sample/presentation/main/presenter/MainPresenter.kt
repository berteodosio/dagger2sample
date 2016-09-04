package com.berteodosio.dagger2sample.presentation.main.presenter

import com.berteodosio.dagger2sample.domain.main.MainContract

class MainPresenter(var view: MainContract.View, var mainUseCases: MainContract.UseCases): MainContract.Presenter {

    override fun onCreate() {
        view.displayHelloMessage()
        view.displayGeneralMessage(mainUseCases.getServerAddress())
    }
}