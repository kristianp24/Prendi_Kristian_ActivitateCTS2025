package cts.main;

import cts.clase.AdapterBar;
import cts.clase.FacturaBar;
import cts.clase.FacturaBucatarie;

public class Main {
    public static void main(String[] args) {
        FacturaBucatarie facturaBucatarie = new FacturaBucatarie("21/05/2025", 21.5f);
        facturaBucatarie.printeazaFactura();

        FacturaBar bar = new FacturaBar("21/05/2025", 15.5f, false);
        AdapterBar facturaAdapter = new AdapterBar(bar);
        facturaAdapter.printeazaFactura();
    }
}