infix fun Int.infixTest(x: Int): Int {
    return this / x
}

object TestObject {
    infix fun test(x: Int): Int {
        return x / 3
    }
}

data class TestClass(val value: Int) {
    infix fun test(x: Int): Int {
        return this.value / x
    }
}

fun main() {
    val infixFunctionResult = 4 infixTest 2
    println(infixFunctionResult) // 2

    val result2 = 4.infixTest(2)
    println(result2) // 2

    val result3 = TestObject test 9
    println(result3) // 3

    val result4 = TestClass(4) test 2
    println(result4) // 2
}