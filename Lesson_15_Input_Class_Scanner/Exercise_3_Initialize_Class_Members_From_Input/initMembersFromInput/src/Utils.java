import java.util.Scanner;

public class Utils {

    static double readDouble(Scanner source) {
        while (true) {
            if (source.hasNextDouble())
                return source.nextDouble();
            else {
                System.out.println("Only numbers please!");
                source.nextLine();
            }
        }
    }

    static int readInt(Scanner source) {
        while (true){
            if (source.hasNextInt())
                return source.nextInt();
            else {
                System.out.println("Only numbers please");
                source.nextLine();
            }
        }
    }
}
