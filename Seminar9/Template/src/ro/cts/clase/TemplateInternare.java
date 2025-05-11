package ro.cts.clase;

public abstract class TemplateInternare {
    // obligatoriu sa fie final
    public final void internare(Pacient pacient){
        if(analizareDificultate(pacient) < 3){
            System.out.println("Nu necesita internare!");
        }
        else{
            verificareDisponibilitate();
            emitereFisa(pacient);
        }
    }

    public abstract int analizareDificultate(Pacient pacient);
    public abstract void verificareDisponibilitate();
    public abstract void emitereFisa(Pacient pacient);
}
