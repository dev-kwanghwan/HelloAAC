package com.example.william.helloaac.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.william.helloaac.model.Repository

class HelloButtonViewModel(var repository: Repository) : ViewModel() {
    val helloText = MutableLiveData<String>()

    fun clickHelloButton() {
        helloText.postValue(repository.getNewText())
    }
}