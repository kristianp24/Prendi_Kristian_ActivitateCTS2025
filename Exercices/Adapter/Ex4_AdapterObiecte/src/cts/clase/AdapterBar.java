package cts.clase;

public class AdapterBar implements IFacturaBucatarie {
    private FacturaBar bar;

    public AdapterBar(FacturaBar bar) {
        this.bar = bar;
    }

    @Override
    public void printeazaFactura() {
        bar.getFactura();
    }
}
