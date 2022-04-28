import java.util.Arrays;
import java.util.Locale;

public class ArrayPractise {

    static String[] separate(String text) {
        return text.split("[ ,.]+");
    }

    public static void main(String[] args) {
        String roman = "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say that they were perfectly\n" +
                "normal, thank you very much. They were the last people you’d expect to be involved in anything\n" +
                "strange or mysterious, because they just didn’t hold with such nonsense.\n" +
                " Mr. Dursley was the director of a firm called Grunnings, which made drills. He was a big, beefy\n" +
                "man with hardly any neck, although he did have a very large mustache. Mrs. Dursley was thin\n" +
                "and blonde and had nearly twice the usual amount of neck, which came in very useful as she\n" +
                "spent so much of her time craning over garden fences, spying on the neighbors. The Dursleys\n" +
                "had a small son called Dudley and in their opinion there was no finer boy anywhere.\n" +
                " The Dursleys had everything they wanted, but they also had a secret, and their greatest fear was\n" +
                "that somebody would discover it. They didn’t think they could bear it if anyone found out about\n" +
                "the Potters. Mrs. Potter was Mrs. Dursley’s sister, but they hadn’t met for several years; in fact,\n" +
                "Mrs. Dursley pretended she didn’t have a sister, because her sister and her good-for-nothing\n" +
                "husband were as unDursleyish as it was possible to be. The Dursleys shuddered to think what the\n" +
                "neighbors would say if the Potters arrived in the street. The Dursleys knew that the Potters had a\n" +
                "small son, too, but they had never even seen him. This boy was another good reason for keeping\n" +
                "the Potters away; they didn’t want Dudley mixing with a child like that.\n" +
                " When Mr. and Mrs. Dursley woke up on the dull, gray Tuesday our story starts, there was\n" +
                "nothing about the cloudy sky outside to suggest that strange and mysterious things would soon be\n" +
                "happening all over the country. Mr. Dursley hummed as he picked out his most boring tie for\n" +
                "work, and Mrs. Dursley gossiped away happily as she wrestled a screaming Dudley into his high\n" +
                "chair.\n" +
                " None of them noticed a large, tawny owl flutter past the window.\n" +
                " At half past eight, Mr. Dursley picked up his briefcase, pecked Mrs. Dursley on the cheek, and\n" +
                "tried to kiss Dudley good-bye but missed, because Dudley was now having a tantrum and\n" +
                "throwing his cereal at the walls. ";
        String[] words = roman.split("[ ,.]+");
        for (String word : words) {
            System.out.println(word);
        }

        String names[] = {"Gabi", "Anna", "Robert", "Krista"};
        Arrays.sort(names);

        System.out.println("\n\nNames: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
