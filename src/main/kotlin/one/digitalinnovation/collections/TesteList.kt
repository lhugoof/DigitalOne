package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João",2000.0,"CLT")
    val pedro = funcionario("Pedro",1550.0,"PJ")
    val maria = funcionario("Maria",4000.0,"CLT")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach{println(it)}

    println("---------------------------")
    println(funcionarios.find{it.nome == "Maria"})
    println(funcionarios.find{it.nome == ",aria"})

    println("---------------------------")
    //o sortedby{} permite ordenar por um argumento informado (no caso abaixo, o salario)
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("---------------------------")
    //o groupBy cria uma lista de quem atende ao seu requisito
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

    println("---------------------------")


}


data class funcionario (
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
        ) {
    override fun toString():String ="""
        Nome: $nome
        Salário: $salario
    """.trimIndent()
}