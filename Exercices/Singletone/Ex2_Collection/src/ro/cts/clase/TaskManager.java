package ro.cts.clase;

import java.util.HashMap;

public class TaskManager {
    private HashMap<String, Process> processesMap = new HashMap<>();
    public static TaskManager instance = null;

    private TaskManager() {
    }

    public static synchronized TaskManager getInstance(){
        if (instance == null){
            instance = new TaskManager();
        }
        return instance;
    }

    public void addProcess(Process process){
        if (!processesMap.containsKey(process.PID)){
            processesMap.put(process.PID, process);
        }
    }

    public void printRunningProcesses(){
        for (Process p: processesMap.values()){
            if (p.state.equals("Running")){
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaskManager{");
        sb.append("processesMap=").append(processesMap);
        sb.append('}');
        return sb.toString();
    }
}
