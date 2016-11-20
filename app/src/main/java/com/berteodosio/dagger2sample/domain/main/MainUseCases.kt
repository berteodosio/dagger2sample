package com.berteodosio.dagger2sample.domain.main

import com.berteodosio.dagger2sample.domain.base.ObserveSchedulerWrapper
import com.berteodosio.dagger2sample.domain.base.SubscribeSchedulerWrapper
import com.berteodosio.dagger2sample.domain.model.MainRepository
import rx.Subscriber
import rx.Subscription
import javax.inject.Inject

class MainUseCases @Inject constructor(val repository: MainRepository,
                                       val subscribeScheduler: SubscribeSchedulerWrapper,
                                       val observeScheduler: ObserveSchedulerWrapper) : MainContract.UseCases {

    override fun fetchServerAddress(subscriber: Subscriber<String>): Subscription {
        return repository.fetchServerAddress()
                .subscribeOn(subscribeScheduler.scheduler)
                .observeOn(observeScheduler.scheduler)
                .subscribe(subscriber)
    }

}