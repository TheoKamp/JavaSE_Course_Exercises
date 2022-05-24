/***********************************************************************
     Exercise 4: Break on the switch
         • Remove all breaks from the switchValue.java class
         • Run the program sequentially for values 1,2,3,4.

         What do you notice?
************************************************************************/

public class exercise_4_break_in_switch
{
    public static void main(String[] args)
    {
        int x = 4;
        String s;

        /* Run the cases serial
        * and finaly takes the value
        * of default
        */
        switch (x) {
            case 1:
                s = "one";
            case 2:
                s = "two";
            case 3:
                s = "three";
            default:
                s = "invalid value";
        }

        System.out.println("Value in text: " + s);
    }
}
