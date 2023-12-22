fun somar(array: IntArray): Int {
    var soma = 0

    for (elemento in array) {
        soma += elemento
    }

    return soma
}

fun main() {
    val ar = intArrayOf(1, 2, 3, 4)
    val soma = somar(ar)

    println("A soma dos elementos do array é: $soma")
}
