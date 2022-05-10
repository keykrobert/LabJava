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
        String fact = "Fact 1: My name is Robert";
        System.out.println(fact);
        fact = "Fact 2: I am a student";
        System.out.println(fact);
        fact = "Fact 3: I love guns";
        System.out.println(fact);
        fact = "Fact 4: I work as a web-developer";
        System.out.println(fact);
        fact = "Fact 5: I used to do music";
        System.out.println(fact);
        fact = "Fact 6: I love cars";
        System.out.println(fact);
        fact = "Fact 5: I love original clothes";
        System.out.println(fact);
        fact = "Fact 6: I have brown eyes";
        System.out.println(fact);
        fact = "Fact 7: My goal is to become a DevOps";
        System.out.println(fact);
        fact = "Fact 8: I love skiing";
        System.out.println(fact);
    }
    static public double sinus(){
        int steps = 10;

        double width = Math.PI / steps;
        double line = 0.8;
        double area = 0.0;
        for(int i = 0; i < steps - 1; i++){
            double height = Math.sin(i * width);
            if(height > line){
                height = line;
            }
            double deltaS = width * height;
            area += deltaS;
        }
        return area;
    }

    static public void main(String args[]) throws IOException {

        printAboutMe();
        System.out.println("Palindrome: " + checkPalindrome("bob"));
        System.out.println(sinus());

    }
}
