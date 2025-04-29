class Student{
    int rollNumber,age;
    String name;
    char grade;
    Student next;
    Student(int rollNumber,String name,char grade,int age){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
        this.age=age;
        this.next=null;
    }
}
class StudentLL{
    Student head = null;
    void addAtBeginning(int rollNumber,String name,char grade,int age){
        Student newStudent = new Student(rollNumber,name,grade,age);
        newStudent.next=head;
        head=newStudent;
    }
    void addAtEnd(int rollNumber,String name,char grade,int age){
        Student newStudent = new Student(rollNumber,name,grade,age);
        if(head==null){
            head=newStudent;
        }
        else{
            Student temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newStudent;
        }
    }
    void addAtPosition(int rollNumber,String name,char grade,int age,int position){
        Student newStudent = new Student(rollNumber,name,grade,age);
        if(position<=0){
            System.out.println("Invalid position");
        }
        else if(position==1){
            head=newStudent;
        }
        else{
            Student temp=head;
            for(int i=2;i<position;i++){
                temp.next=temp;
            }
            newStudent.next=temp.next;
            temp.next=newStudent;
        }
    }
    void deleteRecord(int rollNumber){
        Student temp=head;
        while(temp.next.rollNumber!=rollNumber && temp.next!=null){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        System.out.println("\nDeletion Successful");
    }
    void searchRecord(int rollNumber){
        Student temp=head;
        while(temp.rollNumber!=rollNumber && temp.next!=null){
            temp=temp.next;
        }
        if(temp.rollNumber==rollNumber){
            System.out.println("\nStudent with roll number "+rollNumber+" is found");
        }
        else{
            System.out.println("Student with roll number "+rollNumber+" is not found");
        }
    }
    void updateGrade(int rollNumber,char grade){
        Student temp=head;
        int flag=0;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                flag=1;
                break;
            }
            temp = temp.next;
        }
        if(flag==1){
            temp.grade=grade;
            System.out.println("Student's grade with roll number "+rollNumber+" is changed");
        }
        else{
            System.out.println("Student with roll number "+rollNumber+" is not found");
        }
    }
    void displayList(){
        Student temp=head;
        while(temp!=null){
            System.out.println("\nStudent Roll number : "+temp.rollNumber);
            System.out.println("Student name : "+temp.name);
            System.out.println("Student Grade : "+temp.grade);
            System.out.println("Student age : "+temp.age);
            temp=temp.next;
        }
    }
}
class Main{
    public static void main(String[] a){
        StudentLL s = new StudentLL();
        s.addAtBeginning(1,"Lehaz",'A',22);
        s.addAtEnd(2,"Akash",'B',21);
        s.addAtPosition(3,"Sathya",'C',20,2);
        s.displayList();
        s.deleteRecord(3);
        s.searchRecord(3);
        s.updateGrade(2,'A');
        s.displayList();
    }
}