package ro.cts.clase;

public class SpitalPrivat extends TemplateInternare {
    String nume;

    public SpitalPrivat(String nume) {
        this.nume = nume;
    }

    @Override
    public int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    public void verificareDisponibilitate() {
        System.out.println("Nu avem paturi suficiente ");
    }

    @Override
    public void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul a fost internat in spitalul " + nume);
    }
}
