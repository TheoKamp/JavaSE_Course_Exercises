/**************************************************************************************
     Exercise 5: Playing with the switch
         Using only the switch (and not if… else)
             • Define an integer variable
             • If its value is from 0… 5, print the message “less or
               equal than 5 ”
             • If its value is from 6..10, print the message
               "Greater than 5, less or equal than 10"
             • In any other case to output the message "invalid value"
***************************************************************************************/
public class exercise_5_playing_with_the_switch
{
    public static void main(String[] args)
    {
        int var = 9;

        switch(var)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("less or equal than 5");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("greater than 5, less or equal than 10");
                break;
            default:
                System.out.println("invalid value");
        }
    }
}
