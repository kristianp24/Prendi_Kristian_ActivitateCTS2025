package ro.cts.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, int salariul, String ziuaNasterii) {
        super(nume, salariul, ziuaNasterii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
