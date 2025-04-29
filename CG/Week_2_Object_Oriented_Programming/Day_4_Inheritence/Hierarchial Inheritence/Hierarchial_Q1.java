class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(){}
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(double interestRate,int accountNumber,double balance){
        this.interestRate=interestRate;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void displayAccountType(){
        System.out.println("Savings Account ");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
        System.out.println("Interest Rate : "+interestRate);
        System.out.println();
    }
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    CheckingAccount(double withdrawalLimit,int accountNumber,double balance){
        this.withdrawalLimit=withdrawalLimit;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void displayAccountType(){
        System.out.println("Checking Account ");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
        System.out.println("Withdrawal Limit : "+withdrawalLimit);
        System.out.println();
    }
}
class FixedDepositAccount extends BankAccount{
    double returns;
    FixedDepositAccount(double returns,int accountNumber,double balance){
        this.returns=returns;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void displayAccountType(){
        System.out.println("Fixed Deposit Account ");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
        System.out.println("Returns rate : "+returns);
        System.out.println();
    }
}
class Main{
    public static void main(String[] args){
        SavingsAccount s = new SavingsAccount(7.5,123,123456);
        CheckingAccount c= new CheckingAccount(100000,123,123456);
        FixedDepositAccount f = new FixedDepositAccount(45000,123,123456);
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}