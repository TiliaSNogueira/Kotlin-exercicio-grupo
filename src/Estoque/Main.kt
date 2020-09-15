package Estoque

fun main() {
    var cadastro1 = Estoque("Item1", 100, 10)
    var cadastro2 = Estoque("Item2", 200, 20)
    var cadastro3 = Estoque("Item3", -200,-1)

    cadastro1.mudarNome("IIItem1")
    cadastro2.mudarQuantidadeMinima(5)
    cadastro2.repor(50)
    cadastro1.darBaixa(95)
    cadastro1.precisaRepor()
    cadastro2.precisaRepor()

    cadastro1.mostra()
    cadastro2.mostra()
    cadastro3.mostra()
}