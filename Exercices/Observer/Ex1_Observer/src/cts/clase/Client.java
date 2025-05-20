package cts.clase;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }


    @Override
    public void notificaVirus(String nume) {
        System.out.println("Domnul/Doamna "+this.nume+" va sfatuim sa aveti grija de virusul "+nume);
    }
}
