package com.berteodosio.dagger2sample.main.di

import com.berteodosio.dagger2sample.domain.main.MainContract
import com.berteodosio.dagger2sample.di.main.MainModule
import com.berteodosio.dagger2sample.main.business.MockMainUseCases
import dagger.Module
import dagger.Provides

@Module
class MockMainModule(val view: MainContract.View): MainModule(view) {

    @Provides
    override fun provideMainUseCases(): MainContract.UseCases {
        return MockMainUseCases()
    }

}