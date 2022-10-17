package funcoes

fun main() {
    val str = "Programação Kotlin"

    println("Tamanho da String: ${str.length}")
    println("Posição (index) 0 da string: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2, 5))
    println(str.replace("kotlin", "Kotlin é show", ignoreCase = true))
    println(str.lowercase())
    println(str.uppercase())

    println("    meu nome é          ".trim()) //remove os espaços em branco antes e depois do string

}