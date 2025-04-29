interface MedicalRecord{
    void addRecord(String add);
    void viewRecords();
}
abstract class Patient implements MedicalRecord{
    private int patientId;
    private String name,record;
    private int age;
    abstract double calculateBill();
    Patient(int patientId,String name,int age,String record){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
        this.record=record;
    }
    String getRecord(){
        return record;
    }
    void setRecord(String n){
        this.record=n;
    }
    void getPatientDetails(){
        System.out.println("\nPatient Name : "+name);
        System.out.println("Patient ID : "+patientId);
        System.out.println("Patient age : "+age);
        System.out.println("Medical Record of Patient "+name+" : ");
        viewRecords();
        System.out.println("Bill : Rs."+calculateBill());
    }
}
class InPatient extends Patient{
    InPatient(int patientId,String name,int age,String record){
        super(patientId,name,age,record);
    }
    double calculateBill(){
        return 50000;
    }
    public void addRecord(String add){
        String n = getRecord()+"\n"+add;
        setRecord(n);
    }
    public void viewRecords(){
        System.out.println(getRecord());
    }
}
class OutPatient extends Patient{
    OutPatient(int patientId,String name,int age,String record){
        super(patientId,name,age,record);
    }
    double calculateBill(){
        return 5000;
    }
    public void addRecord(String add){
        String n = getRecord()+"\n"+add;
        setRecord(n);
    }
    public void viewRecords(){
        System.out.println(getRecord());
    }
}
class Main6{
    public static void main(String[] a){
        Patient p1 = new OutPatient(1,"Lehaz",22,"Headache");
        Patient p2 = new InPatient(2,"Akash", 21,"Chronic cancer");
        p1.addRecord("Stomachache");
        p2.addRecord("Kidney failure");
        p1.getPatientDetails();
        p2.getPatientDetails();
    }
}