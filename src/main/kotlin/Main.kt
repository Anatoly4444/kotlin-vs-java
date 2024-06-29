

fun main(args: Array<String>) {
    println(runCatching { nullSafety() }.isFailure)
    println(functionLiteralsWithReceiver2())
    fail()
}

