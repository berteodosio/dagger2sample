package com.berteodosio.dagger2sample.main.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.berteodosio.dagger2sample.R
import com.berteodosio.dagger2sample.main.MainContract
import com.berteodosio.dagger2sample.main.di.DaggerMainComponent
import com.berteodosio.dagger2sample.main.di.MainModule
import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainPresenter   // for some unknown reason, lateinit must exists

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerMainComponent
                .builder()
                .mainModule(MainModule(this))
                .build()

        component.inject(this)
        component.inject(presenter)

        presenter.onCreate()
    }

    override fun displayHelloMessage() {
        displayGeneralMessage("Hello!")
    }

    override fun displayGeneralMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
