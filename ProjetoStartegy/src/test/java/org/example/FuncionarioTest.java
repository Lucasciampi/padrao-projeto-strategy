package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario();
    }

    @Test
    void deveRetornarSalarioComHoraExtraDiurna() {
        funcionario.salarioHoraExtraDiurna(250, 2200);
        assertEquals(2500.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioComHoraExtraNortuno() {
        funcionario.salarioHoraExtraNoturna(250, 2200);
        assertEquals(2650.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarSalarioComHoraExtraFeriado() {
        funcionario.salarioHoraExtraFeriado(250, 2200);
        assertEquals(2800.0f, funcionario.getSalario());
    }

    @Test
    void deveRetornarExcecaoSalarioHoraExtraDiurna() {
        try {
            funcionario.salarioHoraExtraDiurna(200, 2200);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Funcionário não pussí horas de trabalhos suficientes para acrescimo de salário", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSalarioHoraExtraNortuna() {
        try {
            funcionario.salarioHoraExtraNoturna(200, 2200);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Funcionário não pussí horas de trabalhos suficientes para acrescimo de salário", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSalarioHoraExtraFeriado() {
        try {
            funcionario.salarioHoraExtraFeriado(200, 2200);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Funcionário não pussí horas de trabalhos suficientes para acrescimo de salário", e.getMessage());
        }
    }


}