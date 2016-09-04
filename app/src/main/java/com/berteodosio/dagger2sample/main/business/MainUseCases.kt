package com.berteodosio.dagger2sample.main.business

import com.berteodosio.dagger2sample.main.MainContract

class MainUseCases : MainContract.UseCases {

    override fun getServerAddress() = "https://google.com"

}