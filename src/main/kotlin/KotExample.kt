
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
    }
}