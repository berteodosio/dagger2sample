package com.berteodosio.dagger2sample.main.business

import com.berteodosio.dagger2sample.domain.main.MainContract

class MockMainUseCases: MainContract.UseCases {

    override fun getServerAddress() = "https://google-test.com"

}