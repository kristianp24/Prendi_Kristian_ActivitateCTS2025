package ro.cts.readers;

import ro.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public abstract class ReadersInterface {
    public List<Aplicant> readAplicants(String path) throws FileNotFoundException {
        return null;
    }

    public void citesteAplicant(Scanner input, Aplicant aplicant)
    {
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setVarsta(varsta);
        aplicant.setPrenume(prenume);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr, vect);

    }
}
