package ro.cts.clase;

public class Troleibuz extends InfoMijloc{
    public Troleibuz() {
    }

    public Troleibuz(InfoMijloc urmMijloc) {
        super(urmMijloc);
    }

    @Override
    public void recomandaMijloc(int distantaCalatoriei) {
        if (distantaCalatoriei < 3){
            System.out.println("Calatorul a luat troleibuzul");
        }
        else{
            this.getUrmMijloc().recomandaMijloc(distantaCalatoriei);
        }
    }
}
