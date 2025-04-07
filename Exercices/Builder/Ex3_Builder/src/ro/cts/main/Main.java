package ro.cts.main;

import ro.cts.clase.TreatmentBuilder;
import ro.cts.clase.TreatmentPlan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreatmentBuilder builder  = new TreatmentBuilder();
        List<String> medicamente = new ArrayList<>();
        medicamente.add("Paracetamol");
        medicamente.add("TheraFlu");
        builder.setDietSchedule(true).setMedicationList(medicamente).setPhysiotherapyPlan(true);
        TreatmentPlan treatmentPlan = builder.build();

        builder.setDietSchedule(false).setMentalHealthSupport(true).setMedicationList(null);
        TreatmentPlan treatmentPlan1 = builder.build();

        System.out.println(treatmentPlan);
        System.out.println(treatmentPlan1);
    }
}