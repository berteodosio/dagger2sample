package com.berteodosio.dagger2sample.data.main

import com.berteodosio.dagger2sample.domain.model.MainRepository
import rx.Observable
import javax.inject.Inject

class MainDataRepository @Inject constructor(): MainRepository {
    override fun fetchServerAddress(): Observable<String> = Observable.from(arrayOf("aiotjtoia", "aoietjaoi", "oaietjoai", "oaihtoa"))
}