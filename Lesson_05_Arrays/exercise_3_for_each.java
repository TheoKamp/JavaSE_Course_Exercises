/************************************************************
     Exercise 3:
         Using "for each" print on a line
         contents of a one-dimensional string table (the
         which you will have properly initialized)
*************************************************************/

class exercise_3_for_each {
    public static void main(String[] args)
    {
        String[] charArr = {"My", "Name", "is", "Thodoris!"}; // String array

        for(String c: charArr) // Printing using for each loop
            System.out.print(c + " ");
    }
}
