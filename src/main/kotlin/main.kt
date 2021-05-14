fun main(args: Array<String>) {
    println("Tabla del 6")
    tabla6.forEach{
        println("6*${it/6} = ${it}")
    }

    println("Numeros Random")
    arrayRan.forEach{
        println("Numero= ${it}")
    }

    fun miembro(){



    }

    println("Impares")
    arrayRan.forEach{
        if(it%2 != 0)
        println("Numero= ${it}")

    }


}