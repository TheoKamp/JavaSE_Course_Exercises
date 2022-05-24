/************************************************************************
     Exercise 4:
         • Define two integer variables a and b and give them one
           value (eg 3 and 4)
        • Calculate their sum in a variable sum.
        • Then use println properly to
          print: Exercise 5: Print a date
          Define the variables:
        • weekDay: Displays the day of the week (e.g.
          Monday, Tuesday,…)
        • day: Displays the calendar day of the month (eg 17,
          24,…)
        • month: Displays the full name of the month (e.g.
          February, March,…)
        • year: Displays the year (eg 1999, 2009, 2022,…)
          Then print the date on the format
          is represented in the 4 variables as follows:
                Monday, 18 February 2021

        (You are only allowed to use println once)
 *************************************************************************/
public class exercise_5_date_printing {
    public static void main(String[] args) {
        String weekDay = "Monday";
        int day = 18;
        String month = "February";
        int year = 2021;
        System.out.println(weekDay + ", " + day + " " + month + " " + year);
    }
}
