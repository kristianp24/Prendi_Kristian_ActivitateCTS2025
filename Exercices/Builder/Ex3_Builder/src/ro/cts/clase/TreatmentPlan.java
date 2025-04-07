package ro.cts.clase;

import java.util.List;

public class TreatmentPlan {
    private boolean dietSchedule;
    private boolean physiotherapyPlan;
    private List<String> medicationList;
    private boolean mentalHealthSupport;
    private boolean activityTracking;

    public TreatmentPlan(boolean dietSchedule, boolean physiotherapyPlan, List<String> medicationList, boolean mentalHealthSupport, boolean activityTracking) {
        this.dietSchedule = dietSchedule;
        this.physiotherapyPlan = physiotherapyPlan;
        this.medicationList = medicationList;
        this.mentalHealthSupport = mentalHealthSupport;
        this.activityTracking = activityTracking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TreatmentPlan{");
        sb.append("dietSchedule=").append(dietSchedule);
        sb.append(", physiotherapyPlan=").append(physiotherapyPlan);
        sb.append(", medicationList=").append(medicationList);
        sb.append(", mentalHealthSupport=").append(mentalHealthSupport);
        sb.append(", activityTracking=").append(activityTracking);
        sb.append('}');
        return sb.toString();
    }
}
