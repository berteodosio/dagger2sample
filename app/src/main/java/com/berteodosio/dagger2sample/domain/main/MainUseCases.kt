package com.berteodosio.dagger2sample.domain.main

import com.berteodosio.dagger2sample.domain.main.MainContract

class MainUseCases : MainContract.UseCases {

    override fun getServerAddress() = "https://google.com"

}