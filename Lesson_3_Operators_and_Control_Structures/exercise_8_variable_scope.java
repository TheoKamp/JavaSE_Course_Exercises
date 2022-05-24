/************************************************************************
     Exercise 8: Range of Variables
         Find out if we are allowed to state to
         nested block, a variable of the same name as a variable
         declared on the outer block.
*************************************************************************/
public class exercise_8_variable_scope
{
    public static void main(String[] args)
    {
        int x = 0;

        if(x > 10)
        {
            int y = 1;
            // int x = 2; // not work
        }

    }
}
