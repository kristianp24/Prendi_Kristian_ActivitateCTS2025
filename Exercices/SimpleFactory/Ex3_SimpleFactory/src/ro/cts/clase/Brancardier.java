package ro.cts.clase;

public class Brancardier extends PersonalSpital{

    public Brancardier(int slariul, float vechimeAni, String nume) {
        super(slariul, vechimeAni, nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
