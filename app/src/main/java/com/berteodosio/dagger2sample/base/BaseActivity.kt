package com.berteodosio.dagger2sample.base

import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<PRESENTER : BaseContract.Presenter> : AppCompatActivity(), BaseContract.View<PRESENTER> {

    lateinit var presenter: PRESENTER

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
        presenter.onCreate()
    }
}