package ro.cts.clase;

import java.util.List;

public class TreatmentBuilder implements AbstractBuilder{
    private boolean dietSchedule;
    private boolean physiotherapyPlan;
    private List<String> medicationList;
    private boolean mentalHealthSupport;
    private boolean activityTracking;

    public TreatmentBuilder(){
        this.dietSchedule = false;
        this.activityTracking = false;
        this.physiotherapyPlan = false;
        this.medicationList = null;
        this.mentalHealthSupport = false;
    }

    public TreatmentBuilder setDietSchedule(boolean dietSchedule) {
        this.dietSchedule = dietSchedule;
        return this;
    }

    public TreatmentBuilder setPhysiotherapyPlan(boolean physiotherapyPlan) {
        this.physiotherapyPlan = physiotherapyPlan;
        return this;
    }

    public TreatmentBuilder setMedicationList(List<String> medicationList) {
        this.medicationList = medicationList;
        return this;
    }

    public TreatmentBuilder setMentalHealthSupport(boolean mentalHealthSupport) {
        this.mentalHealthSupport = mentalHealthSupport;
        return this;
    }

    public TreatmentBuilder setActivityTracking(boolean activityTracking) {
        this.activityTracking = activityTracking;
        return this;
    }

    @Override
    public TreatmentPlan build() {
        return new TreatmentPlan(dietSchedule, physiotherapyPlan, medicationList, mentalHealthSupport, activityTracking);
    }
}
