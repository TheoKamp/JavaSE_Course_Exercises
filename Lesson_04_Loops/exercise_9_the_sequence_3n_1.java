/*********************************************************************************
     Exercise 9: The sequence 3n + 1
        A well-known mathematical problem is this: Starting from
        a natural number n> = 2:
             • If n is even, then we reduce n by half and we repeat.
             • If n is redundant, then we set n equal to 3n + 1 and we repeat.
             • We end when n becomes equal to 1

         Build a program that prints the sequence of naturals from n to 1.
         (Note: The mathematical problem is if for any natural
         number, the sequence is not infinite, that is, at some point
         becomes equal to 1 and ends]
************************************************************************************/
public class exercise_9_the_sequence_3n_1
{
    public static void main(String[] args)
    {
        int num = 3;

        System.out.print(num + " ");
        do{
            if(num%2 == 0) // N is even
                num /= 2; // N half by two
            else // N is odd
                num = 3 * num + 1; // 3n+1 math type
            System.out.print(num + " ");
        }while(num != 1);
    }
}
