package com.dicoding.picodiploma.unittesting

/**
 * Created by dicoding on 1/10/2019.
 */

class MainPresenter (private val mainView: MainView) {

    fun inputVolume(length: String, width: String, height: String) {
        when {
            length.isEmpty() -> mainView.emptyLength("Field ini tidak boleh kosong")
            width.isEmpty() -> mainView.emptyWidth("Field ini tidak boleh kosong")
            height.isEmpty() -> mainView.emptyHeight("Field ini tidak boleh kosong")
            else -> {
                val result = calculateVolume(length.toDouble(), width.toDouble(), height.toDouble())
                mainView.successCalculate(result)
            }
        }
    }

    fun calculateVolume(length: Double, width: Double, height: Double): Double {
        return length * width * height
    }
}