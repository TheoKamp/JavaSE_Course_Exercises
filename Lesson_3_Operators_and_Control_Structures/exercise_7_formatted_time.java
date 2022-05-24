/*******************************************************************************
     Exercise 7: Formatted time display
         • Define three integer variables with names: hour, minute,
           second
         • Assign values to variables
         • First check that the prices are valid (eg time to
           is from 0 to 23)
         • Print the time in a format, e.g.
                02:23:58
*********************************************************************************/
public class exercise_7_formatted_time
{
    public static void main(String[] args)
    {
        /* Variables Declaratiom */
        int hour, minutes, seconds;

        /* Initialize Variables */
        hour =2;
        minutes = 3;
        seconds = 8;

        /* Check hours minutes and seconds
           and prints the formated output
           for hour  minute seconds
         */
        if(!(hour >= 0 && hour <= 23))
            System.out.println("Invalid hour");
        else if(!(minutes >= 0 && minutes <= 59))
            System.out.println("Invalid minutes");
        else if(!(seconds >= 0 && seconds <= 59))
            System.out.println("Invalid seconds");
        else {
            if(hour < 10)
                System.out.print("0");
            System.out.print(hour + ":");
            if(minutes < 10)
                System.out.print("0");
            System.out.print(minutes + ":");
            if(seconds < 10)
                System.out.print("0");
            System.out.println(seconds);
        }
    }
}
