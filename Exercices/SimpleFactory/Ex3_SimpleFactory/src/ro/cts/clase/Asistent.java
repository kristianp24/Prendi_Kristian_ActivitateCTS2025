package ro.cts.clase;

public class Asistent extends PersonalSpital{


    public Asistent(int slariul, float vechimeAni, String nume) {
        super(slariul, vechimeAni, nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
