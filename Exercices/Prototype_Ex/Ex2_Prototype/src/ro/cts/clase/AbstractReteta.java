package ro.cts.clase;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class AbstractReteta {
    protected int cantitateMedX;
    protected int cantitateMedY;
    protected float gramaj;
    protected int anulEmiterii;
    protected  int anulExpirarii;

    public AbstractReteta(int cantitateMedX, int cantitateMedY, float gramaj, int anulEmiterii, int anulExpirarii) {
        if (cantitateMedX > 0)
            this.cantitateMedX = cantitateMedX;
        else
            this.cantitateMedX = 0;

        if (cantitateMedY > 0)
            this.cantitateMedY = cantitateMedY;
        else
            this.cantitateMedY = 0;

        if (gramaj > 0)
            this.gramaj = gramaj;
        else
            this.gramaj = 0;

        if (anulEmiterii < LocalDateTime.now().getYear())
              this.anulEmiterii = anulEmiterii;
        else
            this.anulEmiterii = 2025;

        this.anulExpirarii = anulExpirarii;
    }

    public AbstractReteta() {
    }

    public abstract AbstractReteta copiaza();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractReteta{");
        sb.append("cantitateMedX=").append(cantitateMedX);
        sb.append(", cantitateMedY=").append(cantitateMedY);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", anulEmiterii=").append(anulEmiterii);
        sb.append(", anulExpirarii=").append(anulExpirarii);
        sb.append('}');
        return sb.toString();
    }
}
