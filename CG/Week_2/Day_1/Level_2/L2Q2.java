import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    public void depositMoney() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the amount to be deposited: ");
        int amountDeposit = scn.nextInt();

        if (amountDeposit < 500) {
            System.out.println("Enter a valid amount. Minimum deposit is Rs.500");
        } else {
            balance += amountDeposit;
            System.out.println("Thank you! The amount has been added to your account.");
            displayBalance();
        }
    }

    // Withdraw Method
    public void withdrawMoney() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int amountWithdraw = scn.nextInt();

        if (amountWithdraw > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amountWithdraw;
            System.out.println("Please collect Rs." + amountWithdraw);
            displayBalance();
        }
    }

    // Display Balance
    public void displayBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = scn.nextLine();

        System.out.print("Enter your account number: ");
        int accNumber = scn.nextInt();

        System.out.print("Enter initial balance: ");
        int initialBalance = scn.nextInt();

        BankAccount myAccount = new BankAccount(name, accNumber, initialBalance);

        while (true) {
            System.out.println("\nChoose an option:\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    myAccount.depositMoney();
                    break;
                case 2:
                    myAccount.withdrawMoney();
                    break;
                case 3:
                    myAccount.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    scn.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
