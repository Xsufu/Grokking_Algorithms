package exercises

fun main() {
    println(sum(listOf(2, 3, 4, 5)))
    println(countOfElements(listOf(2, 3, 4, 5)))
    println(findBiggest(listOf(7, 3, 6, 5)))
}

fun sum(list: List<Int>): Int {
    return if (list.isEmpty())
        0
    else
        list[0] + sum(list.slice(1..list.lastIndex))
}

fun countOfElements(list: List<Int>): Int {
    return if (list.isEmpty())
        0
    else
        1 + countOfElements(list.slice(1..list.lastIndex))
}

fun findBiggest(list: List<Int>): Int {
    if (list.size == 2) {
        return if (list[0] > list[1])
            list[0]
        else
            list[1]
    }
    val tempMax = findBiggest(list.slice(1..list.lastIndex))
    return if (list[0] > tempMax)
        list[0]
    else
        tempMax
}
