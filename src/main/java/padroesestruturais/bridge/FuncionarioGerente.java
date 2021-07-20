package padroesestruturais.bridge;

public class FuncionarioGerente extends Cargo{


    public FuncionarioGerente(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (1.1f + escolaridade.percentualAumento());
    }
}
