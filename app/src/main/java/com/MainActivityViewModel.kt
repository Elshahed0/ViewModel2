package com

import androidx.lifecycle.ViewModel

class MainActivityViewModel(starting:Int):ViewModel() {
    private var total = 0

    init {
        total = starting
    }
    fun getTotal():Int{
        return total
    }

    fun setTotal(input:Int){
        total+=input
    }
}