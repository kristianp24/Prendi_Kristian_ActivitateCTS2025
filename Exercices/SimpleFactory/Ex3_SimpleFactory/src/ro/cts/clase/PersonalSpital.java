package ro.cts.clase;

public abstract class PersonalSpital {
    private int slariul;
    private float vechimeAni;
    private String nume;

    public PersonalSpital(int slariul, float vechimeAni, String nume) {
        this.slariul = slariul;
        this.vechimeAni = vechimeAni;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("slariul=").append(slariul);
        sb.append(", vechimeAni=").append(vechimeAni);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
