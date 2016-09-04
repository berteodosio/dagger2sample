package com.berteodosio.dagger2sample

import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.di.DaggerMainComponent
import com.berteodosio.dagger2sample.main.di.MainComponent
import com.berteodosio.dagger2sample.main.di.MockMainModule
import org.junit.Test
import org.junit.Assert.*
import org.mockito.Mockito.*

class MainPresenterTest {

    val mockView: MainContract.View = mock(MainContract.View::class.java)
    val component: MainComponent = DaggerMainComponent.builder().mainModule(MockMainModule(mockView)).build()

    val presenter = component.getMainPresenter()

    @Test
    fun onCreate_test() {
        presenter.onCreate()

        verify(mockView, times(1)).displayHelloMessage()
        verify(mockView, times(1)).displayGeneralMessage(component.getMainUseCases().getServerAddress())
    }
}