package com.berteodosio.dagger2sample.main

import com.berteodosio.dagger2sample.base.BaseContract

interface MainContract {

    interface View {

        fun displayHelloMessage()

        fun displayGeneralMessage(message: String)

    }

    interface Presenter : BaseContract.Presenter {

    }

    interface UseCases {

        fun getServerAddress(): String

    }

}