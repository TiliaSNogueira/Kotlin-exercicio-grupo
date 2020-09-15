package ExercicioFatura

interface Fatura {
    var codItem: Int
    var descricao: String
    var quantidade: Int
    var preco: Double

    fun getTotalFatura(): Double

}