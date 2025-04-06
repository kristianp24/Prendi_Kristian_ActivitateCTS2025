package ro.cts.clase;

public class Secretar extends PersonalSpital{

    public Secretar(String nume, int salariul, String ziuaNasterii) {
        super(nume, salariul, ziuaNasterii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
