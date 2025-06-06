package ro.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	public static int sumaFinantata = 30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte  + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	public Elev() {
		super();
	}

	@Override
	public void afiseazaInformatiiFinanciare() {
		System.out.println("Elevul "+getNume()+" "+getPrenume()+" primeste "+sumaFinantata+" Euro/zi in proiect.");

	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

}
