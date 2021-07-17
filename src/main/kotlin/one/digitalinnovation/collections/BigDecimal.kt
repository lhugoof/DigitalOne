package one.digitalinnovation.collections

import java.math.BigDecimal

//criando funções extendidas de arrays (funções que criamos e não estão no código da API)

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria()/this.size.toBigDecimal()