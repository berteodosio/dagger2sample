package com.berteodosio.dagger2sample.domain.main

import com.berteodosio.dagger2sample.domain.base.BaseContract

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