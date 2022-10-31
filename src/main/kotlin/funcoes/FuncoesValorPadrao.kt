package funcoes

fun main() {
    endereco("stree", "joao pessoa", "pb",) // sem passar att com valor padrao
    endereco("stree", "joao pessoa", "pb", "5800033") // cep com valor padrao alterado
    endereco(cidade = "santa quiteria", estado = "pb", rua = "sem saida") // organizando utilizando parametro
}

fun endereco(rua: String, cidade: String, estado: String, cep: String = "", num: Int = 0) {

}