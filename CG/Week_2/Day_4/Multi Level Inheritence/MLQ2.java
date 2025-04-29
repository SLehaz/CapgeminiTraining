class Course{
    String courseName;
    int duration;
    Course(){
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    OnlineCourse(){
    }
}
class PaidOnlineCourse extends OnlineCourse{
    double fee,discount;
    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,double fee,double discount){
        this.courseName=courseName;
        this.duration=duration;
        this.platform=platform;
        this.isRecorded=isRecorded;
        this.fee=fee;
        this.discount=discount;
    }
    void displayDetails(){
        System.out.println("Course Name : "+courseName);
        System.out.println("Duration : "+duration+" months");
        System.out.println("Platform : "+platform);
        System.out.print("Recording availability : ");
        String s = isRecorded?"Yes":"No";
        System.out.println(s);
        System.out.println("Fee : "+fee);
        System.out.println("Discount : "+discount+"%\n");
    }
}
class Main1{
    public static void main(String[] args){
        PaidOnlineCourse p1 = new PaidOnlineCourse("Java",5,"Bridgelabz",true,123456,20);
        PaidOnlineCourse p2 = new PaidOnlineCourse("C++",2,"Mocrisift",false,654321,28);
        p1.displayDetails();
        p2.displayDetails();
    }
}