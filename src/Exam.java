import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;


public class Exam {

    public static String path =  "/Users/Zver/Downloads/harry.txt";
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)));
        String content2 = content;
        content = content.toLowerCase(Locale.ROOT).replaceAll("[^A-Za-z ]", "");

        Map<String, Integer> map = new HashMap<>();
        for (String s : content.split(" ")) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        map.remove("");
        System.out.println("Original: " + map);

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(20)
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        System.out.println("Sorted DESC: " + sortedMap);

        content2 = content2.replaceAll("[^A-Za-z ]", "");
        String[] words = content2.split(" +");

        String uniqueAsString = "";

        for (int i = 0; i < words.length; i++) {
            if (!uniqueAsString.contains(words[i])) {
                uniqueAsString += words[i] + " ";
            }
        }

        String[] uniqueAsArray = uniqueAsString.split(" ");
        Arrays.setAll(uniqueAsArray, i -> uniqueAsArray[i].replaceFirst("(?=^\\p{Upper})", "\n"));

        System.out.println("PROPERR: ");
        int countElementsUniqueAsArray = 0;
        for (String string : uniqueAsArray) {
            countElementsUniqueAsArray++;
        }

        System.out.println("\nCount: " + countElementsUniqueAsArray);

        FileWriter writer = new FileWriter("test.txt", false);

        writer.write("[TASK-1] Robert Keyk");
        for (String str : uniqueAsArray) {
            writer.write(str);
        }
        writer.write("\n///////////////////////////////////////////////////////////////////////\n");
        writer.write(String.valueOf(sortedMap));

        writer.close();
    }
}

class RightShift {
    public static int[] rightShift(int[] array, int step) {
        // your code is here and nowhere more
        for (int i = 0; i < step; i++) {

            int j, last;

            last = array[array.length - 1];
            for (j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}

class Duplicates {
    public static boolean hasDuplicates(int[] array) {
        Arrays.sort(array);
        //  your code is here
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (j != i && array[j] == array[i])
                    return true;
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 6, 2, 9, 33, 21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}

class Prefix {

    public static String prefix(String[] array) {
        // your code is here
        int currentCounter = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                break;
            }
            String[] words = array[i].split("");
            String[] words2 = array[i + 1].split("");
            int currentLong = Math.min(words.length, words2.length);
            int counter = 0;
            for (int j = 0; j < currentLong; j++) {
                if (words[j].equals(words2[j])) {

                    counter++;
                }
            }
            currentCounter = currentCounter > 0 ? Math.min(currentCounter, counter) : counter;
        }
        String prefix = "";

        String[] letters = array[0].split("");
        for (int i = 0; i < currentCounter; i++) {
            prefix += letters[i];
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"};

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"};

        System.out.println(prefix(array2)); // abc

    }
}
