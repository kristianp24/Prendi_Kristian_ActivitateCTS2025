package cts.main;

import cts.clase.AdapterBar;
import cts.clase.FacturaBucatarie;

public class Main {
    public static void main(String[] args) {
        FacturaBucatarie facturaBucatarie = new FacturaBucatarie("21/05/2025", 200.2f);
        facturaBucatarie.printeazaFactura();

        AdapterBar facturaBar = new AdapterBar("21/05/2025", 52.5f, false);
        facturaBar.printeazaFactura();
    }
}