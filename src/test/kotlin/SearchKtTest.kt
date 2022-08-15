import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import search.Search

internal class SearchKtTest {

    private val testList = listOf(1, 2, 3, 4, 5)
    private val testClass: Search = Search()

    @Test
    fun binarySearchWork() {
        assertEquals(2, testClass.binarySearch(testList, 3))
    }

    @Test
    fun binarySearchError() {
        assertEquals(-1, testClass.binarySearch(testList, -1))
    }
}