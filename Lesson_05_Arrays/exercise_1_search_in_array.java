/***************************************************************************
     Exercise 1:
         Define an array of 10 positions and initialize it with
         integers of your choice. Then check if there is
         number 12 in them.
             • If available, output the appropriate message and print the
               place where it first appears.
             • If it does not exist, send an appropriate message.
*****************************************************************************/
class exercise_1_search_in_array {
    public static void main(String[] args)
    {
        int[] numbers = {14, 43, 23, 53, 12, 3, 5, 11, 10, 69};
        int searchNum = 12;
        boolean check = false;

        for(int i = 0; i < 10; i++)
        {
            if(numbers[i] == searchNum){
                System.out.println("Number " + searchNum + " it is found in position " + i);
                check = true;
                break;
            }
        }

        if(!check)
            System.out.println("Number isn't exists in the array!");

    }
}
