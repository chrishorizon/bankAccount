public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int createdAccounts;
    private static double totalAmount;

    // Constructor
    public BankAccount(){
        checkingBalance = 0;
        savingsBalance = 0;
        createdAccounts++;
    }

    // Getter method for checknig account
    // has to be printed with system.out.println
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    // getter method for savings
    // has to be printed with system.out.println
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    // static to be referenced in static context
    // has to be printed with system.out.println
    public static int getCreatedAccounts(){
        return createdAccounts;
    }

    // deposit into bank account
    public void deposit(String account, double amount){
        if(account.equals("checkings")){
            checkingBalance += amount;
        } else if (account.equals("savings")){
            savingsBalance += amount;
        } totalAmount += amount;
    }

    // withdrawl method, do not allow with insufficient funds
    public void withdrawl(String account, double amount){
        if(account.equals("checkings")){
            if(checkingBalance >= amount){
                checkingBalance -= amount;
                totalAmount -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }
        else if (account.equals("savings")){
            if(savingsBalance >= amount){
                savingsBalance -= amount;
                totalAmount -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }

    public void totalBalance(){
        System.out.printf("Total Checkings: $%.2f \nTotal Savings: $%.2f \n", getCheckingBalance(), getSavingsBalance());
    }

}