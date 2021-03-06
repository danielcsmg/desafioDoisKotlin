import kotlin.system.exitProcess

fun main() {
    boasVindas()
    while (true){
        val notas = Array(4){ i ->
            pegarNota(i)
        }

        val mediaAluno = calcMedia(notas)

        println("Média = $mediaAluno")

        menu()
    }
}


fun boasVindas(){
    println("Bem vindo ao sistema de cálculo de média das notas das Avaliações da Escola de SimCity!!!")
    println("Vamos começar?")
    println("As notas devem ser digitadas num intervalo de 0 a 10.")
    println()
}


fun pegarNota(i: Int): Double{
    var nota: Double
    do {
        println("Digite a ${i+1}ª nota da avaliação do aluno:")
        nota = readln().toDouble()
        if (nota !in 0.0..10.0) {
            println("nota inválida!")
            println("A nota deve estar entre 0 e 10!")
            println()
        }
    }while (nota !in 0.0..10.0)
    return nota
}


fun calcMedia(notas: Array<Double>): Double{
    var media = 0.0
    notas.forEach { i ->
        media += i
    }
    return media / notas.size
}


fun menu(){
    println()
    println("Novo cálculo (1 - sim // 2 - não)")
    val opcao = readln().toInt()

    when(opcao){
        1 -> {
            println("Novo cálculo...")
            println()
        }
        2 -> {
            println("Obrigado por utilizar nosso sitema.\nAté mais!")
            exitProcess(0)
        }
        else -> {
            println("Opção inválida!")
            menu()
        }
    }
}