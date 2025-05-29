package cts.teste;

import cts.clase.Persoana;
import cts.exceptii.cnpException;
import cts.exceptii.cnpInexistentExcpetion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class getVarstaTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @org.junit.Test
    public void getVarstaRight() {
        persoana = new Persoana("Mihai", "1921129634783");
        assertEquals(32, persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaRight2() {
        persoana = new Persoana("Mihai", "5021129634783");
        assertEquals(22, persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBoundary() {
        persoana = new Persoana("Mihai", "199123129634783");
        assertEquals(25, persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBoundary2() {
        persoana = new Persoana("Mihai", "500010129634783");
        assertEquals(25, persoana.getVarsta());
    }

    @org.junit.Test(expected = cnpException.class)
    public void cnpExceptieInvalida(){
        persoana = new Persoana("Mihai", "5000k0129634783");
        persoana.getVarsta();
    }

    @org.junit.Test(expected = cnpException.class)
    public void cnpExceptieInvalida2(){
        persoana = new Persoana("Mihai", "500015229634783");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance(){
        persoana = new Persoana("Mihai", "500011429634783");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder(){
        Persoana p1 = new Persoana("Andrei", "1990101356746");
        Persoana p2 = new Persoana("Andrei", "5000101356746");
        assertTrue(p1.getVarsta() > p2.getVarsta());
    }

    @Test(expected = cnpInexistentExcpetion.class)
    public void getVarstaExit(){
        persoana = new Persoana("Mihai", null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality0(){
        Persoana p2 = new Persoana("Andrei", "5250101356746");
        assertEquals(0, p2.getVarsta());
    }

    @Test
    public void getVarstaCardinality1(){
        Persoana p2 = new Persoana("Andrei", "5240209356746");
        assertEquals(1, p2.getVarsta());
    }

}
