package com.berteodosio.dagger2sample.main

interface MainContract {

    interface View {

        fun displayHelloMessage()

        fun displayGeneralMessage(message: String)

    }

    interface Presenter {

    }

}