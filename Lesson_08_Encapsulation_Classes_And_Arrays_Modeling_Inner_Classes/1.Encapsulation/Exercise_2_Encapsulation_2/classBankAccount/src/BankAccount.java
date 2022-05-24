public class BankAccount {

    private String fullname;
    private String accountID;
    private double accountBalance;
    private int yearsActive;

    public BankAccount(String fullname, String accountID, double accountBalance, int yearsActive) {
        this.fullname = fullname;
        this.accountID = accountID;
        this.accountBalance = accountBalance;
        this.yearsActive = yearsActive;
    }

    /* SETTER AND GETTER FOR FULLNAME */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getFullname() {
        return fullname;
    }

    /* SETTER AND GETTER FOR ACCOUNT BALANCE */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    /* GETTER FOR ACCOUNT ID */
    public String getAccountID() {
        return accountID;
    }

    /* SETTER AND GETTER FOR ACCOUNT ACTIVE YEARS */
    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }
    public int getYearsActive() {
        return yearsActive;
    }

    /* PRINT FORMATTED THE BANK ACCOUNT */
    public void print() {
        System.out.println("FULL NAME      : " + fullname);
        System.out.println("ACCOUNT ID     : " + accountID);
        System.out.println("ACCOUNT BALANCE: " + accountBalance);
        System.out.println("YEARS ACTIVE   : " + yearsActive);
    }
}
