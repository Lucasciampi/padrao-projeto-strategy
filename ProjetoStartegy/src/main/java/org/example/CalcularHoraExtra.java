package org.example;

public class CalcularHoraExtra {

    private float horasTrabalhadas;
    private float salarioBase;

    public CalcularHoraExtra(float horasTrabalhadas, float salarioBase) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioBase = salarioBase;
    }

    public float calcular(HoraExtra horaExtra) {
        return horaExtra.calcular(horasTrabalhadas, salarioBase);
    }

}
