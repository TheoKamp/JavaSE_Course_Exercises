/**********************************************************
     Exercise 6: if…else
         Repeat the previous exercise this time
         using the if ελέγχου else control structure.
***********************************************************/
public class exercise_6_if_else
{
    public static void main(String[] args)
    {

        int var = 4;

        if(var <= 5 && var >= 0)
            System.out.println("less or equal than 5");
        else if(var >= 6 && var <= 10)
            System.out.println("greater than 5, less or equal than 10");
        else
            System.out.println("invalid value");
    }
}
