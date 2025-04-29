interface GPS{
    String getCurrentLocation();
    String updateLocation();
}
abstract class Vehicle1 implements GPS{
    private int vehicleId;
    private String driverName;
    private double ratePerKm,distance;
    abstract double calculateFare(double distance);
    Vehicle1(int vehicleId,String driverName,double ratePerKm,double distance){
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
        this.distance=distance;
    }
    double getRatePerKm(){
        return ratePerKm;
    }
    void getVehicleDetails(){
        System.out.println("\nVehicle ID : "+vehicleId);
        System.out.println("Driver Name : "+driverName);
        System.out.println("Current location : "+getCurrentLocation());
        System.out.println("Updated location : "+updateLocation());
        System.out.println("Rate per km : "+ratePerKm);
        System.out.println("Distance : "+distance);
        System.out.println("Total fare : "+calculateFare(distance));
    }
}
class Car1 extends Vehicle1{
    Car1(int vehicleId,String driverName,double ratePerKm,double distance){
        super(vehicleId,driverName,ratePerKm,distance);
    }
    double calculateFare(double distance){
        return distance*getRatePerKm();
    }
    public String getCurrentLocation(){
        return "Chennai";
    }
    public String updateLocation(){
        return "Hyderabad";
    }
}
class Bike1 extends Vehicle1{
    Bike1(int vehicleId,String driverName,double ratePerKm,double distance){
        super(vehicleId,driverName,ratePerKm,distance);
    }
    double calculateFare(double distance){
        return distance*getRatePerKm();
    }
    public String getCurrentLocation(){
        return "Hyderabad";
    }
    public String updateLocation(){
        return "Chennai";
    }
}
class Auto extends Vehicle1{
    Auto(int vehicleId,String driverName,double ratePerKm,double distance){
        super(vehicleId,driverName,ratePerKm,distance);
    }
    double calculateFare(double distance){
        return distance*getRatePerKm();
    }
    public String getCurrentLocation(){
        return "Bangalore";
    }
    public String updateLocation(){
        return "Mumbai";
    }
}
class Main7{
    public static void main(String[] a){
        Vehicle1 v1 = new Car1(1,"Lehaz",20,100);
        Vehicle1 v2 = new Bike1(2,"Akash",15,60);
        Vehicle1 v3 = new Auto(3,"Preetha",10,150);
        v1.getVehicleDetails();
        v2.getVehicleDetails();
        v3.getVehicleDetails();
    }
}