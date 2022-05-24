/*****************************************************************************
     Exercise 2:
         Enter a 4x3 table and initialize it with its values
         to your liking. Subsequently:
             • Print the sum of the elements of each line.
             • Print the sum of the items in each column.
******************************************************************************/
class exercise_2_sum_in_a_2d_array {
    public static void main(String[] args)
    {
        int[][] numbers = {{14, 43, 23}, {53, 2, 3}, {5, 11, 10}, {12, 22, 33}}; // 4x3 array
        int rowSum, colSum;

        /* Calculate and print the summary of each row */
        for(int i = 0; i < 4; i++)
        {
            rowSum = 0;
            for(int j = 0; j < 3; j++)
                rowSum += numbers[i][j];
            System.out.println("The row " + i + " summary is: " + rowSum);
        }
        /* Calculate and print the summary of each column */
        for(int i = 0; i < 3; i++)
        {
            colSum = 0;
            for(int j = 0; j < 4; j++)
                colSum += numbers[j][i];
            System.out.println("The column " + i + " summary is: " + colSum);
        }

    }
}
