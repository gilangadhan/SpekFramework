package com.dicoding.picodiploma.unittesting

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class MainPresenterTest {

    private lateinit var presenter: MainPresenter
    @Mock
    private lateinit var view: MainView

    private val error = "Field ini tidak boleh kosong"
    private val length = "1"
    private val width = "2"
    private val height = "3"
    private val empty = ""
    private val result = 6.0

    @Before
    @Throws(Exception::class)
    fun setUp() {
        view = Mockito.mock(MainView::class.java)
        presenter = MainPresenter(view)
    }

    @Test
    @Throws(Exception::class)
    fun inputLengthEmptyTest() {
        presenter.inputVolume(empty, width, height)
        Mockito.verify(view).emptyLength(error)
    }

    @Test
    @Throws(Exception::class)
    fun inputWightEmptyTest() {
        presenter.inputVolume(length, empty, height)
        Mockito.verify(view).emptyWidth(error)
    }

    @Test
    @Throws(Exception::class)
    fun inputHeightEmptyTest() {
        presenter.inputVolume(length, width, empty)
        Mockito.verify(view).emptyHeight(error)
    }

    @Test
    @Throws(Exception::class)
    fun successInputTest() {
        presenter.inputVolume(length, width, height)
        Mockito.verify(view).successCalculate(result)
    }

    @Test
    @Throws(Exception::class)
    fun calculateTest() {
        val calculate = presenter.calculateVolume(length.toDouble(), width.toDouble(), height.toDouble())
        Assert.assertEquals(result, calculate, 0.0001)
    }
}
