class Credit extends Payment {
    /* CREDIT ATTRIBUTES */
    private String cardID;
    private String expDate;

    /* CREDIT CONSTRUCTOR */
    Credit(double amount, String cardID, String expDate) {
        super(amount);
        this.cardID = cardID;
        this.expDate = expDate;
    }

    /* GETTERS FOR CARD ID AND EXP/DATE */
    public String getCardID() {
        return cardID;
    }
    public String getExpDate() {
        return expDate;
    }

    /* print(): PRINTS THE CREDIT PAYMENT DETAILS */
    @Override
    public void print() {
        System.out.println("AMOUNT: " + getAmount() + " CARD ID: " + cardID + " EXP/DATE: " + expDate);
    }
}
