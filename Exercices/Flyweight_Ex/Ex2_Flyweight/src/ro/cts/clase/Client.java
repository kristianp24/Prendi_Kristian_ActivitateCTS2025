package ro.cts.clase;

public class Client implements ClientAbstract{
    String nume;
    String numarTelefon;
    String email;

    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaClient(Rezervare rezervare) {
        System.out.println(this.toString());
        System.out.println(rezervare.toString());
    }
}
