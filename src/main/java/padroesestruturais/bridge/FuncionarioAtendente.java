package padroesestruturais.bridge;

public class FuncionarioAtendente extends Cargo {


    public FuncionarioAtendente(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase;
    }
}
