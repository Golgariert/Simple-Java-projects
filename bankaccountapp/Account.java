package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts

    private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
        //System.out.println(getBaseRate());

        setRate();

    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2/*, sSN.length()*/);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    
    public void compound(){
        //accrude - nachislenije
        double accrudeInterest = balance * (rate/100);
        balance = balance + accrudeInterest;
        System.out.println("Accrued Interest: $" + accrudeInterest);
        printBalance();
    }

    // List common methods - TRANSACTIONS
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }
    
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }
    
    public void printBalance(){
        System.out.println("your balance is now: " + balance);
        
    }

    public void showInfo() {
        System.out.println("NAME: " + name
                + "\nACCOUNT NUMBER: " + accountNumber
                + "\nBALANCE: " + balance
                + "\nRATE: " + rate + "%"
        );
    }

}
