package com.berteodosio.dagger2sample.domain.main

import com.berteodosio.dagger2sample.domain.base.BaseContract
import rx.Subscriber
import rx.Subscription

interface MainContract {

    interface View {

        fun displayHelloMessage()

        fun displayGeneralMessage(message: String)

        fun hideLoading()

        fun displayGeneralError()

        fun showLoading()

    }

    interface Presenter : BaseContract.Presenter {

    }

    interface UseCases {

        fun fetchServerAddress(subscriber: Subscriber<String>): Subscription

    }

}