import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class FileManagment {

    static String path = "/Users/Zver/Downloads/logs.txt";
    //static String path = "/Users/Zver/Desktop/file.txt";

    public static List<String> readFile() throws IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<String> listOfStrings = new ArrayList<String>();

        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            listOfStrings.add(line);
        }
        br.close();
        fr.close();
        return listOfStrings;
    }

    public static void writeToFile() throws IOException {
        List<String> data = readFile();

        FileWriter writer = new FileWriter("/Users/Zver/Desktop/fileWriterLaboratory.txt");
        for (String line : data) {
            writer.write(line + System.getProperty("line.separator"));
        }
        writer.close();
    }

    public static long countLines() {

        long lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.readLine() != null) lines++;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public static long numberOfErrorSplit() throws IOException {
        long counter = 0;
        List<String> array = readFile();
        for (String element : array) {
          //  System.out.println("LINE: " + element);
            String[] words = element.split(" ");
            for (String word : words) {
                //System.out.println("Word: " + word);
                if (word.equals("ERROR")) {
                    counter++;
                }
            }
        }
        return counter;
    }

//    public static long numberOfErrorSplitSS() throws IOException {
//        long counter = 0;
//        List<String> array = readFile();
//        for (String line : array) {
//            //System.out.println("Line: " + line);
//            String[] words = line.split(" ");
//            for (int i = 0; i < words.length; i++) {
//                if (i == 3 && words[i].equals("ERROR")) {
//                    counter++;
//                }
//            }
//        }
//        return counter;
//    }

    public static int countOfErrorFilesLines() throws IOException {
        int count = (int) Files.lines(Paths.get(path))
                .filter(line -> line.contains("ERROR"))
                .count();
        return count;
    }

    public static long getExecutionTimeStringSpilt() throws IOException {
        LocalDateTime start = LocalDateTime.now();
        numberOfErrorSplit();
        long res = ChronoUnit.MILLIS.between(start, LocalDateTime.now());
        return res;
    }
    public static long getExecutionTimeFilesLines() throws IOException {
        LocalDateTime start = LocalDateTime.now();
        countOfErrorFilesLines();
        long res = ChronoUnit.MILLIS.between(start, LocalDateTime.now());
        return res;
    }


    public static void main(String[] args) throws IOException {
        readFile();
        writeToFile();
        System.out.println("Count Lines: " + countLines());
        System.out.println("Error count, String.split: " + numberOfErrorSplit() + "\n time: " + getExecutionTimeStringSpilt());
        System.out.println("Error count, Files.lines: " + countOfErrorFilesLines() + "\n time: " + getExecutionTimeFilesLines());
    }
}
