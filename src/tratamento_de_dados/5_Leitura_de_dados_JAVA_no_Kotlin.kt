import java.util.Scanner

fun ler_int(){
    val scanner = Scanner(System. `in`)
    println("Digite um número inteiro: ")
    val num = scanner.nextInt()
    println("Você digitou: ${num}")
}
fun ler_double(){ // utilizar vírgula
    val scanner = Scanner(System. `in`)
    println("Digite um número double: ")
    val num = scanner.nextDouble()
    println("Você digitou: ${num}")
}
fun ler_string(){
    val scanner = Scanner(System. `in`)
    println("Digite um nome: ")
    val num = scanner.next()
    println("Você digitou: ${num}")
}
fun ler_float(){ // utilizar vírgula
    val scanner = Scanner(System. `in`)
    println("Digite um número float: ")
    val num = scanner.nextFloat()
    println("Você digitou: ${num}")
}
fun main() {
    ler_int()
    ler_double()
    ler_string()
    ler_float()
    ler_boolean()

}
fun ler_boolean(){
    val scanner = Scanner(System. `in`)
    println("Digite um valor boleano: ")
    val num = scanner.nextBoolean()
    println("Você digitou: ${num}")
    scanner.close()
}