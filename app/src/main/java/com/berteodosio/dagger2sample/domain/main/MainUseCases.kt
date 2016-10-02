package com.berteodosio.dagger2sample.domain.main

import javax.inject.Inject

class MainUseCases @Inject constructor() : MainContract.UseCases {

    override fun getServerAddress() = "https://google.com"

}