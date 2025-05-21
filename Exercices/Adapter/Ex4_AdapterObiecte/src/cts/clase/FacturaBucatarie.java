package cts.clase;

public class FacturaBucatarie implements IFacturaBucatarie{
    private String data;
    private float pretul;

    public FacturaBucatarie(String data, float pretul) {
        this.data = data;
        this.pretul = pretul;
    }


    @Override
    public void printeazaFactura() {
        System.out.println("Acesta este o factura de BUCATARIE din data de "+this.data+
                " si costa "+this.pretul+" RON");
    }
}
