class Course{
    String courseName;
    int duration;
    int fee;
    static String instituteName;
    Course(String courseName, int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourseDetails(){
        System.out.println("Institute Name : "+instituteName);
        System.out.println("Course Name : "+courseName);
        System.out.println("Duration : "+duration);
        System.out.println("Fees : "+fee);
    }
    static void updateInstituteDetails(String newName){
        instituteName=newName;
    }
    public static void main(String[] args) {
        instituteName = "SRMIST";
        Course c1 = new Course("CSE", 4, 225000);
        Course c2 = new Course("CSBS", 4, 320000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        updateInstituteDetails("VIT Vellore");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}