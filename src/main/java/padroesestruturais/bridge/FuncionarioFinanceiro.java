package padroesestruturais.bridge;

public class FuncionarioFinanceiro extends Cargo {


    public FuncionarioFinanceiro(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (1 + escolaridade.percentualAumento());
    }
}
