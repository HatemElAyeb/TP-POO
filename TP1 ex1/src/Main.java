public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123, "Hatem El Ayeb", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(800);
        account.withdraw(1000);
    }
}