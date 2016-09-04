package com.berteodosio.dagger2sample.base

import android.content.Intent
import android.os.Bundle

interface BaseContract {

    interface View<out Presenter : BaseContract.Presenter> {

        fun createPresenter() : Presenter

    }

    interface Presenter {

        fun onCreate(savedInstanceState: Bundle?)

        fun onStart()

        fun onResume()

        fun onPause()

        fun onStop()

        fun onSaveInstanceState(outState: Bundle?)

        fun onDestroy()

        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)

    }
}