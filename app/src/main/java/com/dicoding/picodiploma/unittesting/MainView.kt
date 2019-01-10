package com.dicoding.picodiploma.unittesting

/**
 * Created by dicoding on 1/10/2019.
 */

interface MainView {
    fun emptyLength(error: String)
    fun emptyHeight(error: String)
    fun emptyWidth(error: String)
    fun successCalculate(result: Double)
}