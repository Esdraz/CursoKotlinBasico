package funcoes

fun main() {
    println(media(10f, 10f, 10f, 2f, 4f))
}
/*

fun media(n1: Float, n2: Float): Float {
    return n1 + n2 / 2
}

fun media(n1: Float, n2: Float, n3: Float): Float {
    return n1 + n2 + n3 / 3
}
*/

//utilizando vararg
fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return (soma / notas.size)
}