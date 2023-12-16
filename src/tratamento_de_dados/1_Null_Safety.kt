fun main() {
    var str: String? = null
    println(str?.length) // Kotlin identifica e assume o tratamento do erro
    str= "Testando minha string"
    println(str!!.length) // EU assumo o erro
    println("Testando meu code")
}