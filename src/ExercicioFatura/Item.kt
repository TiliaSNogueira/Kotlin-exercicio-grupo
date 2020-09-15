package ExercicioFatura

class Item(override var codItem: Int, override var descricao: String, override var quantidade: Int, override var preco: Double) : Fatura {
    init {
        if (quantidade <= 0) {
            quantidade = 0
        } else if (preco <= 0) {
            preco = 0.0
        }
    }

    override fun getTotalFatura(): Double {
        var valorTotal =  quantidade * preco
        return valorTotal
        println("Faturado um item $descricao na quantidade de $quantidade pçs, um total de R$${valorTotal}")
    }
}