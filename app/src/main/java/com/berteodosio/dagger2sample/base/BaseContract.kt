package com.berteodosio.dagger2sample.base

interface BaseContract {

    interface View<out Presenter : BaseContract.Presenter> {

        fun createPresenter() : Presenter

    }

    interface Presenter {

        fun onCreate()

        fun onStart()

        fun onResume()

        fun onPause()

        fun onStop()

        fun onSaveInstanceState()

        fun onDestroy()

    }
}