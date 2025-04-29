class Vehicle{
    String model;
    double maxSpeed;
}
class PetrolVehicle extends Vehicle implements Refuellable{
    PetrolVehicle(String model,double maxSpeed){
        this.model=model;
        this.maxSpeed=maxSpeed;
    }
    public void refuel(){
        System.out.println("Model : "+model);
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("Type : Petrol(Refuellable)\n");
    }
}
class ElectricVehicle extends Vehicle{
    ElectricVehicle(String model,double maxSpeed){
        this.model=model;
        this.maxSpeed=maxSpeed;
    }
    void charge(){
        System.out.println("Model : "+model);
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("Type : Electric(Rechargeable)\n");
    }
}
interface Refuellable{
    void refuel();
}
class Main1{
    public static void main(String[] args){
        PetrolVehicle p = new PetrolVehicle("SUV",300);
        ElectricVehicle e = new ElectricVehicle("Sedan",240);
        p.refuel();
        e.charge();
    }
}