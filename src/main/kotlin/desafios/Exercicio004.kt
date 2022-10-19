package desafios

import kotlin.system.exitProcess

//Reforçando If/Else pt 2

fun lerDoisNumeros() {
    val n1 = readLine()
    val n2 = readLine()

    if (n1 == n2) {
        println("Quadrado")
    } else {
        println("Não forma um quadrado")
    }
}

fun lerTresNumeros() {
    val l1 = readLine()
    val l2 = readLine()
    val l3 = readLine()

    if (l1 == l2 && l2 == l3) {
        println("Triangulo equilatero")
    } else {
        println("Não é Triangulo equilatero")
    }
}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0) {
            println("Primeira string")
        } else println("Segunda string")
    }
    println("Terceira string")
}

fun controlePortaria() {
    val idade = readLine()

    if (idade != null) {
        if (idade.toInt() < 18) {
            println("Negado! Menores de idade não são permitidos.")
        } else {
            val tipoConvite = readLine()
            if (tipoConvite != "comum" ||tipoConvite != "premium" || tipoConvite != "luxo") {
                println("Negado! Acesso inválido.")
            }

            val codigoConvite = readLine()


        }

    }


}

fun main() {

//    lerDoisNumeros()
//    lerTresNumeros()
//    qualASaida(4)
    controlePortaria()

}