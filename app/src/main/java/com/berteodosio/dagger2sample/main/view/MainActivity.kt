package com.berteodosio.dagger2sample.main.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.berteodosio.dagger2sample.R
import com.berteodosio.dagger2sample.main.DaggerMainComponent
import com.berteodosio.dagger2sample.main.MainModule
import com.berteodosio.dagger2sample.main.presenter.MainPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter   // for some unknown reason, lateinit must exists

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainComponent
                .builder()
                .mainModule(MainModule(this))
                .build()
                .inject(this)


        presenter.onCreate()
    }

    fun displayHelloMessage() {
        Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT).show()
    }
}
