package com.berteodosio.dagger2sample.presentation.base.view

import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import com.berteodosio.dagger2sample.domain.base.BaseContract
import javax.inject.Inject

abstract class BaseActivity<PRESENTER : BaseContract.Presenter, COMPONENT: BaseContract.Component> : AppCompatActivity(), BaseContract.View<PRESENTER> {

    @Inject
    lateinit var presenter: PRESENTER

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies(createComponent())
        super.onCreate(savedInstanceState)
    }

    abstract fun createComponent(): COMPONENT
    abstract fun injectDependencies(component: COMPONENT)
}