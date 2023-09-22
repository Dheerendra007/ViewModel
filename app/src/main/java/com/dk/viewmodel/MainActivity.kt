package com.dk.viewmodel

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : ComponentActivity() {
    lateinit var tvcounter:TextView
    lateinit var btnAddCount:Button
    lateinit var mainViewModel: MainViewModel
    lateinit var mainViewModelFactory: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvcounter = findViewById(R.id.tv_counter)
        btnAddCount = findViewById(R.id.btn_add_count)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(11)).get(MainViewModel::class.java)
        setText()
    }

    fun setText(){
        tvcounter.text = mainViewModel.count.toString()
    }

    fun onClick(v:View){
        mainViewModel.incrementCount()
        setText()
    }
}
