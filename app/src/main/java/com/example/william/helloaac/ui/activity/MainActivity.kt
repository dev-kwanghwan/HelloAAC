package com.example.william.helloaac.ui.activity

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.william.helloaac.R
import com.example.william.helloaac.databinding.ActivityMainBinding
import com.example.william.helloaac.model.MainRepositoryImpl
import com.example.william.helloaac.viewmodel.HelloButtonViewModel
import com.example.william.helloaac.viewmodel.HelloButtonViewModelFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = MainRepositoryImpl()
        val helloButtonViewModel = ViewModelProviders.of(this, HelloButtonViewModelFactory(repository)).get(HelloButtonViewModel::class.java)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = helloButtonViewModel

//        val helloButtonTextObserver = Observer<String> {
//            Log.e("test", "test")
//        }
//
//        helloButtonViewModel.helloText.observe(this, helloButtonTextObserver)
        binding.setLifecycleOwner(this)

    }
}
