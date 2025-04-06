package ro.cts.clase;

public class RetetaMedicament extends AbstractReteta{

    public RetetaMedicament(int cantitateMedX, int cantitateMedY, float gramaj, int anulEmiterii, int anulExpirarii) {
        super(cantitateMedX, cantitateMedY, gramaj, anulEmiterii, anulExpirarii);
    }

    public RetetaMedicament() {
        super();
    }

    @Override
    public AbstractReteta copiaza() {
        AbstractReteta reteta  = new RetetaMedicament();
        reteta.anulEmiterii = anulEmiterii;
        reteta.cantitateMedX = cantitateMedX;
        reteta.cantitateMedY = cantitateMedY;
        reteta.anulExpirarii = anulExpirarii;
        reteta.gramaj = gramaj;
        return reteta;
    }
}
