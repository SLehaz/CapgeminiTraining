class Vehicle{
    String ownerName,vehicleType;
    static int registrationFee;
    Vehicle(String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    void displayVehicleDetails(){
        System.out.println("Owner name : "+ownerName);
        System.out.println("Vehicle type : "+vehicleType);
        System.out.println("Registration Fee : "+registrationFee);
    }
    static void updateRegistrationFee(int resFee){
        registrationFee=resFee;
    }
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Lehaz","SUV");
        Vehicle v2 = new Vehicle("Akash","Sedan");
        registrationFee=25000;
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        updateRegistrationFee(45000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}