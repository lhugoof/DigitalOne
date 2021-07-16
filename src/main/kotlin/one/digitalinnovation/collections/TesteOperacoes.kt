package one.digitalinnovation.collections

fun main () {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4050.0)

    for (salario in salarios) {
        println(salario)
    }
    println("---------------------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Média dos salários: ${salarios.average()}")

    //note que o max e o min estão depreciados, então podemos usar as funções a seguir:
    println("---------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")




    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    //o filter() itera cada elemento dentro da array e faz a verificação dentro de chaves
    println("---------------------------")

    salarioMaiorQue2500.forEach{println(it)}

    println("---------------------------")
    //o count() apenas conta quantos elementos atendem a verificação dentro de {}
    println(salarios.count{it in 2000.0 .. 5000.0})

    println("---------------------------")
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    println("---------------------------")
    //o any{} verifica se existe um elemento que atende a condição
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 10000.0})

}
