package ro.cts.main;

import ro.cts.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("Warning", "21/03/2025", "Variable never used");
        Logger logger1 = Logger.getInstance("Error", "21/03/2025", "Runtime Error, Division with 0");

        logger.logInFile();
        logger1.logInFile();
    }
}