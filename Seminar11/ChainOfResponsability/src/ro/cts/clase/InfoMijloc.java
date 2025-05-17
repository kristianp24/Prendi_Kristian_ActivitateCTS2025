package ro.cts.clase;

public abstract class InfoMijloc {
    public InfoMijloc() {
    }

    private InfoMijloc urmMijloc;

    public InfoMijloc(InfoMijloc urmMijloc) {
        this.urmMijloc = urmMijloc;
    }

    public InfoMijloc getUrmMijloc() {
        return urmMijloc;
    }

    public void setUrmMijloc(InfoMijloc urmMijloc) {
        this.urmMijloc = urmMijloc;
    }

    public abstract void recomandaMijloc(int distantaCalatoriei);
}
