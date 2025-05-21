package cts.clase;

public class AdapterBar extends FacturaBar implements IFacturaBucatarie{

    public AdapterBar(String data, float pretul, boolean contineBauturiAlcool) {
        super(data, pretul, contineBauturiAlcool);
    }

    @Override
    public void printeazaFactura() {
        super.getFactura();
    }
}
