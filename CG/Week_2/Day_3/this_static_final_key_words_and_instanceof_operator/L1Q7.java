class Patient{
    public static String hospitalName;
    String name;
    int age;
    String ailment;
    final int patientID;
    static int totalpatients=0;
    Patient(String name,int age,String ailment,int patientID){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientID=patientID;
        totalpatients++;
    }
    static void getTotalPatients(){
        System.out.println("Total no of patients admitted : "+totalpatients);
    }
    void display(){
        System.out.println("Hospital Name : "+hospitalName);
        System.out.println("Patient ID : "+patientID);
        System.out.println("Patient Name : "+name);
        System.out.println("Patient age : "+age);
        System.out.println("Ailment : "+ailment);
    }
    public static void main(String[] args){
        Patient p= new Patient("Lehaz",22,"Headache",41);
        Patient p1= new Patient("Akash",21,"Leg Sprain",34);
        hospitalName="SIMS";
        if(p instanceof Patient){
            p.display();
        }
        if(p1 instanceof Patient){
            p1.display();
        }
        getTotalPatients();
    }
}