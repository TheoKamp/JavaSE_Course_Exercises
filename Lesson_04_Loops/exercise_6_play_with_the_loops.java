/****************************************************************************
     Exercise 6:
         Implement Example 3, using the while and
         then the loop do..while.
             int k, sq;
             for(k = 10; k >= 0; k--)
             {
             sq = k*k;
             System.out.println(sq);
             }
******************************************************************************/
public class exercise_6_play_with_the_loops
{
    public static void main(String[] args)
    {
        int k, sq;

        /* Using a while loop */
        k = 11;
        while(k-- > 0)
        {
            sq = k*k;
            System.out.println(sq);
        }

        /* Using a do...while loop */
        k = 10;
        do{
            sq = k*k;
            System.out.println(sq);
        }while(k-- > 0);
    }
}
