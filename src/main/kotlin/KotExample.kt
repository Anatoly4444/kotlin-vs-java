import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

class KotExample {
    companion object {
        @JvmStatic
        fun method1(s: String) {
            method2(s)
        }

        private fun method2(s: String?) {
            // compile time error without '!!'
            println(s!!.uppercase())
        }

        suspend fun runAsync() {
            val i = coroutineScope<Int> {
                val i1 = async { task(1) }
                val i2 = async { task(2) }
                return@coroutineScope i1.await() + i2.await()
            }
            println("Result is $i")

        }

        suspend fun task(i: Int): Int {
            delay(2000)
            println("Coroutine task $i done")
            return i
        }
    }
}