package padroesestruturais.adapter;

public class NivelConceito implements INivel{

    private String conceito;

    @Override
    public String getNivel() {
        return this.conceito;
    }

    @Override
    public void setNivel(String nivel) {
        this.conceito = nivel;
    }
}
