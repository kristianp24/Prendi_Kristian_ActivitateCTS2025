package ro.cts.main;

import ro.cts.clase.Process;
import ro.cts.clase.TaskManager;

public class Main {
    public static void main(String[] args) {
        Process process1 = new Process("Running", "PID1", "Process 1", 20.5f);
        Process process2 = new Process("Finished", "PID2", "Process2", 30.5f);

        TaskManager manager = TaskManager.getInstance();
        TaskManager manager1 = TaskManager.getInstance();
        manager.addProcess(process1);
        manager.addProcess(process2);
        System.out.println(manager);
        manager.printRunningProcesses();

    }
}