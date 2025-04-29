class Vehicle{
    static int registrationFee;
    public String ownerName;
    public String vehicleType;
    public final int registrationNumber;
    Vehicle(String ownerName,String vehicleType,int registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    public void displayDetails(){
        System.out.println("Owner Name : "+ownerName);
        System.out.println("Vehicle Type : "+vehicleType);
        System.out.println("Registration Number : "+registrationNumber);
        System.out.println("Registration Fee : "+registrationFee);
    }
    static void updateRegistrationFee(int newRegistrationFee){
        registrationFee=newRegistrationFee;
    }
    public static void main(String[] args){
        Vehicle v = new Vehicle("Lehaz","SUV",2255);
        Vehicle v1 = new Vehicle("Akash","Sedan",2399);
        registrationFee=25000;
        if(v instanceof Vehicle)
            v.displayDetails();
        if(v1 instanceof Vehicle)
            v1.displayDetails();
        updateRegistrationFee(45000);
        v.displayDetails();
        v1.displayDetails();
    }
}