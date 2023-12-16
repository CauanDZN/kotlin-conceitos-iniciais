fun main() {
    // ANy, Unit, Nothing
    a(10.8888)
    b()
   // c()
}

fun a(valor: Any){
    println("Imprimindo o valor: $valor")
}

fun b():Unit{
    println("Função sem retorno (Void)")
}

fun c():Nothing{
    TODO ("Função ainda a ser completada")
    // A -> B
}