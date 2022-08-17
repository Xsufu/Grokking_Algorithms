package exercises

fun main() {
    println(sum(listOf(2, 3, 4, 5)))
}

fun sum(list: List<Int>): Int {
    return if (list.isEmpty())
        0
    else
        list[0] + sum(list.slice(1..list.lastIndex))
}
