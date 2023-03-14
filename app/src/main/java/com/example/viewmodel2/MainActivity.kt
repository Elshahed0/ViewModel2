package com.example.viewmodel2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.MainActivityViewModel
import com.MainActivityViewModelFactory
import com.example.viewmodel2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(1)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)


        binding.ResultTextView.text = viewModel.getTotal().toString()

        binding.InsertButton.setOnClickListener {

            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
            binding.ResultTextView.text = viewModel.getTotal().toString()


        }


    }
}