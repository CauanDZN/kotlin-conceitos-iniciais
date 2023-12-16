fun main() {
    for(i in 1 .. 20){ // Estrutura de repetição FOR Crescente de 1 em 1
        print("${i} ")
    }

    print("\n") // Quebra de linha
    for(i in 20 downTo 1){ // Estrutura de repetição FOR Decrescente de 1 em 1
        print("${i} ")
    }
    print("\n")
    val str = "Criação de aplicativos Android"
    for( i in str){
        print("${i} ")
    }
    print("\n")
    for(i in 1 .. 20 step 2){ // Estrutura de repetição FOR Crescente de 2 em 2
        print("${i} ")
    }
    print("\n")
    for(i in 20 downTo 1 step 3){ // Estrutura de repetição FOR Decrescente de 3 em 3
        print("${i} ")
    }
}