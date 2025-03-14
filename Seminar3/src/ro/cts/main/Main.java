package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasini;
import ro.cts.clase.LazyAutoritateReglementariMasini;

public class Main {
    public static void main(String[] args){
        AutoritateReglementareMasini autoritate = AutoritateReglementareMasini.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasini autoritate2 = AutoritateReglementareMasini.getInstance();
        autoritate2.setWebsite("www.siteNou");
        System.out.println(autoritate2);
        System.out.println(autoritate);

        autoritate2.reglementeazaModel("Dacia Logan");
        System.out.println(autoritate);

        LazyAutoritateReglementariMasini autoritateLazy = LazyAutoritateReglementariMasini.getInstance("autoritateLazy", "www.lazy.com");
        LazyAutoritateReglementariMasini autoritateLazy2 = LazyAutoritateReglementariMasini.getInstance("autoritateLazy2", "www.lazy2");
        System.out.println(autoritateLazy);
        System.out.println(autoritateLazy2);
    }
}
