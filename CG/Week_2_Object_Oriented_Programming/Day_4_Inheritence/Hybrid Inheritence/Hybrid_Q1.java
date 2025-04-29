class Person{
    String name;
    int id;
    Person(){}
}
class Chef extends Person implements Worker{
    Chef(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void performDuties(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Duty : Chef\n");
    }
}
class Waiter extends Person implements Worker{
    Waiter(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void performDuties(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Duty : Waiter\n");
    }
}
interface Worker{
    void performDuties();
}
class Main{
    public static void main(String[] args){
        Chef c = new Chef("Alex",101);
        Waiter w = new Waiter("Carry",203);
        c.performDuties();
        w.performDuties();
    }
}