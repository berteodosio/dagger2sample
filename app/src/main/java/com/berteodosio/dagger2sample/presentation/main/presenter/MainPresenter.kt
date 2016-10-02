package com.berteodosio.dagger2sample.presentation.main.presenter

import com.berteodosio.dagger2sample.domain.main.MainContract
import javax.inject.Inject

class MainPresenter @Inject constructor(): MainContract.Presenter {

    @Inject
    lateinit var view: MainContract.View

    @Inject
    lateinit var mainUseCases: MainContract.UseCases

    override fun onCreate() {
        view.displayHelloMessage()
        view.displayGeneralMessage(mainUseCases.getServerAddress())
    }
}