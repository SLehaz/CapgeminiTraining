interface Loanable{
    String applyForLoan();
    boolean calculateLoanEligibility();
}
abstract class BankAccount{
    private int accountNumber;
    private String holderName;
    private double balance;
    abstract double calculateInterest();
    BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        balance-=amount;
    }
    void displayDetails(BankAccount b){
        System.out.println("\nAccount Holder Name : "+holderName);
        System.out.println("Account number : "+accountNumber);
        System.out.println("Balance : "+balance);
        System.out.println(holderName+" "+((Loanable)b).applyForLoan());
        if(((Loanable)b).calculateLoanEligibility()){
            System.out.println(holderName+" is eligible for a loan");
        }
        else{
            System.out.println(holderName+" is not eligible for loan");
        }
        System.out.println("Interest amount : "+calculateInterest());
    }
}
class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(int accountNumber,String holderName,double balance){
        super(accountNumber,holderName,balance);
    }
    double calculateInterest(){
        return getBalance()*0.02;
    }
    public String applyForLoan(){
        return "has applied a loan(Savings Account)";
    }
    public boolean calculateLoanEligibility(){
        if(getBalance()>100000){
            return true;
        }
        else{
            return false;
        }
    }
}
class CurrentAccount extends BankAccount implements Loanable{
    CurrentAccount(int accountNumber,String holderName,double balance){
        super(accountNumber,holderName,balance);
    }
    double calculateInterest(){
        return getBalance()*0.04;
    }
    public String applyForLoan(){
        return "has applied a loan(Savings Account)";
    }
    public boolean calculateLoanEligibility(){
        if(getBalance()>500000){
            return true;
        }
        else{
            return false;
        }
    }
}
class Main3{
    public static void main(String[] a){
        BankAccount s = new SavingsAccount(101,"Lehaz",1234567);
        BankAccount c = new CurrentAccount(201,"Akash",4328765);
        s.deposit(234543);
        c.deposit(123134);
        s.withdraw(123456);
        c.withdraw(432123);
        s.displayDetails(s);
        c.displayDetails(c);
    }
}