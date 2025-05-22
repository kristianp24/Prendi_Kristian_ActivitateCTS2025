package cts.clase;

public class Zbor {
    private String plecare;
    private String sosire;

    private String data;

    public Zbor(String plecare, String sosire, String data) {
        this.plecare = plecare;
        this.sosire = sosire;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("plecare='").append(plecare).append('\'');
        sb.append(", sosire='").append(sosire).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
