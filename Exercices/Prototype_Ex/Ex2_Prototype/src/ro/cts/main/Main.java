package ro.cts.main;

import ro.cts.clase.AbstractReteta;
import ro.cts.clase.RetetaMedicament;

public class Main {
    public static void main(String[] args){
        AbstractReteta reteta1 = new RetetaMedicament(20, 22, 250.56F, 2022, 2030);
        AbstractReteta reteta2 = reteta1.copiaza();

        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
