package com.example.counterapp47

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counterapp47.databinding.ActivityMainBinding
import com.example.counterapp47.helper.Injector
import com.example.counterapp47.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()
                presenter.changeColor()
                presenter.showToast()
            }
            decrementBtn.setOnClickListener { presenter.decrement() }
            presenter.changeColor()
        }
    }

    override fun showNewCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun changeColor(id: Int) {
        binding.resultTv.setTextColor(getColor(id))
    }

    override fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}