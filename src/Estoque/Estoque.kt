package Estoque

class Estoque ( var nome: String, var quantidadeAtual: Int, var quantidadeMinima: Int) {

    init {
        if (quantidadeAtual < 0 || quantidadeMinima < 0){
            println("Erro no cadastro do item $nome, digite as quantidades corretas")
            print("Digite a quantidade atual do item $nome:")
            var newQtd = readLine()!!
            quantidadeAtual = newQtd.toInt()
            print("Digite a quantidade Minima do item $nome:")
            var newQtdMin = readLine()!!
            quantidadeMinima = newQtdMin.toInt()
        }
        println("item $nome cadastrado com sucesso")
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
        return println("Produto: $nome  /  Quantidade minima: $quantidadeMinima  /  Quantidade atual: $quantidadeAtual").toString()
    }

    fun precisaRepor(): Boolean {
        if (quantidadeAtual <= quantidadeMinima){
            println("Necessario repor o estoque do item $nome")
            return true
        }
        else{
            println("Item $nome esta com o estoque em dia")
            return false
        }
    }
}