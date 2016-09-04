package com.berteodosio.dagger2sample.main.presenter

import com.berteodosio.dagger2sample.main.view.MainActivity
import javax.inject.Inject

class MainPresenter @Inject constructor(val view: MainActivity) {

    fun onCreate() {
        view.displayHelloMessage()
    }
}