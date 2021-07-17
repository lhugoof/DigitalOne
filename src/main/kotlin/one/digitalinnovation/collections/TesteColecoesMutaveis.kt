package one.digitalinnovation.collections

fun main() {

    val joao = funcionario("João",2000.0,"CLT")
    val pedro = funcionario("Pedro",1550.0,"PJ")
    val maria = funcionario("Maria",4000.0,"CLT")

    val funcionarios =  mutableListOf(joao,maria)
    funcionarios.forEach { println(it) }

    println("-------------LISTA--------------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("---------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-------------SET--------------")

    val funcionarioSet = mutableSetOf(joao)

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    //note que só pode adicionar joao uma unica vez
    funcionarioSet.add(joao)

    funcionarioSet.forEach { println(it) }

}