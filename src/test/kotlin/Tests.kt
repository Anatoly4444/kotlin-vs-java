import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class Tests {
    @Test
    fun testException() {
        fail()
    }

    @Test
    fun testAsync() = runBlocking {
        launch { JavaExample.runAsync() }
        KotExample.runAsync()
    }

    @Test
    fun testReceiver() {
        println(functionLiteralsWithReceiver2())
    }

    @Test
    fun testNullSafety() {
        // nullable type
        val s: String? = null
        // require '?'
        val name = s?.let { KotExample.method1(it) } ?: ""
        //throws Exception in java code
        JavaExample.method1(s)
    }
}