/*********************************************
    Exercise 3:
         Print the first 10,000 Unicode
         characters (200 in each line)
**********************************************/
public class exercise_3_while_loop_3
{
    public static void main(String[] args)
    {
        char c = 0;

        while(c <= 10000)
        {
            System.out.print(c);

            if(c%200 == 0) // change line
                System.out.println("");
            c++;
        }
    }
}
