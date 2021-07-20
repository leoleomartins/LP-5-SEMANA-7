package padroesestruturais.adapter;

public class NivelAdapter extends NivelNumero{

    private INivel nivelConceito;

    public NivelAdapter(INivel nivelConceito){this.nivelConceito = nivelConceito;}

    public String recuperarNivel(){
        if(this.getNumeroGrau() == 3){
            nivelConceito.setNivel("A");
        }else
            if (this.getNumeroGrau() == 2){
                nivelConceito.setNivel("B");
            } else {
                nivelConceito.setNivel("C");
            }
        return nivelConceito.getNivel();
    }

    public void salvarNivel(){
        if(nivelConceito.getNivel().equals("A")){
            this.setNumeroGrau(3f);
        }else
            if (nivelConceito.getNivel().equals("B")){
                this.setNumeroGrau(2f);
            }else{
                this.setNumeroGrau(1f);
            }

    }

}
