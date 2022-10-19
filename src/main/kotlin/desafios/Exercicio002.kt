package desafios

//funções
fun main() {

    conversaoAnos(2)
    quantidadeCaracteres("Francisco")
    calcularCubo(2)
    converterMilhaKm(10.0)
    trocaLetras("frAncisco")
}

fun conversaoAnos(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
    println("-----------------------------------")
}

fun quantidadeCaracteres(str: String) = println("Quantidade de Caracteres: ${str.length}")

fun calcularCubo(n: Int) = println("Cubo do N: ${n * n * n}")

fun converterMilhaKm(milha: Double) = println("Quantidade em Km: ${milha * 1.6}")

fun trocaLetras(str: String) {
    println(str.lowercase().replace("a", "x", ignoreCase = true))
}

