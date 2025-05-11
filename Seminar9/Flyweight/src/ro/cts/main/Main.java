package ro.cts.main;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabrica = new FabricaPacienti();

        PacientAbstract pacient = fabrica.getPacient("Ion", "07581234", "ion@gmail.com");
        Spitalizare spitalizare = new Spitalizare(5,8,10);
        Spitalizare spitalizare1 = new Spitalizare(6,9,1);

        pacient.afiseazaPacient(spitalizare);
        pacient.afiseazaPacient(spitalizare1);

        Spitalizare spitalizare2 = new Spitalizare(7,6,9);
        Spitalizare spitalizare3 = new Spitalizare(3,6,4);

        fabrica.getPacient("ioana", "075812345", "ioana@gmail.com" ).afiseazaPacient(spitalizare2);
        try{
            fabrica.getPacient("075812345").afiseazaPacient(spitalizare3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}