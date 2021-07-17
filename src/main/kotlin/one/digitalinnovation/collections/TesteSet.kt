package one.digitalinnovation.collections

fun main() {

    val joao = funcionario("João",2000.0,"CLT")
    val pedro = funcionario("Pedro",1550.0,"PJ")
    val maria = funcionario("Maria",4000.0,"CLT")

    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)
    //união de conjunto
    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach { println(it) }

    println("---------------------------")
    //deleção de conjunto
    val funcionarios3 = setOf(joao,pedro,maria)

    val resultSubtract = funcionarios3.subtract(funcionarios2)

    resultSubtract.forEach { println(it) }

    println("---------------------------")
    //interseção de conjuntos
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}