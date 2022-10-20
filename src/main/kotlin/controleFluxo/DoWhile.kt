package controleFluxo

fun main() {

    var i = 0
    do {
        print("$i ")
        i++
    } while (i <= 10)
    println()

    do {
        print("Qual o seu nome? ")
        val nome = readln()
    } while (nome == "")
}