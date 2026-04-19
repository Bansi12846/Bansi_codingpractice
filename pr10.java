class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }
    double calculateInterest() {
        return balance * interest_rate / 100;
    }
    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount("Bansi", 10000);
        BankAccount ac2 = new BankAccount("Amit", 20000);
        ac1.display();
        System.out.println();
        ac2.display();
        BankAccount.updateInterestRate(7.0);
        System.out.println("\nAfter updating interest rate:\n");
        ac1.display();
        System.out.println();
        ac2.display();
    }
}

// Output:
// Name: Bansi
// Balance: 10000.0
// Interest: 500.0
// Name: Div
// Balance: 20000.0
// Interest: 1000.0
// After updating interest rate:
// Name: Bansi
// Balance: 10000.0
// Interest: 700.0
// Name: Div
// Balance: 20000.0
// Interest: 1400.0
