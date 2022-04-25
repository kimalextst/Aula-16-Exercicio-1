package exercicios1

fun main(){
    val listaFuncionarios = ArrayList<Funcionario>()
    val novoFuncionario: Funcionario = Funcionario()

    novoFuncionario.nome = "Luis"
    novoFuncionario.sobrenome = "Silva"
    novoFuncionario.horasTrabalhadas = 10
    novoFuncionario.valorPorHora = 25.50

    println("---------------------------")
    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    println("---------------------------")

    println("---------------------------")
    novoFuncionario.incrementarHoras(2)
    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    println("---------------------------")

    listaFuncionarios.add(novoFuncionario)

    val novoFuncionario2: Funcionario = Funcionario()

    novoFuncionario2.nome = "C"
    novoFuncionario2.sobrenome = "D"
    novoFuncionario2.horasTrabalhadas = 3
    novoFuncionario2.valorPorHora = 3.0

    listaFuncionarios.add(novoFuncionario2)

    val novoFuncionario3: Funcionario = Funcionario()

    novoFuncionario3.nome = "E"
    novoFuncionario3.sobrenome = "F"
    novoFuncionario3.horasTrabalhadas = 4
    novoFuncionario3.valorPorHora = 4.0

    listaFuncionarios.add(novoFuncionario3)

    val novoFuncionario4: Funcionario = Funcionario()

    novoFuncionario4.nome = "G"
    novoFuncionario4.sobrenome = "H"
    novoFuncionario4.horasTrabalhadas = 5
    novoFuncionario4.valorPorHora = 5.0

    listaFuncionarios.add(novoFuncionario4)

    val novoFuncionario5: Funcionario = Funcionario()

    novoFuncionario5.nome = "I"
    novoFuncionario5.sobrenome = "J"
    novoFuncionario5.horasTrabalhadas = 6
    novoFuncionario5.valorPorHora = 6.0

    listaFuncionarios.add(novoFuncionario5)

    val novoFuncionario6: Funcionario = Funcionario()

    novoFuncionario6.nome = "K"
    novoFuncionario6.sobrenome = "L"
    novoFuncionario6.horasTrabalhadas = 7
    novoFuncionario6.valorPorHora = 7.0

    listaFuncionarios.add(novoFuncionario6)

    val novoFuncionario7: Funcionario = Funcionario()

    novoFuncionario7.nome = "M"
    novoFuncionario7.sobrenome = "N"
    novoFuncionario7.horasTrabalhadas = 8
    novoFuncionario7.valorPorHora = 8.0

    listaFuncionarios.add(novoFuncionario7)

    val novoFuncionario8: Funcionario = Funcionario()

    novoFuncionario8.nome = "O"
    novoFuncionario8.sobrenome = "P"
    novoFuncionario8.horasTrabalhadas = 9
    novoFuncionario8.valorPorHora = 9.0

    listaFuncionarios.add(novoFuncionario8)

    val novoFuncionario9: Funcionario = Funcionario()

    novoFuncionario9.nome = "Q"
    novoFuncionario9.sobrenome = "R"
    novoFuncionario9.horasTrabalhadas = 10
    novoFuncionario9.valorPorHora = 10.0

    listaFuncionarios.add(novoFuncionario9)

    val novoFuncionario10: Funcionario = Funcionario()

    novoFuncionario10.nome = "S"
    novoFuncionario10.sobrenome = "T"
    novoFuncionario10.horasTrabalhadas = 7
    novoFuncionario10.valorPorHora = 7.0

    listaFuncionarios.add(novoFuncionario10)

    listaFuncionarios.forEach { funcionario ->
        funcionario.nomeCompleto()
        println("Horas Trabalhadas: ${funcionario.horasTrabalhadas}")
        println("Valor por hora: ${funcionario.valorPorHora}")
        funcionario.calcularSalario()
        println("---------------------------")
    }
}
