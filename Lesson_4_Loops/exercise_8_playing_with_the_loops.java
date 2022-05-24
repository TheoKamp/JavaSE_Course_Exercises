/*******************************************************************
     Exercise 8:
         Build a program that calculates the sum
         of odd numbers from 1 to 99.
********************************************************************/
public class exercise_8_playing_with_the_loops
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 1; i <= 99; i++)
            if(i%2 == 1)
                sum += i;
        System.out.println(sum);
    }
}
