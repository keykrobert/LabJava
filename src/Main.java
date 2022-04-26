import java.util.HashSet;


public class Main {
    static String searchingWord = "Harry";
    static String distinctWords = "Harry Potter";

    public static String longestWord(String text) {
        String[] words = text.split("[ ,]+");
        String resString = "";
        for (String word : words) {
            if (word.length() > resString.length())
                resString = word;
        }
        return resString;
    }

    public static int countLinesWithHarry(String text) {
        String[] words = text.split("[ ,]+");
        int counter = 0;
        for (String word : words) {
            if (word.equals(searchingWord)) {
                counter++;
            }
        }
        return counter;
    }

    public static int searchingDistinctWords(String text) {
        String[] words = text.split("[ ,]+");
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

    public static int countWordsBeginFromLetterC(String text) {
        String[] words = text.split("[ ,]+");
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

    static public void main(String args[]) {
        String someString = "Harry Potter, talk me something, Harry Potter, Cool, create, cooper"; //  Не зрозумів що самe за текст потрібно, тому такий
        String longestWord = longestWord(someString);
        System.out.println("[Task 1] Find the longest word in the above text: " + longestWord);
        System.out.println("[Task 2] Count the LINES where the word \"Harry\" is met: " + countLinesWithHarry(someString));
        System.out.println("[Task 3] Take  the array of distinct words from Harry Potter : " + searchingDistinctWords(someString));
        System.out.println("[Task 4] How many distinct words begin from the letter \"C\" : " + countWordsBeginFromLetterC(someString));
        System.out.println("[Task 5,6] Count the intersections of hashes: " + intersectionsOfHashes());
    }
}