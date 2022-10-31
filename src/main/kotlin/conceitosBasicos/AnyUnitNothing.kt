package conceitosBasicos

fun main() {
    valores(2)
    valores("teste")
    valores(49f)

    nada()

}

//Any - da origin a todos os tipos de dados. ex Int, Double, Float, String...
//Unit - denota que a funcao nao tem retorno (executa o corpo e acaba a funcao)
//caso não declare o escopo por padrao o kotlin tem como Unit
fun valores(valeu: Any): Unit {
    //corpo
}

//Nothing - tipo de dado que nao tem retorno, utilizando principalmente para fazer lancamento de excessoes
fun nada(): Nothing {
    TODO("essa funcao nao faz nada :)")
}
