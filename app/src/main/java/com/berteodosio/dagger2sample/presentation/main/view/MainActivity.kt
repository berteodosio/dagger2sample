package com.berteodosio.dagger2sample.presentation.main.view

import android.os.Bundle
import android.widget.Toast
import com.berteodosio.dagger2sample.R
import com.berteodosio.dagger2sample.di.main.DaggerMainComponent
import com.berteodosio.dagger2sample.di.main.MainComponent
import com.berteodosio.dagger2sample.di.main.MainModule
import com.berteodosio.dagger2sample.domain.main.MainContract
import com.berteodosio.dagger2sample.presentation.base.view.BaseActivity

class MainActivity : BaseActivity<MainContract.Presenter, MainComponent>(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun displayHelloMessage() {
        displayGeneralMessage("Hello!")
    }

    override fun displayGeneralMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun createComponent(): MainComponent {
        return DaggerMainComponent
                .builder()
                .mainModule(MainModule(this))
                .build()
    }

    override fun injectDependencies(component: MainComponent) {
        component.inject(this)
    }
}
