package nullSafetyExcessoes

fun main() {
    var s: String? = null
    println(s?.length) // pode ser usado ? ou !! caso tenha certeza que não vai retornar valor nulo
    println("jdakjdkaj")

}