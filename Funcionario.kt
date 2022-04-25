package exercicios1

class Funcionario(
    var nome: String = "a",
    var sobrenome: String = "b",
    var horasTrabalhadas: Int = 0,
    var valorPorHora: Double = 0.0
) {
    fun nomeCompleto(){
        println("Nome: $nome $sobrenome")
    }

    fun calcularSalario() {
        val salarioMes = horasTrabalhadas * valorPorHora
        println("Quanto receberá no mês: $salarioMes")
    }

    fun incrementarHoras(horasIncrementadas : Int){
        horasTrabalhadas += horasIncrementadas
    }
}