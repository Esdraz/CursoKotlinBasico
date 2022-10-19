package desafios

/*
a. Crie um novo arquivo com uma função main.
b. Declare uma variável mutável capaz de armazenar seu nome completo.
c. Declare uma variável de texto sem valor algum.
d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você
calça.
e. Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000).
f. Declare uma variável capaz de armazenar a população do Brasil (211.000.000).
g. Imprima o valor do PIB per capita.
h. Rode seu programa de maneira que não tenha erros de compilação ou execução.
*/

//Variaveis, tipos de dados e operadores
fun main() {

    var nome = "Francisco Sousa"

    var textoSemValor: String

    val tamanhoPe: UByte = 40u

    val PIB: Long = 1869000000000
    var populacaoBrasil = 211000000

    println("PIB per capita: ${PIB/populacaoBrasil}")

}