package ro.cts.main;

import ro.cts.clase.Angajat;
import ro.cts.clase.Aplicant;
import ro.cts.readers.AngajatiReader;
import ro.cts.readers.ReadersInterface;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		ReadersInterface aplicantiReader = new AngajatiReader();
		try {
			listaAplicanti = aplicantiReader.readAplicants("Seminar2/angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
