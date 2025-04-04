package ro.cts.clase;

public class Medic extends PersonalSpital{

    public Medic(int slariul, float vechimeAni, String nume) {
        super(slariul, vechimeAni, nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
