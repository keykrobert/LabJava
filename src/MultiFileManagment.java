import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiFileManagment {
    private ArrayList<String> date;
    public String path = "/Users/Zver/Downloads/logs.txt";
    // public String path = "/Users/Zver/Desktop/file.txt";

    public MultiFileManagment() {
    }

    public MultiFileManagment(ArrayList<String> date) {
        this.date = date;
    }

    public ArrayList<String> getDate() {
        return date;
    }

    public void setDate(ArrayList<String> date) {
        this.date = date;
    }

    public int getLogsByDateCountS(String str) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(str + " - " + start + " started ");

        int count = (int) Files.lines(Paths.get(path))
                .filter(line -> line.contains(str))
                .filter(linet -> linet.contains("ERROR"))
                .count();

        System.out.println(str + " - " + LocalDateTime.now().toString() + " - " + "finished "
                + ChronoUnit.MILLIS.between(start, LocalDateTime.now()));
        return count;
    }

    public void getLogsByDateCount(String str) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(str + " - " + start + " started ");

        List<String> content = new ArrayList<>();
        FileWriter writer = new FileWriter("ERROR" + " " + str + ".log", false);
        content = Files.lines(Paths.get(path))
                .filter(line -> line.contains(str))
                .filter(line -> line.contains("ERROR"))
                .collect(Collectors.toList());

        for (String line : content) {
            writer.write(line);
        }
        writer.close();
        System.out.println(str + " - " + LocalDateTime.now().toString() + " - " + "finished "
                + ChronoUnit.MILLIS.between(start, LocalDateTime.now()));

    }

}

class MainFileManagement {

    static class MyThread extends Thread {
        private String date;

        public MyThread(String date) {
            this.date = date;
        }

        @Override
        public void run() {
            MultiFileManagment managment = new MultiFileManagment();
            try {
                managment.getLogsByDateCount(date);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) throws IOException {

        MultiFileManagment managment = new MultiFileManagment();
        ArrayList<String> dates = new ArrayList<>();
        dates.add("2019-10-13");
        dates.add("2019-10-14");
        dates.add("2019-10-15");
        dates.add("2019-10-16");
        dates.add("2019-10-17");
        managment.setDate(dates);
        LocalDateTime start = LocalDateTime.now();

        System.out.println("-------------------------------------");
        for (String date : managment.getDate()) {
            managment.getLogsByDateCount(date);
        }
        System.out.println("-------------------------------------");

        System.out.println("Finish Standard: " + ChronoUnit.MILLIS.between(start, LocalDateTime.now()));

        System.out.println("-------------------------------------");
        System.out.println("Start multi");
        start = LocalDateTime.now();

        List<Thread>list = new ArrayList<>();

        for(String date: managment.getDate()){
         //   new MyThread(date).start();
            Thread thread = new Thread(new MyThread(date));
            thread.start();
            list.add(thread);
        }
        for (Thread thread : list) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Finish: " + ChronoUnit.MILLIS.between(start, LocalDateTime.now()));
        System.out.println("-------------------------------------");
    }
}
