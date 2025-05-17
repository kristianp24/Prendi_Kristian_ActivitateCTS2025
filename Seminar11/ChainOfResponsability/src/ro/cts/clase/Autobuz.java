package ro.cts.clase;

public class Autobuz extends InfoMijloc{
    public Autobuz() {
    }

    public Autobuz(InfoMijloc urmMijloc) {
        super(urmMijloc);
    }

    @Override
    public void recomandaMijloc(int distantaCalatoriei) {
        if (distantaCalatoriei < 5){
            System.out.println("Calatorul va lua autobuzul.");
        }
        else{
            this.getUrmMijloc().recomandaMijloc(distantaCalatoriei);
        }
    }
}
