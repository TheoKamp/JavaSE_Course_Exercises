/*************************************************************************
     Exercise 1:
         Two players roll a dice. Build one
         program which prints "Victory of A", "Victory of B" or
         "Draw" depending on the prices of their dice
**************************************************************************/
public class exercise_1_if_elseif_else
{
    public static void main(String[] args)
    {
        int playerA, playerB;

        playerA = 4;
        playerB = 3;

        if(playerA > playerB)
            System.out.println("Player A Win!!!");
        else if(playerA == playerB)
            System.out.println("Draw!!!");
        else
            System.out.println("Player B Win!!!");
    }
}
