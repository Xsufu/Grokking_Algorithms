import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import sorting.Sorting

internal class SortingTest {

    private val testClass: Sorting = Sorting()

    @Test
    fun selectionSort() {
        assertEquals(listOf(1, 2, 3, 4, 5, 6), testClass.selectionSort(mutableListOf(6, 3, 2, 1, 4, 5)))
        assertEquals(listOf(1, 2, 3, 3, 4), testClass.selectionSort(mutableListOf(3, 1, 3, 2, 4)))
    }

    @Test
    fun quickSort() {
        assertEquals(listOf(1, 2, 3, 4, 5, 6), testClass.quickSort(mutableListOf(6, 3, 2, 1, 4, 5)))
        assertEquals(listOf(1, 2, 3, 3, 4), testClass.quickSort(mutableListOf(3, 1, 3, 2, 4)))
        assertEquals(listOf(1, 2, 2, 3, 4), testClass.quickSort(mutableListOf(3, 2, 1, 4, 2)))
        assertEquals(listOf(1, 2, 3, 4, 5), testClass.quickSort(mutableListOf(1, 2, 3, 4, 5)))
        assertEquals(listOf(1, 1, 1, 1), testClass.quickSort(mutableListOf(1, 1, 1, 1)))
        assertEquals(listOf(1, 1, 2, 3, 4), testClass.quickSort(mutableListOf(1, 4, 2, 3, 1)))
    }
}