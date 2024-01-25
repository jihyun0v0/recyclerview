package com.example.recyclerview

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val mockData: List<String> = ('A'..'Z').map { it.toString() }
}