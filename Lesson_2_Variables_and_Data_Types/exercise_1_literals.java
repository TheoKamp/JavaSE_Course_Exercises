/********************************************************************
    Exercise 1:
        Save to appropriate variables and then print them
        the following literals:
            • 3.14
            • 149L
            • false
            • 1Ε0
            • 899
            • 0xA0
            • ‘\u0041’
***********************************************************************/
public class exercise_1_literals {
    public static void main(String[] args) {
        double d = 3.14;
        long l = 149L;
        boolean b = false;
        double s = 1E0;
        int i = 899;
        int h = 0xA0;
        char c = '\u0041';

        System.out.println("Double: " + d);
        System.out.println("Long: " + l);
        System.out.println("Boolean: " + b);
        System.out.println("Scientific to Double: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Hexadecimal to Decimal: " + h);
        System.out.println("Character: " + c);
    }
}
