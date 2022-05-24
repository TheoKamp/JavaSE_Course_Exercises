/*
    Exercise 2:
        The information of a bank account is:
            • The name of the holder (string)
            • Account number (string)
            • The rest (real)
            • The years the account is active (whole)
        Build the BankAccount class:
            • Have a manufacturer that initializes all the above data.
            • We want to be able to change then (from others classes)
              of name, balance and years who is active.
            • We also want to be able to read them all characteristics of the class
            • Finally we wish to be able to print it account (print method)
        In main:
            • Set up an account
            • Print the account details
            • Change the name
            • Print the account details
            • Change the years
            • Print the account details
*/
class Main {

    public static void main(String[] args) {
        /* DEFINE A NEW BANK ACCOUNT */
        BankAccount account = new BankAccount("John Doe", "3234-4567-0982-897",
                                            2500.0f, 5);

        /* PRINT THE ACCOUNT DETAILS */
        account.print();

        /* CHANGE THE FULL NAME */
        account.setFullname("Jack Bill");

        /* PRINT THE ACCOUNT DETAILS */
        System.out.println();
        account.print();

        /* CHANGE THE ACTIVE YEARS */
        account.setYearsActive(8);

        /* PRINT THE ACCOUNT DETAILS */
        System.out.println();
        account.print();
    }
}
