import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;


public class JavaCollection {
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static LinkedList<Integer> list = new LinkedList<Integer>();
    static int count = 100000;
    static int newCount = 1000;

    static void addArrayList(int count) {

        for (int i = 1; i <= count; i++) {
            numbers.add(i);
        }
    }

    static void addLinkedList(int count) {

        for (int i = 1; i <= count; i++) {
            list.add(i);
        }
    }

    static void addMiddleArrayList(int count) {
        int arraySize = numbers.size();
        int position = arraySize / 2;
        for (int i = 1; i <= count; i++) {
            numbers.add(position, i);
            position++;
        }
    }

    static void addMiddleLinkedList(int count) {
        int arraySize = list.size();
        int position = arraySize / 2;
        for (int i = 1; i <= count; i++) {
            list.add(position, i);
            position++;
        }
    }

    static void addBeginArrayList(int count) {
        int position = 1;
        for (int i = 1; i <= count; i++) {
            numbers.add(position, i);
            position++;
        }
    }

    static void addBeginLinkedList(int count) {

        int position = 1;
        for (int i = 1; i <= count; i++) {
            list.add(position, i);
            position++;
        }
    }

    static void addEndArrayList(int count) {
        for (int i = 1; i <= count; i++) {
            numbers.add(i);
        }
    }

    static void addEndLinkedList(int count) {
        for (int i = 1; i <= count; i++) {
            list.add(i);
        }
    }

    static void updateBeginArrayList(int count) {
        int position = 1;
        for (int i = 1; i <= count; i++) {
            numbers.set(position, i);
            position++;
        }
    }

    static void updateBeginLinkedList(int count) {
        int position = 1;
        for (int i = 1; i <= count; i++) {
            list.set(position, i);
            position++;
        }
    }

    static void updateMiddleArrayList(int count) {
        int arraySize = numbers.size();
        int position = arraySize / 2;
        for (int i = 1; i <= count; i++) {
            numbers.set(position, i);
            position++;
        }
    }

    static void updateMiddleLinkedList(int count) {
        int arraySize = list.size();
        int position = arraySize / 2;
        for (int i = 1; i <= count; i++) {
            list.set(position, i);
            position++;
        }
    }

    static void updateEndArrayList(int count) {
        int position = numbers.size() - count;
        for (int i = 1; i <= count; i++) {
            numbers.set(position, i);
            position++;
        }
    }

    static void updateEndLinkedList(int count) {
        int position = list.size() - count;
        for (int i = 1; i <= count; i++) {
            list.set(position, i);
            position++;
        }
    }

    static void deleteBeginArrayList(int count) {
        int position = 0;
        for (int i = 1; i <= count; i++) {
            numbers.remove(position);
        }
    }

    static void deleteBeginLinkedList(int count) {
        int position = 0;
        for (int i = 1; i <= count; i++) {
            list.remove(position);
        }
    }

    static void deleteMiddleArrayList(int count) {
        int arraySize = numbers.size();
        int position = arraySize / 2;
        for (int i = 1; i <= count; i++) {
            numbers.remove(position);
            position++;
        }
    }

    static void deleteMiddleLinkedList(int count) {
        int arraySize = list.size();
        int position = arraySize / 2;
        for (int i = 1; i <= count; i++) {
            list.remove(position);
            position++;
        }
    }

    static void deleteEndArrayList(int count) {
        int position = numbers.size() - 1;
        for (int i = 1; i <= count; i++) {
            numbers.remove(position);
            position--;
        }
    }

    static void deleteEndLinkedList(int count) {
        int position = list.size() - 1;
        for (int i = 1; i <= count; i++) {
            list.remove(position);
            position--;
        }
    }


    static long timer(String name) {
        long start = System.nanoTime();
        switch (name) {
            case "createArray":
                addArrayList(count);
                break;
            case "createLinked":
                addLinkedList(count);
                break;
            case "addBeginArray":
                addBeginArrayList(newCount);
                break;
            case "addBeginLinked":
                addBeginLinkedList(newCount);
                break;
            case "addMiddleArray":
                addMiddleArrayList(newCount);
                break;
            case "addMiddleLinked":
                addMiddleLinkedList(newCount);
                break;
            case "addEndArray":
                addEndArrayList(newCount);
                break;
            case "addEndLinked":
                addEndLinkedList(newCount);
                break;
            case "updateBeginArrayList":
                updateBeginArrayList(newCount);
                break;
            case "updateBeginLinkedList":
                updateBeginLinkedList(newCount);
                break;
            case "updateMiddleArrayList":
                updateMiddleArrayList(newCount);
                break;
            case "updateMiddleLinkedList":
                updateMiddleLinkedList(newCount);
                break;
            case "updateEndArrayList":
                updateEndArrayList(newCount);
                break;
            case "updateEndLinkedList":
                updateEndLinkedList(newCount);
                break;
            case "deleteBeginArrayList":
                deleteBeginArrayList(getMinimalSize(numbers.size()));
                break;
            case "deleteBeginLinkedList":
                deleteBeginLinkedList(getMinimalSize(list.size()));
                break;
            case "deleteMiddleArrayList":
                deleteMiddleArrayList(getMinimalSize(numbers.size()));
                break;
            case "deleteMiddleLinkedList":
                deleteMiddleLinkedList(getMinimalSize(list.size()));
                break;
            case "deleteEndArrayList":
                deleteEndArrayList(getMinimalSize(numbers.size()));
                break;
            case "deleteEndLinkedList":
                deleteEndLinkedList(getMinimalSize(list.size()));
                break;
            default:
                System.out.println("Wrong name event");

        }
        long end = System.nanoTime();
        return end - start;
    }


    static void textParser(long arr, long linked, String event) {
        System.out.println("Time " + event);
        System.out.println("Time arrayList: " + arr + " Time linkedList: " + linked + " Result: " + Math.abs(arr - linked));
    }

    static int getMinimalSize(int value) {
        return value > 0 ? Math.min(value, newCount) : 0;
    }


    static void choiceHandler() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.println("Please, make a choice \n 1. 'create'; \n 2. 'addBegin; 3. 'addMiddle' 4. 'addEnd'; " +
                        "\n 5. 'updateBegin'; 6. 'updateMiddle'; 7. 'updateEnd'; \n" +
                        "8. 'deleteBegin'; 9. 'deleteMiddle'; 10. 'deleteEnd' \n 0. 'exit' ");
                String str = br.readLine();
                if (str.equals("0")) {
                    break;
                }
                switch (str) {
                    case "1":
                        textParser(timer("createArray"), timer("createLinked"), "create");
                        break;
                    case "2":
                        textParser(timer("addBeginArray"), timer("addBeginLinked"), "addBegin");
                        break;
                    case "3":
                        textParser(timer("addMiddleArray"), timer("addMiddleLinked"), "addMiddle");
                        break;
                    case "4":
                        textParser(timer("addEndArray"), timer("addEndLinked"), "addEnd");
                        break;
                    case "5":
                        textParser(timer("updateBeginArrayList"), timer("updateBeginLinkedList"), "updateBegin");
                        break;
                    case "6":
                        textParser(timer("updateMiddleArrayList"), timer("updateMiddleLinkedList"), "updateMiddle");
                        break;
                    case "7":
                        textParser(timer("updateEndArrayList"), timer("updateEndLinkedList"), "updateEnd");
                        break;
                    case "8":
                        textParser(timer("deleteBeginArrayList"), timer("deleteBeginLinkedList"), "deleteBegin");
                        break;
                    case "9":
                        textParser(timer("deleteMiddleArrayList"), timer("deleteMiddleLinkedList"), "deleteMiddle");
                        break;
                    case "10":
                        textParser(timer("deleteEndArrayList"), timer("deleteEndLinkedList"), "deleteEnd");
                        break;
                    default:
                        System.out.println("Bad choice");
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception throw: " + e);
        }
    }

    static public void main(String args[]) throws IOException {
        choiceHandler();
    }
}
