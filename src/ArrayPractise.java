import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class ArrayPractise {
    static String searchingWord = "harry";
    static String distinctWords = "harry potter";
    public static String longestWord(String[] words) {
        String resString = "";
        for (String word : words) {
            if (word.length() > resString.length())
                resString = word;
        }
        return resString;
    }

    public static int countLinesWithHarry(String[] words) {
        int counter = 0;
        for (String word : words) {
            if (word.equals(searchingWord)) {
                counter++;
            }
        }
        return counter;
    }

    public static int searchingDistinctWords(String[] words) {
        String[] distinct = distinctWords.split(" ");

        int counter = 0;
        for (int i = 0; i <= words.length; i++) {
            if (i < words.length) {
                if (words[i].equals(distinct[0]) && words[i + 1].equals(distinct[1])) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int countWordsBeginFromLetterC(String[] words) {
        int counter = 0;
        for (String word : words) {
            char[] wordToArray = word.toLowerCase().toCharArray();
            if (wordToArray[0] == 'c') {
                counter++;
            }
        }
        return counter;
    }

    public static int intersectionsOfHashes() {
        HashSet<String> hashOne = new HashSet<String>();
        HashSet<String> hashTwo = new HashSet<String>();
        hashOne.add("Task1");
        hashOne.add("Task2");
        hashOne.add("Task3");
        hashOne.add("Task4");

        hashTwo.add("Task2");
        hashTwo.add("Task4");
        hashTwo.add("Task3");
        hashTwo.add("Task5");
        hashTwo.add("Task6");

        HashSet<String> intersection = new HashSet<String>(hashOne);
        intersection.retainAll(hashTwo);
        System.out.println(intersection);
        return intersection.size();
    }

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get("/Users/Zver/Desktop/harry.txt")));
        content = content.toLowerCase(Locale.ROOT).replaceAll("[^A-Za-z ]", "");
        String[] words = content.split(" +");

        String uniqueAsString = "";

        for(int i = 0; i < words.length ; i++){
            if(!uniqueAsString.contains(words[i])){
                uniqueAsString += words[i] + " ";
            }
        }
        String[] uniqueAsArray = uniqueAsString.split(" ");

        Arrays.sort(uniqueAsArray);

        for(int i = 0; i < 10 ; i++){
            System.out.println(uniqueAsArray[i]);
        }

        System.out.println("Longest word: " + longestWord(words));
        System.out.println("Counts Harry: " + countLinesWithHarry(words));
        System.out.println("Counts Harry Potter: " + searchingDistinctWords(words));
        System.out.println("Counts words begin C: " + countWordsBeginFromLetterC(words));
        System.out.println("Task 5-6: " + intersectionsOfHashes());




    }
}
