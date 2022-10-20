package desafios

import kotlin.system.exitProcess

//Reforçando If/Else pt 2

fun quadrado() {
    print("Informe o lado 1: ")
    val lado1 = readLine()
    print("Informe o lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("é um quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}

fun triangulo() {
    print("Informe o lado 1: ")
    val l1 = readLine()
    print("Informe o lado 2: ")
    val l2 = readLine()
    print("Informe o lado 3: ")
    val l3 = readLine()

    if (l1 != null && l1 != "" && l2 != null && l2 != "" && l3 != null && l3 != "") {
        val x = l1.toInt()
        val y = l2.toInt()
        val z = l3.toInt()

        if (x == y && y == z) {
            println("É um triângulo equilátero.")
        } else {
            println("Não é um triângulo equilátero.")
        }
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

    print("informe idade: ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado! Menores de idade não são permitidos.")
            return
        }
        print("Qual o tipo de convite? ")
        val tipoConvite = readLine()

        if (tipoConvite != null && tipoConvite != "") {
            var tipoConvite = tipoConvite.lowercase()

            //validação do convite
            if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
                println("Negado. Convite inválido!")
                return
            }

                print("Informe o código do convite: ")
                var codigoConvite = readLine()

                if (codigoConvite != null && codigoConvite != "") {
                    codigoConvite = codigoConvite.lowercase()

                    if (tipoConvite == "comum" && codigoConvite.startsWith("xt")) {
                        println("Welcome!")
                    } else if ((tipoConvite == "premium" || tipoConvite == "luxo")
                        && codigoConvite.startsWith("xl")) {
                        println("Welcome! :)")
                    } else {
                        println("Negado. Códico do convite inválido!")
                    }
                }
        }

    }
}

fun main() {

    controlePortaria()
}


