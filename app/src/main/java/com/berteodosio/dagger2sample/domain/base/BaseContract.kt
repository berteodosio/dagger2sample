package com.berteodosio.dagger2sample.domain.base

interface BaseContract {

    interface View<out Presenter : BaseContract.Presenter> {

    }

    interface Presenter {

        fun onCreate() = Unit

        fun onStart() = Unit

        fun onResume() = Unit

        fun onPause() = Unit

        fun onStop() = Unit

        fun onDestroy() = Unit

    }

    interface Component
}