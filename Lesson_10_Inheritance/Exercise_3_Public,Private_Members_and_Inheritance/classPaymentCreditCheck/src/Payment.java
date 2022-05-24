class Payment {
    /* PAYMENT CLASS ATTRIBUTES */
    private double amount; // Payment amount

    /* PAYMENT CLASS CONSTRUCTOR */
    Payment(double amount) {
        this.amount = amount;
    }

    /* GETTER FOR PAYMENT AMOUNT */
    public double getAmount() {
        return amount;
    }

    /* print(): PRINTS THE PAYMENT DETAILS */
    public void print() {
        System.out.println("AMOUNT: " + amount);
    }
}
