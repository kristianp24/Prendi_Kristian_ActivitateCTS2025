package ro.cts.clase;

public class Tramvai extends InfoMijloc{

    public Tramvai() {
    }

    public Tramvai(InfoMijloc urmMijloc) {
        super(urmMijloc);
    }

    @Override
    public void recomandaMijloc(int distantaCalatoriei) {
        if (distantaCalatoriei < 10){
            System.out.println("Calatorul va lua tramvaiul");
        }
        else{
            this.getUrmMijloc().recomandaMijloc(distantaCalatoriei);
        }
    }
}
