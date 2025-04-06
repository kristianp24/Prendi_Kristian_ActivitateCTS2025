package ro.cts.clase;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume, int salariul, String ziuaNasterii) {
        super(nume, salariul, ziuaNasterii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
