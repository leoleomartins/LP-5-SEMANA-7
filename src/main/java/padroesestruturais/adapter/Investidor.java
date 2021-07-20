package padroesestruturais.adapter;

public class Investidor {

    private float montante;
    private String nota;
    INivel nivel;
    NivelAdapter persistencia;

    public Investidor() {
       nivel = new NivelConceito();
       persistencia = new NivelAdapter(nivel);
    }

    public void setNivel(String conceito) {
        nivel.setNivel(conceito);
        persistencia.salvarNivel();
    }

    public String getNivel(){return persistencia.recuperarNivel();}

    public float getNumeroGrau(){return persistencia.getNumeroGrau();}

    public float getMontante() {
        return montante;
    }


    /* Outro padrao

   public void operacaoComLucro(float valor1, float valor2){
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.montante = calculadora.calcular(new OperacaoLucro());
    }

    public void operacaoComPrejuizo(float valor1, float valor2){
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.montante = calculadora.calcular(new OperacaoPrejuizo());
    }*/
}
