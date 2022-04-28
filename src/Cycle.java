import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cycle {

    static boolean checkPalindrome(String text) {
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        String data = buffer.toString();
        if (text.equals(data)) {
            return true;
        } else {
            return false;
        }
    }

    static void printAboutMe() {
        String fact = "Fact 1: I am Robert";
        System.out.println(fact);
        fact = "Fact 2: I am Robert";
        System.out.println(fact);
        fact = "Fact 3: I am Robert";
        System.out.println(fact);
        fact = "Fact 4: I am Robert";
        System.out.println(fact);
        fact = "Fact 5: I am Robert";
        System.out.println(fact);
        fact = "Fact 6: I am Robert";
        System.out.println(fact);
        fact = "Fact 5: I am Robert";
        System.out.println(fact);
        fact = "Fact 6: I am Robert";
        System.out.println(fact);
        fact = "Fact 7: I am Robert";
        System.out.println(fact);
        fact = "Fact 8: I am Robert";
        System.out.println(fact);
    }

    static public void main(String args[]) throws IOException {

        printAboutMe();
        System.out.println("Palindrome: " + checkPalindrome("bob"));

    }
}
