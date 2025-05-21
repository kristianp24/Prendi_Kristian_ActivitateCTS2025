package cts.clase;

public class FacturaBar {
    private String data;
    private float pretul;
    private boolean contineBauturiAlcool;

    public FacturaBar(String data, float pretul, boolean contineBauturiAlcool) {
        this.data = data;
        this.pretul = pretul;
        this.contineBauturiAlcool = contineBauturiAlcool;
    }

    public void getFactura(){
        System.out.println("Acesta este o factura din BAR de la data de "+this.data+
                "cu pretul de "+this.pretul+" RON "+" si contine alcool: "+this.contineBauturiAlcool);
    }
}
