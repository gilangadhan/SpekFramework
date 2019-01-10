package com.dicoding.picodiploma.unittesting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by dicoding on 1/10/2019.
 */

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        btnCalculate.setOnClickListener {
            val length = edtLength.text.toString()
            val width = edtWidth.text.toString()
            val height = edtHeight.text.toString()
            presenter.inputVolume(length, width, height)
        }
    }

    override fun emptyLength(error: String) {
        edtLength.error = error
    }

    override fun emptyHeight(error: String) {
        edtHeight.error = error
    }

    override fun emptyWidth(error: String) {
        edtWidth.error = error
    }

    override fun successCalculate(result: Double) {
        txtResult.text = result.toString()
    }
}
