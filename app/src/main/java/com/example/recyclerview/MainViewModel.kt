package com.example.recyclerview

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val mockData: MutableList<String> =(0..200).map{it.toString()}.toMutableList()
}