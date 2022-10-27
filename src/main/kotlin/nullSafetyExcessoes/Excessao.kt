package nullSafetyExcessoes

import java.lang.Exception

fun main() {
    try {
        var s: String? = null
//        val a = 10 / 0
        println(s!!.length)

    } catch (e: NullPointerException) {
        println("Variável NULA")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!")
    } catch (e: Exception) {
        println("Generica")
    } finally {
        println("Finally!")
    }
    println("Fim!")
}