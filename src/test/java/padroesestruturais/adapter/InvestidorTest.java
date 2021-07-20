package padroesestruturais.adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste Adapter")
class InvestidorTest {

    @Test
    void deveRetornarConceitoInvestidor(){
        Investidor investidor = new Investidor();
        investidor.setNivel("B");

        assertEquals("B", investidor.getNivel());
    }

    @Test
    void deveRetornarNumeroInvestidor(){
        Investidor investidor = new Investidor();
        investidor.setNivel("B");

        assertEquals(2, investidor.getNumeroGrau());
    }

}
