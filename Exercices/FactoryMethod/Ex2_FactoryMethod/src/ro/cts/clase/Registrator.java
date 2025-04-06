package ro.cts.clase;

public class Registrator extends PersonalSpital{

    public Registrator(String nume, int salariul, String ziuaNasterii) {
        super(nume, salariul, ziuaNasterii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Registrator{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
