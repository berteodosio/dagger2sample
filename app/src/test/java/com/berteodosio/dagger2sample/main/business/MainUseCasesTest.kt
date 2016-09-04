package com.berteodosio.dagger2sample.main.business

import com.berteodosio.dagger2sample.di.main.DaggerMainComponent
import com.berteodosio.dagger2sample.di.main.MainComponent
import com.berteodosio.dagger2sample.di.main.MainModule
import com.berteodosio.dagger2sample.domain.main.MainContract
import org.junit.Assert.assertEquals
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