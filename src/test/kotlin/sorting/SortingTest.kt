package sorting

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SortingTest {

    private val testClass: Sorting = Sorting()

    @Test
    fun selectionSort() {
        assertEquals(listOf(1, 2, 3, 4, 5, 6), testClass.selectionSort(mutableListOf(6, 3, 2, 1, 4, 5)))
        assertEquals(listOf(1, 2, 3, 3, 4), testClass.selectionSort(mutableListOf(3, 1, 3, 2, 4)))
    }
}