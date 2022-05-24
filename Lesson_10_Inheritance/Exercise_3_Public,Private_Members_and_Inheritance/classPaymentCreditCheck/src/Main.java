/*
    Exercise 3: 
        The Payment class has members:
            • Amount (real-number)
            • Public method: print () - prints the payment details
        The Payment class is inherited from Credit which has members:
            • number (card number - string)
            • expDate (card expiration date - string)
            • Resets the print ()
        The Payment class is inherited from Check which has members:
            • number (integer check_book - integer)
            • bankCode (string)
            • Resets the print ()
        In the main program:
            • Set 3 payment items.
            • Print their details.

        Caution! In the classes you can define constructors and only them
        necessary getters to make the prints correct.
*/
class Main {

    public static void main(String[] args) {
        Payment cashPayment = new Payment(250.0);
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\t\tCASH PAYMENT");
        System.out.println("----------------------------------------------------------");
        cashPayment.print();
        System.out.println("----------------------------------------------------------");

        Credit creditCard = new Credit(130.0, "3245-6654-9874-098", "07/26");
        System.out.println("\t\t\tCREDIT CARD PAYMENT");
        System.out.println("----------------------------------------------------------");
        creditCard.print();
        System.out.println("----------------------------------------------------------");

        Check checkPayment = new Check(1500.0, 10, "0089-7890-234-43");
        System.out.println("\t\t\tCHECK PAYMENT");
        System.out.println("----------------------------------------------------------");
        checkPayment.print();
        System.out.println("----------------------------------------------------------");
    }
}
