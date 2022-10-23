package desafios

// PARTE 1 DESAFIO FOR

//imprimi numeros de 1 a 50
fun ex1() {
    for (i in 1..50) {
        print("$i ")
    }
}

//imprimi numeros de 50 a 1
fun ex2() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

//imprime numeros que NÃO são multiplos de 5
fun ex3() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

//imprime soma dos intervalos de 1 a 500
fun ex4() {
    println()
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    print(soma)
}

//imprimi escada de tamanho N
fun ex5(n: Int) {
    for (i in 1..n) {
        for (j in 1 .. i) {
            print("#")
        }
        println()
    }

}

// PARTE 2 DESAFIO WHILE

//qtde de baloes para encher caixa de 2000L sem exceder volume
fun ex6() {
    var balao = 7
    var cont = 0
    while (balao <= 2000) {
        balao += 7
        cont++
    }
    println(cont)
}

//imprime numeros de 1 a 50 - diz se é divisivel por 3, 5 ou (3 e 5)
fun ex7() {
    var n = 1
    while (n <= 50) {
        if (n % 3 == 0 && n % 5 == 0) {
            print("FizzBuzz ")
        } else if (n % 3 == 0) {
            print("Buzz ")
        } else if ( n % 5 == 0) {
            print("Fizz ")
        } else {
            print("$n ")
        }
        n++
    }
}

//programa que recebe texto e imprime invertido
fun ex8(srt: String) {
    var i = srt.length - 1
    while (i > 0) {
        print(srt[i])
        i--
    }
//    println(srt.reversed()) //Outra forma de resolver
}

//verifica se a string tem a mesma qtde de char 'x' e 'o'
fun ex9(srt: String): Boolean {
    var srtLower = srt.lowercase()

    var i = 0
    var countX = 0
    var countO = 0
    while (i < srtLower.length) {
        if (srtLower[i] == 'x') {
            countX++
        } else if (srtLower[i] == 'o') {
            countO++
        }
        i++
    }
    return countO == countX && countO != 0
}

fun desafioInvestimento() {
    val salario = 10000f
    var patAna = 0f
    var patPaula = 0f
    var mes = 1

    do {
        patAna += (salario * 0.05f + salario * 0.05f + patAna * 0.002f)
        patPaula += (salario * 0.05f + patPaula * 0.008f)
        mes++
    } while (patAna > patPaula)

    println("Paula vai ultrapassar o pat. de Ano no mês $mes")
}

fun main() {

    desafioInvestimento()
/*
    println(ex9("Xxooox"))
    println(ex9("xxxxo"))
    println(ex9("bdegfhij"))
    println(ex9("ooooxzzzzz"))
*/
}