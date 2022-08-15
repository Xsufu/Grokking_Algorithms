package sorting

// Класс с функциями сортировки
class Sorting {

    // Поиск наименьшего элемента в массиве
    private fun findSmaller(list: List<Int>): Int {
        // Изначально наименьшее значение - первое
        var smallest = list[0]
        // Индекс наименьшего значения
        var smallestIndex = 0

        for (i in 1 until list.size) {
            if (list[i] < smallest) {
                smallest = list[i]
                smallestIndex = i
            }
        }

        return smallestIndex
    }

    /**
     * Сортировка выбором в порядке возрастания
     *
     * @param list неотсортированный целочисленный список
     * @return отсортированный в порядке возрастания список
     */
    fun selectionSort(list: MutableList<Int>): List<Int> {
        // Выделяем память под новый, отсортированный список
        val newList = mutableListOf<Int>()

        // Проходимся по всем индексам в исходном массиве
        for (i in list.indices) {
            // Узнаём индекс наименьшего числа
            val smallest = findSmaller(list)
            // Добавляем его в новый список
            newList.add(list[smallest])
            // И удаляем из исходного
            list.removeAt(smallest)
        }

        return newList
    }
}