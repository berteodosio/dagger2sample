package com.berteodosio.dagger2sample.base

import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import com.berteodosio.dagger2sample.main.MainContract
import javax.inject.Inject

abstract class BaseActivity<PRESENTER : BaseContract.Presenter, COMPONENT: BaseContract.Component> : AppCompatActivity(), BaseContract.View<PRESENTER> {

    lateinit var component: COMPONENT

    @Inject
    lateinit var presenter: PRESENTER//? = null

    init {
        component = createComponent()
//        presenter = createPresenter()
    }

    abstract fun createComponent(): COMPONENT

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter!!.onCreate()
    }

//    @Inject
//    fun setPresenterInActivity(presenter: PRESENTER) {
//        this.presenter = presenter
//    }
}