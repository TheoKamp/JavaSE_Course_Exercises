/******************************************************************************
     Exercise 7: Constants
         Constants have the same use as variables and in
         we set a value once and then we can not set it
         change.
         In Java a constant is denoted by the keyword final set
         precedes her statement:
            • e.g. final declaration int DAYS_OF_YEAR = 365;

         Her name is usually in capital letters
         Experiment with constants by building a program
         in which:
            • A constant is defined
            • Its content is printed
 
         Try to write a command in which you change it
         value of the variable. Observe the output of the compiler.
 ******************************************************************************/
public class exercise_7_constants {
    public static void main(String[] args) {
        final int constant = 10;
        System.out.println(constant);

        //constant = 15;
        System.out.println(constant);
    }
}
