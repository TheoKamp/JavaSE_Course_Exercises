class Check extends Payment {
    /* CHECK CLASS ATTRIBUTES */
    private int checkBook; // Check Number
    private String bankCode;

    /* CHECK CLASS CONSTRUCTOR */
    Check(double amount, int checkBook, String bankCode) {
        super(amount);
        this.checkBook = checkBook;
        this.bankCode = bankCode;
    }

    /* print(): PRINTS THE CHECK PAYMENT DETAILS */
    @Override
    public void print() {
        System.out.println("AMOUNT: " + getAmount() + " CHECK NO: " + checkBook + " BANK CODE: " + bankCode);
    }
}
