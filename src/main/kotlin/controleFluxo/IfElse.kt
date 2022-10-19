package controleFluxo

//funcao resumida
fun saudacao(dia: Boolean) = if (dia) {
        "bom dia"
    } else {
        "boa noite"
    }

/*
fun saudacao(dia: Boolean): String {
    return if (dia) {
        "bom dia"
    } else {
        "boa noite"
    }
}
*/

fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de idade!")
    } else {
        println("Menor de idade!")
    }
}

fun main() {

    maiorDeIdade(22)
    saudacao(false)

/*    val num = 10
    if (num > 20) {
        println("Numero é maior que 20")
    } else {
        println("Numero menor que 20")
    }*/
}