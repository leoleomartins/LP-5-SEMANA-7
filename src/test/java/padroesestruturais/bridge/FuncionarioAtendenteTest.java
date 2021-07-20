package padroesestruturais.bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste Bridge atendente")
class FuncionarioAtendenteTest {

    @Test
    @DisplayName("Deve retornar salario para tecnico")
    void deveRetornarSalarioParaTecnico(){
        Escolaridade escolaridade = new Tecnico();
        FuncionarioAtendente atendente = new FuncionarioAtendente(1000f);
        atendente.setEscolaridade(escolaridade);
        assertEquals(1000f, atendente.calcularSalario());
    }

    @Test
    @DisplayName("Deve retornar salario para Graduacao")
    void deveRetornarSalarioParaGraduacao(){
        Escolaridade escolaridade = new Graduacao();
        FuncionarioAtendente atendente = new FuncionarioAtendente(1000f);
        atendente.setEscolaridade(escolaridade);
        assertEquals(1000f, atendente.calcularSalario());
    }

    @Test
    @DisplayName("Deve retornar salario para Pos Graduacao")
    void deveRetornarSalarioParaPos(){
        Escolaridade escolaridade = new PosGraduacao();
        FuncionarioAtendente atendente = new FuncionarioAtendente(1000f);
        atendente.setEscolaridade(escolaridade);
        assertEquals(1000f, atendente.calcularSalario());
    }
}
