/**************************************************
     Exercise 1:
         Print all the odds numbers from 1 to 55
***************************************************/
public class exercise_1_while_loop_1
{
    public static void main(String[] args)
    {
        int var = 1;

        while(var <= 55)
        {
            if(var%2 == 1)
                System.out.println(var);
            var++;
        }
    }
}
