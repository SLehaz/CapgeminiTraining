interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle implements Insurable{
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    int days;
    abstract double calculateRentalCost(int days);
    Vehicle(String vehicleNumber,String type,double rentalRate,int days){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
        this.days=days;
    }
    double getRentalRate(){
        return rentalRate;
    }
    void displayDetails(){
        System.out.println("Vehicle Number "+vehicleNumber);
        System.out.println("vehicle type : "+type);
        System.out.println("Rent per day : "+rentalRate);
        System.out.println("Total Days : "+days);
        System.out.println("Total rent : "+calculateRentalCost(days));
        System.out.println("Insurance : "+getInsuranceDetails());
        System.out.println("Total Insurance : "+calculateInsurance());
        System.out.println();
    }
}
class Car extends Vehicle{
    Car(String vehicleNumber,String type,double rentalRate,int days){
        super(vehicleNumber,type,rentalRate,days);
    }
    double calculateRentalCost(int days){
        return days*getRentalRate();
    }
    public double calculateInsurance(){
        return getRentalRate()*0.1*days;
    }
    public String getInsuranceDetails(){
        return "10% per day";
    }
}
class Bike extends Vehicle{
    Bike(String vehicleNumber,String type,double rentalRate,int days){
        super(vehicleNumber,type,rentalRate,days);
    }
    double calculateRentalCost(int days){
        return days*getRentalRate();
    }
    public double calculateInsurance(){
        return getRentalRate()*0.2*days;
    }
    public String getInsuranceDetails(){
        return "20% per day";
    }
}
class Truck extends Vehicle{
    Truck(String vehicleNumber,String type,double rentalRate,int days){
        super(vehicleNumber,type,rentalRate,days);
    }
    double calculateRentalCost(int days){
        return days*getRentalRate();
    }
    public double calculateInsurance(){
        return getRentalRate()*0.3*days;
    }
    public String getInsuranceDetails(){
        return "30% per day";
    }
}
class Main2{
    public static void main(String[] a){
        Vehicle v1 = new Car("TN10AE7869","SUV",1500,10);
        Vehicle v2 = new Bike("TN10BE0001","Hayabusa",2500,15);
        Vehicle v3 = new Truck("TN10CE0007","Cyber Truck",3000,20);
        Vehicle[] vAll = new Vehicle[]{v1,v2,v3};
        for(Vehicle v : vAll){
            v.displayDetails();
        }
    }
}