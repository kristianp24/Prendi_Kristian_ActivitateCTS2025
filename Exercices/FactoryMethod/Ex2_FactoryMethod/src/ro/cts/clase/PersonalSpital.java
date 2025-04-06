package ro.cts.clase;

public abstract class PersonalSpital {
    protected String nume;
    protected int salariul;
    protected String ziuaNasterii;

    public PersonalSpital(String nume, int salariul, String ziuaNasterii) {
        this.nume = nume;
        this.salariul = salariul;
        this.ziuaNasterii = ziuaNasterii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariul=").append(salariul);
        sb.append(", ziuaNasterii='").append(ziuaNasterii).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
