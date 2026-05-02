package org.example;

public class HoraExtraNoturna implements HoraExtra {

    public float calcular(float horasTrabalhadas, float salarioBase) {
        if (horasTrabalhadas <= 220) {
            throw new IllegalArgumentException("Funcionário não pussí horas de trabalhos suficientes para acrescimo de salário");
        }
        else {
            int horasTrabalhadasBase = 220;
            float valorHora = salarioBase / horasTrabalhadasBase;
            float horasExtras = horasTrabalhadas - horasTrabalhadasBase;
            return (valorHora * 1.5f * horasExtras) + salarioBase;
        }
    }

}
