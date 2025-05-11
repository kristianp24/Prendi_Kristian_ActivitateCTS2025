package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, PacientAbstract> colectiePacienti;

    public FabricaPacienti() {
        this.colectiePacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String telefon) throws Exception {
        PacientAbstract pacient = colectiePacienti.get(telefon);
        if (pacient == null){
            throw new Exception();
        }
        return  pacient;
    }

    public PacientAbstract getPacient(String nume, String nrTelefon, String adresaMail){
        PacientAbstract pacient = colectiePacienti.get(nrTelefon);
        if (pacient == null){
            pacient = new Pacient(nume, nrTelefon, adresaMail);
            colectiePacienti.put(nrTelefon, pacient);
        }
        return pacient;
    }
}
