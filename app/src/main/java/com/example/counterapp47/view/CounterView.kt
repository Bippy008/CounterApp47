package com.example.counterapp47.view

interface CounterView {
    fun showNewCount(count: Int)
    fun changeColor(id: Int)
    fun showToast(text: String)

}