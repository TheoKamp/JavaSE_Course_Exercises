import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        q.add("Bob");
        System.out.println("Bob entered the bank");
        q.add("Tom");
        System.out.println("Tom entered the bank");

        System.out.println(q.remove() + " served!");

        q.add("Pam");
        System.out.println("Pam entered the bank");
        while (true) {
            try {
                System.out.println(q.remove() + " served!");
            }catch (NoSuchElementException e) {
                break;
            }
        }
    }
} 