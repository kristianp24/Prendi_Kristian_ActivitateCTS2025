package ro.cts.clase;

public class Process {
    protected String state;
    protected String PID;

    protected String name;
    protected float memoryUsage;

    public Process(String state, String PID, String name, float memoryUsage) {
        this.state = state;
        this.PID = PID;
        this.name = name;
        this.memoryUsage = memoryUsage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Process{");
        sb.append("state='").append(state).append('\'');
        sb.append(", PID='").append(PID).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", memoryUsage=").append(memoryUsage);
        sb.append('}');
        return sb.toString();
    }
}
