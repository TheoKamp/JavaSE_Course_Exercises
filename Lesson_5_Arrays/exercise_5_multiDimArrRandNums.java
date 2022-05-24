/****************************************************************************
     Exercise 5:
         Define an array of 10x4x9 positions and initialize it with
         random integers in the range [0...5000].
             • Print the contents of the table.
             • Check if item 1123 is in the table.
*****************************************************************************/
import java.util.Random;

class exercise_5_multiDimArrRandNums {
    public static void main(String[] args)
    {
        int H = 10, W = 4, D = 9, searchNum = 1123; // Array dimensions and the number to search
        int[][][] randNums = new int[H][W][D]; // Binding memory for the array
        boolean check = false; // Check if number found or not
        Random rand = new Random(); // Random object for random numbers

        /* Initialize the array with random numbers */
        for(var i = 0; i < H; i++)
            for(var j = 0; j < W; j++)
                for(var k = 0; k < D; k++)
                    randNums[i][j][k] = rand.nextInt(5000);

        /* Printing the elements of the array */
        for(var row: randNums)
        {
            for(var col: row)
            {
                for(var elem: col)
                    System.out.print(elem + " ");
                System.out.println("");
            }
            System.out.println("");
        }

        /* Searching the number in the array and printing the position that found */
        outer: for(var row: randNums)
            for(var col: row)
                for(var elem: col)
                    if(elem == searchNum)
                    {
                        System.out.println("The number " + elem + " found!");
                        check = true;
                        break outer;
                    }
        if(!check) // A message if not found
            System.out.println("The number isn't exists in the array!");
    }
}
