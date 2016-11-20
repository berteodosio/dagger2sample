package com.berteodosio.dagger2sample.domain.model

import rx.Observable

interface MainRepository {

    fun fetchServerAddress(): Observable<String>

}