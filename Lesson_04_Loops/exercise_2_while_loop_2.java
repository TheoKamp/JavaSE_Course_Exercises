/***************************************************************
     Exercise 2:
         Repeat all the even numbers from 120 to 0 (decreasing
         series)
****************************************************************/
public class exercise_2_while_loop_2
{
    public static void main(String[] args)
    {
        int var = 120;

        while(var >= 0)
        {
            if(var%2 == 0)
                System.out.println(var);
            var--;
        }
    }
}
