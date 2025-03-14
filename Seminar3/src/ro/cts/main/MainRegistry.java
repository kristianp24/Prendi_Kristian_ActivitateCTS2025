package ro.cts.main;

import ro.cts.registry.Autoritate;
import ro.cts.registry.Reglementare;

// Singleton Registry
public class MainRegistry {
    public static void main(String[] args){
       Autoritate autoritate = Autoritate.getInstance("autoritate1",  "autoritate.com" );
       Reglementare reglementare1 = autoritate.reglementeazaModel("Dacia Logan");
       Reglementare reglementare2 = autoritate.reglementeazaModel("Ferrari");
       Reglementare reglementare3 = autoritate.reglementeazaModel("Dacia Logan");
       System.out.println(reglementare1);
       System.out.println(reglementare2);
        System.out.println(reglementare3);
    }
}
