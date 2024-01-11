fun contarPalavrasUnicas(texto: String): Int {
    val textoMinusc = texto.toLowerCase()
    val palavras = textoMinusc.split(Regex("\\s|\\p{Punct}"))
    val palavrasFiltradas = palavras.filter { it.isNotBlank() }
    val palavrasUnicas = palavrasFiltradas.toSet()

    return palavrasUnicas.size
}

fun main() {
    val texto = "O Kotlin é uma linguagem de programação. Kotlin é divertido!"
    val resultado = contarPalavrasUnicas(texto)
    println("Número de palavras únicas: $resultado")
}