package ro.cts.clase;

public class PlataCash implements IPlata{
    @Override
    public void plateste(int pret) {
        System.out.println("Clientul a platit cash suma de "+pret+" RON");
    }
}
