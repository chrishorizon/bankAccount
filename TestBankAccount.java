public class TestBankAccount{
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        // display number of created accounts
        System.out.println(BankAccount.getCreatedAccounts());

        acc1.deposit("savings", 100);
        acc1.deposit("checkings", 50);
        System.out.println(acc1.getCheckingBalance());
        System.out.println(acc1.getSavingsBalance());
        acc1.totalBalance();
        acc2.deposit("checkings", 120);
        acc2.withdrawl("checkings", 80);
        acc2.totalBalance();

    }
}