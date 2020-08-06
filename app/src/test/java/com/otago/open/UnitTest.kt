package com.otago.open

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTest {
    /**
     * Run test for [PDFListFragment.PDFService.determinePath]
     */
    @Test
    fun url_process_is_correct() {
        assertEquals("https://cs.otago.ac.nz/cosc242/pdf/L02.pdf", PDFListFragment.PDFService.determinePath("https://cs.otago.ac.nz/cosc242/lectures.php", "pdf/L02.pdf"))
        assertEquals("https://cs.otago.ac.nz/cosc242/pdf/L03.pdf", PDFListFragment.PDFService.determinePath("https://cs.otago.ac.nz/cosc242/lectures.php", "./pdf/L03.pdf"))
        assertEquals("https://cs.otago.ac.nz/cosc242/pdf/L04.pdf", PDFListFragment.PDFService.determinePath("https://cs.otago.ac.nz/cosc242/lectures.php", "/cosc242/pdf/L04.pdf"))
        assertEquals("https://cs.otago.ac.nz/cosc244/pdf/L05.pdf", PDFListFragment.PDFService.determinePath("https://cs.otago.ac.nz/cosc242/lectures.php", "/cosc244/pdf/L05.pdf"))
        assertEquals("https://example.com", PDFListFragment.PDFService.determinePath("https://cs.otago.ac.nz/cosc242/lectures.php", "https://example.com"))
    }
}