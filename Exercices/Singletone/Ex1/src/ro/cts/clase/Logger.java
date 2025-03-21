package ro.cts.clase;

import java.io.*;

public class Logger {
    private String date;
    private String type;
    private String message;

    private static Logger instance = null;

    private Logger() {
    }

    private Logger(String date, String type, String message) {
        this.date = date;
        this.type = type;
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Thread safe intialization
    public static synchronized Logger getInstance(String type, String date, String message){
        if (instance == null){
            instance = new Logger(date, type, message);
            return instance;
        }
        else{
            instance.setDate(date);
            instance.setMessage(message);
            instance.setType(type);
            return instance;
        }
    }

    public void logInFile(){
        String fileName = "Exercices/Singletone/Ex1/logger.txt";
        StringBuilder content = new StringBuilder();
        content.append("Error type: ").append(instance.type).append(" ,date:").append(instance.date)
                .append("Message: ").append(instance.message);
        System.out.println(content.toString());
        try (FileOutputStream stream = new FileOutputStream(fileName, true);
            OutputStreamWriter streamWriter = new OutputStreamWriter(stream);
            BufferedWriter bufferedWriter = new BufferedWriter(streamWriter)) {

            bufferedWriter.write(content.toString());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
