package ro.cts.readers;

import ro.cts.clase.Angajat;
import ro.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends ReadersInterface{
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException
    {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat a = new Angajat();
            super.citesteAplicant(input2, a);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            a.setOcupatie(ocupatie);
            a.setSalariu(salariu);
            angajati.add(a);
        }
        input2.close();
        return angajati;
    }
}
