/****************************************************************************
     Exercise 4:
         State a table of 10 places and initialize it with
         random integers. Afterward:
             • Print the contents of the table
             • Calculate and print the average of its data table.
******************************************************************************/
import java.util.Random;

class exercise_4_array_with_random_numbers {
    public static void main(String[] args)
    {
        final int N = 10; // Dimension of the array
        int[] randNums; // Random Numbers Array
        int sum; // Stores the summary of the array
        Random r = new Random(); // Random object r

        randNums = new int[N]; // Binding Memory for the Array

        /* Initialize the array with random numbers */
        for(var i = 0; i < N; i++)
            randNums[i] = r.nextInt(50);

        /* Printing the elements of the array*/
        for(var x: randNums)
            System.out.print(x + " ");
        System.out.println("");

        /* Calculating and printing the average of the array */
        sum = 0;
        for(var x: randNums)
            sum += x;
        System.out.println("Average of the array is: " + (double)sum/N);
    }
}
