/***********************************************************************
     Exercise 3:
        • Write a code equivalent to the following,
          using the ternary operator and not the if..else

        if(x<0) sign = -1;
        else if(x==0) sign = 0;
        else sign = 1;

        System.out.println(sign)
***********************************************************************/
public class exercise_3_ternary_op2
{
    public static void main(String[] args)
    {
        int sign, x = 0;

        sign = x<0? -1: 1;
        sign = x==0? 0: sign;

        System.out.println(sign);
    }
}
