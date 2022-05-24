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
    public void setFullName(String fullname) {
        this.fullname = fullname;
    }
    public String getFullName() {
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

    /* TO PRINT FORMATTED THE BANK ACCOUNT DETAILS */
    @Override
    public String toString() {
        String str = "";
        str += "\t\tBANK ACCOUNT\n";
        str += "FULL NAME      : " + fullname + "\n";
        str += "ACCOUNT ID     : " + accountID + "\n";
        str += "ACCOUNT BALANCE: " + accountBalance + "\n";
        str += "YEARS ACTIVE   : " + yearsActive + "\n";
        return str;
    }
}
