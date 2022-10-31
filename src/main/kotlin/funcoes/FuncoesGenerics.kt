package funcoes

fun main() {
    println(media(abc = false, 10f, 9f, 2f, "", false, 90f))

    arrayOf(2, 3, 4, 6, 45f, false)
    "ajidajdijaid".startsWith("aj")

}

fun <T, J> media(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }
    }
    return (soma / notas.size)
}