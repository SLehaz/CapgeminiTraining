class Device{
    int deviceID;
    String status;
    Device(int deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }
}
class Thermostat extends Device{
    int temperatureSetting;
    String mode;
    Thermostat(int temperatureSetting,String mode,int deviceID,String status){
        super(deviceID,status);
        this.temperatureSetting=temperatureSetting;
        this.mode=mode;
    }
    void displayStatus(){
        System.out.println("Device ID : "+deviceID);
        System.out.println("Status : "+status);
        System.out.println("Temperature Setting : "+temperatureSetting);
        System.out.println("Mode : "+mode);
    }
}
class Main1{
    public static void main(String[] args){
        Thermostat t1 = new Thermostat(24,"Cool",1,"OK");
        Thermostat t2 = new Thermostat(16,"Warm",2,"Not OK");
        t1.displayStatus();
        t2.displayStatus();
    }
}