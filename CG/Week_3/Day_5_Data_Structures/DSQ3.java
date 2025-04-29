import java.time.LocalDate;
class Task{
    int taskID,priority;
    String taskName;
    LocalDate date;
    Task next;
    Task(int taskID,String taskName,int priority,LocalDate date){
        this.taskID=taskID;
        this.taskName=taskName;
        this.priority=priority;
        this.date=date;
    }
}
class TaskCLL{
    Task head=null;
    Task tail=null;
    void addAtBeginning(int taskID,String taskName,int priority,LocalDate date){
        Task t = new Task(taskID,taskName,priority,date);
        if(head==null){
            head=t;
            tail=t;
            tail.next=head;
        }
        else{
            t.next=head;
            head=t;
            tail.next=head;
        }
    }
    void addAtEnd(int taskID,String taskName,int priority,LocalDate date){
        Task t = new Task(taskID,taskName,priority,date);
        if(head==null){
            head=t;
            tail=t;
            tail.next=head;
        }
        else{
            tail.next=t;
            tail=t;
            tail.next=head;
        }
    }
    void addAtPosition(int taskID,String taskName,int priority,LocalDate date,int position){
        Task t = new Task(taskID,taskName,priority,date);
        Task temp=head;
        if(position==1){
            addAtBeginning(taskID,taskName,priority,date);
        }
        else {
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            if(temp.next==head){
                addAtEnd(taskID,taskName,priority,date);
            }
            else {
                t.next = temp.next;
                temp.next = t;
            }
        }
    }
    void removeTask(int taskID){
        Task temp =head;
        Task pretemp = tail;
        while(temp.taskID!=taskID){
            pretemp = temp;
            temp = temp.next;
        }
        if (temp == head) {
            pretemp.next=temp.next;
            head=temp.next;
            temp=null;
        }
        else if(temp==tail){
            pretemp.next=temp.next;
            tail=pretemp;
            temp=null;
        }
        else if(temp.taskID==taskID){
            pretemp.next=temp.next;
            temp=null;
        }
    }
    void searchList(int priority){
        Task temp=head;
        while(temp.next!=head){
            if(temp.priority==priority){
                System.out.println("\nTask with priority "+priority+" is found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("\nTask with priority "+priority+" is not found");
    }
    void displayList(){
        Task temp = head;
        do{
            System.out.println("\nTask ID   : " + temp.taskID);
            System.out.println("Task name : " + temp.taskName);
            System.out.println("Priority  : " + temp.priority);
            System.out.println("Date      : " + temp.date);
            temp=temp.next;
        }while(temp!=head);
    }
}
class Main2{
    public static void main(String[] a){
        TaskCLL t = new TaskCLL();
        t.addAtBeginning(1,"Read",1,LocalDate.of(2025,04,13));
        t.addAtEnd(3,"Practice",3,LocalDate.of(2025,01,1));
        t.addAtPosition(2,"Write",2,LocalDate.of(2025,04,1),2);
        t.displayList();
        t.removeTask(1);
        System.out.println("\nAfter deletion of data with ID 1");
        t.displayList();
        t.searchList(1);
    }
}