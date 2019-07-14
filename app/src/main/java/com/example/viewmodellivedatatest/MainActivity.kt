package com.example.viewmodellivedatatest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProviders.of(this).get(MainViewModel::class.java)

        model.getUsers().observe(this, Observer { users ->
            if (users != null) {
                textView.text = ""
                users.forEach {
                    @SuppressLint("SetTextI18n")
                    textView.text = "${textView.text}\n$it"
                }
            }

        })

        model.loadUsers()

    }
}
