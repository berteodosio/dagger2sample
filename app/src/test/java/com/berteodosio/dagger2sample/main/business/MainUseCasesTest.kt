package com.berteodosio.dagger2sample.main.business

import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.di.DaggerMainComponent
import com.berteodosio.dagger2sample.main.di.MainComponent
import com.berteodosio.dagger2sample.main.di.MainModule
import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito

class MainUseCasesTest {

    val component: MainComponent = DaggerMainComponent.builder().mainModule(MainModule(Mockito.mock(MainContract.View::class.java))).build()
    val useCases = component.getMainUseCases()

    @Test
    fun getServerAddress() {
        assertEquals("Server url is wrong", "https://google.com", useCases.getServerAddress())
    }

}