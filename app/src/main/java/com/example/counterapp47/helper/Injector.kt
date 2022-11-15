package com.example.counterapp47.helper

import com.example.counterapp47.model.CounterModel
import com.example.counterapp47.presenter.Presenter

class Injector {

    companion object {
        fun getModel(): CounterModel {
            return CounterModel()
        }

        fun getPresenter(): Presenter {
            return Presenter()
        }
    }
}