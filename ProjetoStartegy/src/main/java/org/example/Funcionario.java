package org.example;

public class Funcionario {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void salarioHoraExtraDiurna(float horasTrabalhadas, float salarioBase) {
        CalcularHoraExtra calcularHoraExtra =  new CalcularHoraExtra(horasTrabalhadas, salarioBase);
        this.salario = calcularHoraExtra.calcular(new HoraExtraDiurna());
    }

    public void salarioHoraExtraNoturna(float horasTrabalhadas, float salarioBase) {
        CalcularHoraExtra calcularHoraExtra =  new CalcularHoraExtra(horasTrabalhadas, salarioBase);
        this.salario = calcularHoraExtra.calcular(new HoraExtraNoturna());
    }

    public void salarioHoraExtraFeriado(float horasTrabalhadas, float salarioBase) {
        CalcularHoraExtra calcularHoraExtra =  new CalcularHoraExtra(horasTrabalhadas, salarioBase);
        this.salario = calcularHoraExtra.calcular(new HoraExtraFeriado());
    }

}
