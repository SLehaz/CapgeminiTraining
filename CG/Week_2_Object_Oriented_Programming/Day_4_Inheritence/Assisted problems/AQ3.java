class Vehicle{
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("Fuel Type : "+fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
    }
    void displayInfo(){
        System.out.println("Car : ");
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity);
    }
}
class Truck extends Vehicle{
    int bootCapacity;
    Truck(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
    }
    void displayInfo(){
        System.out.println("Truck : ");
        super.displayInfo();
        System.out.println("Boot Capacity : "+bootCapacity);
    }
}
class Motorcycle extends Vehicle{
    int cubicCapacity;
    Motorcycle(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
    }
    void displayInfo(){
        System.out.println("Motorcycle : ");
        super.displayInfo();
        System.out.println("CC : "+cubicCapacity);
    }
}
class Main2{
    public static void main(String[] args){
        Car c = new Car(240,"Petrol");
        Truck t = new Truck(180,"Diesel");
        Motorcycle m = new Motorcycle(190,"Petrol");
        c.seatCapacity=6;
        t.bootCapacity=3500;
        m.cubicCapacity=150;
        c.displayInfo();
        t.displayInfo();
        m.displayInfo();
    }
}