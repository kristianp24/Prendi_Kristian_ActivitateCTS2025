package cts.clase;

public class Receptionist {

    public String poateLuaLocLaMasa(Masa masa1)
    {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if (masa1.isEsteLibera()){
            if (picolo.esteDebarasata(masa1)){
                if (ospatar.esteAranjataMasa(masa1)){
                    return "Luati loc la masa " + masa1.getNumarMasa();
                }
                else{
                    return "Asteptati sa aranjam masa";

                }
            }
            else{
                return "Asteaptati pentru ca tocmai s a ridicat cineva!";
            }
        }
        else{
            return "Momentan masa " + masa1.getNumarMasa() + " nu este disponibila!";
        }

    }
}
