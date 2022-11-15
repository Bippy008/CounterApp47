package com.example.counterapp47.presenter

import com.example.counterapp47.R
import com.example.counterapp47.helper.Injector
import com.example.counterapp47.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.showNewCount(model.count)
    }

    fun decrement() {
        model.decrement()
        view.showNewCount(model.count)
    }

    fun attachView(view: CounterView) {
        this.view = view
    }

    fun changeColor() {
        if(model.count == 15) {
            view.changeColor(R.color.green)
        }
    }

    fun showToast() {
        if (model.count == 10) {
            view.showToast("Поздравляем")
        }
    }
}