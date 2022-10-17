package funcoes

fun main() {

    println("Soma: ${sum(20, 10)}")
    println("Divisão: ${divisao(10f, 3.5f)}")
    helloWorld()
    helloWorld2()
}

//funcao com retorno
fun sum(a: Int, b: Int): Int {
    return a + b
}

//funcao em unica linha
fun divisao(a: Float, b: Float) = a / b

fun helloWorld2() = println("Olá mundo 2!")

//funcao sem retorno (Unit)
fun helloWorld() {
    println("Olá Mundo!")
}

