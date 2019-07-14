package com.example.viewmodellivedatatest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    private var users: MutableLiveData<List<String>> = MutableLiveData()

    fun getUsers(): LiveData<List<String>> {
        return users
    }

    fun loadUsers() {
        users.value = listOf("pepe", "paco", "julio")
    }

}