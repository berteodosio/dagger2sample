package com.berteodosio.dagger2sample.presentation.main.presenter

import com.berteodosio.dagger2sample.domain.main.MainContract
import javax.inject.Inject

class MainPresenter @Inject constructor(val view: MainContract.View,
                                        val useCases: MainContract.UseCases): MainContract.Presenter {

    override fun onCreate() {
        view.displayHelloMessage()
        view.displayGeneralMessage(useCases.getServerAddress())
    }
}