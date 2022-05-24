/*******************************************************************************
     Exercise 5:
         Using the do..while loop print the squares of numbers from 0 to 100.
         In each line to its number and square are printed in the form:
                    5^2 = 25
********************************************************************************/
public class exercise_5_do_while
{
    public static void main(String[] args)
    {
        int num;
        num = 0;

        do{
            System.out.println(num + "^2 = " + num * num); // calculate and print the square
            num++;
        }while(num <= 100);
    }
}
