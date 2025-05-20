package cts.clase;

public class ProxyAsigurare implements Internare{
    private Internare internare;

    public ProxyAsigurare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void internarePacient(boolean areAsigurare) {
        if (areAsigurare){
            this.internare.internarePacient(areAsigurare);
        }
        else{
            System.out.println("Pacientul trebuie sa asteapta fiindc nu are o asigurare!");
        }
    }
}
