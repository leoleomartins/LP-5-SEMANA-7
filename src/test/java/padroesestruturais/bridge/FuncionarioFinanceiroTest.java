package padroesestruturais.bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioFinanceiroTest {
    @Test
    @DisplayName("Deve retornar salario para tecnico")
    void deveRetornarSalarioParaTecnico(){
        Escolaridade escolaridade = new Tecnico();
        FuncionarioFinanceiro financeiro = new FuncionarioFinanceiro(1000f);
        financeiro.setEscolaridade(escolaridade);
        assertEquals(1100f, financeiro.calcularSalario());
    }

    @Test
    @DisplayName("Deve retornar salario para Graduacao")
    void deveRetornarSalarioParaGraduacao(){
        Escolaridade escolaridade = new Graduacao();
        FuncionarioFinanceiro financeiro = new FuncionarioFinanceiro(1000f);
        financeiro.setEscolaridade(escolaridade);
        assertEquals(1200f, financeiro.calcularSalario());
    }

    @Test
    @DisplayName("Deve retornar salario para Pos Graduacao")
    void deveRetornarSalarioParaPos(){
        Escolaridade escolaridade = new PosGraduacao();
        FuncionarioFinanceiro financeiro = new FuncionarioFinanceiro(1000f);
        financeiro.setEscolaridade(escolaridade);
        assertEquals(1300f, financeiro.calcularSalario());
    }

}
