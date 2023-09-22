package com.dk.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel(var count:Int ): ViewModel() {

     fun incrementCount(){
       count++
     }

}