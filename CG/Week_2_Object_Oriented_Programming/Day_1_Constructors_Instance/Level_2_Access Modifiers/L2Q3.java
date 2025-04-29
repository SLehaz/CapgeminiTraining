class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    BankAccount(int accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void display(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Balance : "+balance);
    }
    public void changeBalance(double newBalance){
        this.balance=newBalance;
    }
}
class SavingsAccount{
    public static void main(String[] args){
        BankAccount b = new BankAccount(6453223,"Lehaz",9999999);
        b.display();
        b.changeBalance(4545455);
        b.accountNumber=1234567;
        b.accountHolder="Akash";
        b.display();
    }
}