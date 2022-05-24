/** Exercise 1:
        Modify Example 3 to use as separators the characters: \ n, \ t (tab) and . (dot) */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\n\t.]");// SEPARATORS
        String s = "";
        while (!s.equals("q")){
            System.out.println("> ");
            s = sc.next();
            System.out.println("Token: " + s);

        }

        sc.close();
    }
}
