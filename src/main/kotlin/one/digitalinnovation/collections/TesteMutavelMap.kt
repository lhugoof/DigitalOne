package one.digitalinnovation.collections

fun main() {

    val joao = funcionario("João",2000.0,"CLT")
    val pedro = funcionario("Pedro",1550.0,"PJ")
    val maria = funcionario("Maria",4000.0,"CLT")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("---------------------------")

    repositorio.findAll().forEach { println(it) }

    println("---------------------------")

    println(repositorio.remove(maria.nome))

    println("---------------------------")

    repositorio.findAll().forEach { println(it) }

}