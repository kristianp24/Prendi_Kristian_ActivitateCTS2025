package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        InfoMijloc autobuz = new Autobuz();
        InfoMijloc tramvai = new Tramvai();
        InfoMijloc troleibuz = new Troleibuz();
        InfoMijloc metrou = new Metrou();

        troleibuz.setUrmMijloc(autobuz);
        autobuz.setUrmMijloc(tramvai);
        tramvai.setUrmMijloc(metrou);

        troleibuz.recomandaMijloc(5);
        troleibuz.recomandaMijloc(2);
        troleibuz.recomandaMijloc(12);
        troleibuz.recomandaMijloc(4);

    }
}