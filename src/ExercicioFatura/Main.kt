package ExercicioFatura

fun main (){

   // println("Adicionando esse print na branchmain")

    //println("Para testar se o commit foi pra branchmain")


    var itemA = Item(54, "Caneta esferográfica", 2, 7.5)
    var itemB = Item(4, "Caneta gel", 0, 5.5)

    println("Faturado um item ${itemA.descricao} na quantidade de ${itemA.quantidade} pçs, um total de R$${itemA.getTotalFatura()}")
    println("Faturado um item ${itemB.descricao} na quantidade de ${itemB.quantidade} pçs, um total de R$${itemB.getTotalFatura()}")

}

