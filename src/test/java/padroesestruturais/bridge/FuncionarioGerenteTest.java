package padroesestruturais.bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioGerenteTest {
    @Test
    @DisplayName("Deve retornar salario para tecnico")
    void deveRetornarSalarioParaTecnico(){
        Escolaridade escolaridade = new Tecnico();
        FuncionarioGerente gerente = new FuncionarioGerente(1000f);
        gerente.setEscolaridade(escolaridade);
        assertEquals(1200f, gerente.calcularSalario(), 0.01f);
    }

    @Test
    @DisplayName("Deve retornar salario para Graduacao")
    void deveRetornarSalarioParaGraduacao(){
        Escolaridade escolaridade = new Graduacao();
        FuncionarioGerente gerente = new FuncionarioGerente(1000f);
        gerente.setEscolaridade(escolaridade);
        assertEquals(1300f, gerente.calcularSalario(),0.01f);
    }

    @Test
    @DisplayName("Deve retornar salario para Pos Graduacao")
    void deveRetornarSalarioParaPos(){
        Escolaridade escolaridade = new PosGraduacao();
        FuncionarioGerente gerente = new FuncionarioGerente(1000f);
        gerente.setEscolaridade(escolaridade);
        assertEquals(1400f, gerente.calcularSalario(),0.01f);
    }

}
