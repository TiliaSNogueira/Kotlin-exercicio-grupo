package Estoque

class Estoque ( var nome: String, var quantidadeAtual: Int, var quantidadeMinima: Int) {

    init {
        if (quantidadeAtual < 0 && quantidadeMinima < 0 ){
            println("Não é possível que quantidade atual e quantidade minima sejam inferiores a zero.")
        }
    }

    fun mudarNome(novoNome: String){
        nome = novoNome
        println("O novo nome do produto é $nome.")
    }

    fun mudarQuantidadeMinima(quantidadeMinima: Int){
        println("A nova quantidade minima é $quantidadeMinima unidades.")
    }

    fun repor(quantidade : Int){
        quantidadeAtual += quantidade
        println("A quantidade atual dos produtos após a reposição é de $quantidadeAtual unidades.")
    }

    fun darBaixa(quantidade : Int) {
        quantidadeAtual -= quantidade
        println("A quantidade atual dos produtos após a baixa dos produtos é de $quantidadeAtual unidades.")
    }

    fun mostra(): String {
        return "Produto: $nome  /  Quantidade minima: $quantidadeMinima  /  Quantidade atual: $quantidadeAtual"
    }

    fun precisaRepor() : Boolean{
        return (quantidadeAtual <= quantidadeMinima)
    }
}