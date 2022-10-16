/**
Type	Bit
Double	64
Float	32
Long	64
Int	    32
Short	16
Byte	8
Boolean ?
String  ?
Char    ?
 */

fun main() {

    var c: Char = 'a'
    var s: String = "ajiudhaui dhaudh audh uadhuah uahd uhd ahduahduahdua"
    var b: Boolean = true

    // Var com tipo explicito
    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    // Possível declarar uma variável sem tipo, desde que seja incializada.
    // Tipo de dado é definido através da inferência.
    var idade = 31

    // Isso não pode ser feito, a variável não sabe nem o valor, nem o tipo
    // var idade2

    // Variável declarada, mas não inicializada
    var idade3: Int

    // Atenção a declaração sem tipo
    val n1 = 10.0 // Qualquer número com ponto flutuante é tratado como Double
    val n2 = 10.0f // "f" faz com que o tipo agora seja Float
    val n3 = 13 // Número inteiro, caso caiba dentro do Int, será inteiro
    val n4 = 13L // Long
    val n5 = 13 // Não existe sufixo para Byte, caso deseje um tipo Byte, deve ser explícito

    println("Double: Max: " + Double.MAX_VALUE + " - Double: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " - Long: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " - Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE)

    println()
    println("-------------------------------------------------------------")
    println()

    //Unsigned (numeros inteiros)
    println("ULong: Max -  ${ULong.MAX_VALUE} - ${ULong.MIN_VALUE}")
    println("UInt: Max -  ${UInt.MAX_VALUE} - ${UInt.MIN_VALUE}")
    println("UShort: Max -  ${UShort.MAX_VALUE} - ${UShort.MIN_VALUE}")
    println("UByte: Max -  ${UByte.MAX_VALUE} - ${UByte.MIN_VALUE}")

    val uInt: UInt = 0u
    val uShort: UShort = 10u
    val uLong: ULong = 10u
    val uByte: UByte = 255u

}

/**
 * -- Anotações --
 * O tamanho Boolean pode ser representado somente com 1 bit, true ou false
 * Porém o tamanho é depende da JVM e a especificaçacão não deixa claro
 *
 * String
 * O tamanho de uma String depende de seu conteúdo.
 *
 * Char
 * O tamanho de um char, assim como Boolean, também é variável e dependente da JVM
 *
 * Fonte
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */