package com.dicoding.picodiploma.unittesting

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.mockito.Mockito

@RunWith(JUnitPlatform::class)
class MainPresenterSpec : Spek({

    val view = Mockito.mock(MainView::class.java)
    val presenter = MainPresenter(view)

    describe("test do calculate") {
        val error = "Field ini tidak boleh kosong"
        val length = "1"
        val width = "2"
        val height = "3"
        val empty = ""
        val result = 6.0

        on("do input length empty") {
            presenter.inputVolume(empty, width, height)

            it("input length empty") {
                Mockito.verify(view).emptyLength(error)
            }
        }

        on("do input width empty") {
            presenter.inputVolume(length, empty, height)

            it("input width empty") {
                Mockito.verify(view).emptyWidth(error)
            }
        }

        on("do input height empty") {
            presenter.inputVolume(length, width, empty)

            it("input height empty") {
                Mockito.verify(view).emptyHeight(error)
            }
        }


        on("do input all") {
            presenter.inputVolume(length, width, height)

            it("success input") {
                Mockito.verify(view).successCalculate(result)
            }
        }

        on("do calculate") {
            val calculate = presenter.calculateVolume(length.toDouble(), width.toDouble(), height.toDouble())

            it("success calculate") {
                Assert.assertEquals(result, calculate, 0.0001)
            }
        }
    }
})
