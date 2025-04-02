class Animal {
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal sounds...");
    }
    Animal(){}
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Dog extends Animal {
    @Override void makeSound(){
        System.out.println("Dog : Bark");
        System.out.println("Name : "+name+"\nAge : "+age);
    }
    Dog(String name,int age){
        super(name,age);
    }
}

class Cat extends Animal {
    @Override void makeSound(){
        System.out.println("Cat : Meow");
        System.out.println("Name : "+name+"\nAge : "+age);
    }
    Cat(String name,int age){
        super(name,age);
    }
}
class Bird extends Animal{
    @Override void makeSound(){
        System.out.println("Birds : Chirp");
        System.out.println("Name : "+name+"\nAge : "+age);
        super.makeSound();
    }
    Bird(String name,int age){
        super(name,age);
    }
}

class Main {
    public static void main(String[] args) {
        Animal a = new Dog("Choki",3);
        Animal b = new Cat("Kitty",1);
        Animal c = new Bird("Kili",4);
        Animal d = new Animal();
        a.makeSound();
        b.makeSound();
        c.makeSound();
        d.makeSound();
    }
}
