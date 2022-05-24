/*******************************************************************************************
     Exercise 7:
         Build a program that:
             • Will print all even numbers from 10 to 20
             • Will print all odd numbers from 19 to 11 (descending order)
             • Will print those odd numbers from 1 to 29 which is also a multiple of 3.
********************************************************************************************/
public class exercise_7_playing_with_the_loops_2
{
    public static void main(String[] args)
    {
        int num;

        /* Print evens from 10 to 20 *
        * with a for loop            */
        System.out.println("*EVENS FROM 10 TO 20*");
        for(num = 10; num <= 20; num++)
            if(num%2 == 0)
                System.out.print(num + " ");

        /* Print odds number from 19 to 11 *
         * using a while loop              */
        num = 19;
        System.out.println("\n\n*ODDS FROM 19 TO 11*");
        while(num >= 11)
        {
            if(num%2 == 1)
                System.out.print(num + " ");
            num--;
        }

        /* Print this odds numbers from 1 to 29 *
         * that is also multiple of 3 using a   *
         * do..while loop                       */
        num = 1;
        System.out.println("\n\n*ODDS FROM 1 TO 29 ALSO MULTIPLE OF 3*");
        do{
            if(num%2 == 1 && num%3 == 0)
                System.out.print(num + " ");
            num++;
        }while(num <= 29);

    }
}
