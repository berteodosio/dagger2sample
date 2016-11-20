package com.berteodosio.dagger2sample.presentation.main.presenter

import android.util.Log
import com.berteodosio.dagger2sample.domain.main.MainContract
import rx.Subscriber
import javax.inject.Inject

class MainPresenter @Inject constructor(val view: MainContract.View,
                                        val useCases: MainContract.UseCases): MainContract.Presenter {

    override fun onCreate() {
        view.displayHelloMessage()
        view.showLoading()
        useCases.fetchServerAddress(MainSubscriber(view, this))
    }
}

class MainSubscriber(val view: MainContract.View,
                     val presenter: MainContract.Presenter) : Subscriber<String>() {

    override fun onError(e: Throwable?) {
        Log.e("ERROR", "Error", e)
        view.displayGeneralError()
        view.hideLoading()
    }

    override fun onNext(result: String) {
        view.displayGeneralMessage(result)
    }

    override fun onCompleted() {
        view.hideLoading()
    }

}