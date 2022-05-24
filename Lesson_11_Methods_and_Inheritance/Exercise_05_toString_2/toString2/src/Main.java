/*
   Exercise 5:
        Modify exercise 2 of lesson 8, using
        the toString () instead of the print () we used
*/
class Main {

    public static void main(String[] args) {
        /* DEFINE FIVE BANK ACCOUNTS IN AN ARRAY OF ACCOUNTS */
        BankAccount[] accounts = {
            new BankAccount("John Doe", "4343-5454-6765-098", 1500.0, 5),
            new BankAccount("Tim Yellow", "1253-5676-8763-028", 3543.43, 7),
            new BankAccount("Danny Wu", "4687-5344-6345-238", 5897.21, 3),
            new BankAccount("Katie Lost", "3323-5223-6755-094", 10000.0, 6),
            new BankAccount("Alice Ground", "7543-1235-6346-124", 23453.23, 10)
        };

        /* FIND AND PRINT IN THE END THE ACCOUNT
           WITH MAXIMUM ACCOUNT BALANCE */
        for(var account: accounts) {
            System.out.println(account);
        }
    }
}
