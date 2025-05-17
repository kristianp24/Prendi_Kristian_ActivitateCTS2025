package ro.cts.clase;

public class Metrou extends InfoMijloc{
    public Metrou() {
    }

    public Metrou(InfoMijloc urmMijloc) {
        super(urmMijloc);
    }

    @Override
    public void recomandaMijloc(int distantaCalatoriei) {
        System.out.println("Calatorul va lua metroul");
    }
}
