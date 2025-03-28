package cts.main;

import cts.clase.CarRentalAgreement;
import cts.clase.ShortTermAgreement;

public class Main {
    public static void main(String[] args) {
        CarRentalAgreement agreement = new ShortTermAgreement("BMW", 2009, "B106LK", "BMW Group", "Popescu Mihai", "075693458", "20/03/2000", 4);

        CarRentalAgreement agreement1 = agreement.copy("George", "15/01/1996", "072563984");
        CarRentalAgreement agreement2 = agreement.copy("Miri", "16/05/1998", "07639123");

        System.out.println(agreement);
        System.out.println(agreement1);
        System.out.println(agreement2);



    }
}