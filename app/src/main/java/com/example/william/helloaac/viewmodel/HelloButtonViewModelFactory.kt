package com.example.william.helloaac.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.william.helloaac.model.Repository

@Suppress("UNCHECKED_CAST")
class HelloButtonViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HelloButtonViewModel(repository) as T
    }
}