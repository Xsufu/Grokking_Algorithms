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

    /**
     * Быстрая сортировка (рекурсия)
     *
     * @param list неотсортированный целочисленный список
     * @return отсортированный в порядке возрастания список
     */
    fun quickSort(list: List<Int>): List<Int> {
        // Если массив пустой или состоит из одного элемента, просто возвращаем его (он уже отсортирован)
        if (list.size < 2)
            return list
        else {
            // Хранение опорного значения (массив на случай его дублирования)
            val pivot = mutableListOf(list[0])
            // Хранение элементов, которые меньше опорного
            val lessList = mutableListOf<Int>()
            // Хранение элементов, которые больше опорного
            val greaterList = mutableListOf<Int>()

            // Проходимся по всему списку, начиная с первого элемента
            for (i in list.slice(1..list.lastIndex)) {
                // Раскидываем элементы по спискам
                if (i < pivot[0]) {
                    lessList.add(i)
                } else if (i > pivot[0]) {
                    greaterList.add(i)
                } else {
                    pivot.add(i)
                }
            }
            // Вызываем рекурсию в левой и правой частях, опору пихаем в серединку
            return quickSort(lessList) + pivot + quickSort(greaterList)
        }
    }
}