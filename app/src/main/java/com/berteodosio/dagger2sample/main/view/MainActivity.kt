package com.berteodosio.dagger2sample.main.view

import android.os.Bundle
import android.widget.Toast
import com.berteodosio.dagger2sample.R
import com.berteodosio.dagger2sample.base.view.BaseActivity
import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.di.DaggerMainComponent
import com.berteodosio.dagger2sample.main.di.MainComponent
import com.berteodosio.dagger2sample.main.di.MainModule

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
