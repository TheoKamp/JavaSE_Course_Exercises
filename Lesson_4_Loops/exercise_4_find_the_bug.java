/*************************************************
     Exercise 4:
         Find the error in the section below
         code:
**************************************************/
public class exercise_4_find_the_bug
{
    public static void main(String[] args)
    {
        int i;

        i = 100;
        while (i >= 0) {
            System.out.println(i);
            i++; // HERE IS THE BUG
        }
    }
}
