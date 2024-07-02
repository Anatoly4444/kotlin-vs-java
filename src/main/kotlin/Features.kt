

fun functionLiteralsWithReceiver() : List<Boolean>{
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }
    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}

fun functionLiteralsWithReceiver2() : List<Boolean>{
    fun Int.isEven() = this % 2 == 0
    fun Int.isOdd() = this % 2 != 0
    return listOf(42.isEven(), 239.isOdd(), 294823098.isEven())
}

fun fail(): Nothing {
    throw RuntimeException()
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) fail()
    println("Congrats! Next year you'll be ${age + 1}.")
}

fun checkName(name: String?) {
    val s = name ?: fail()
    println(s)     // 's' is known to be initialized at this point
}
