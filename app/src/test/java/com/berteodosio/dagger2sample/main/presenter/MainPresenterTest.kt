package com.berteodosio.dagger2sample.main.presenter

import com.berteodosio.dagger2sample.di.main.DaggerMainComponent
import com.berteodosio.dagger2sample.di.main.MainComponent
import com.berteodosio.dagger2sample.domain.main.MainContract
import com.berteodosio.dagger2sample.main.di.MockMainModule
import org.junit.Test
import org.mockito.Mockito.*

class MainPresenterTest {

    val mockView: MainContract.View = mock(MainContract.View::class.java)
    val component: MainComponent = DaggerMainComponent.builder().mainModule(MockMainModule(mockView)).build()

    val presenter = component.getMainPresenter()

    @Test
    fun onCreate() {
        presenter.onCreate()

        verify(mockView, times(1)).displayHelloMessage()
        verify(mockView, times(1)).displayGeneralMessage(component.getMainUseCases().getServerAddress())
    }
}