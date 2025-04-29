import java.util.Scanner;  

class GradeSystem {  
    public static void main(String[] args) {  
        Scanner scr = new Scanner(System.in);  
        
        System.out.print("Enter mathematics mark: ");  
        int math = scr.nextInt();  
        
        System.out.print("Enter chemistry mark: ");  
        int chem = scr.nextInt();  
        
        System.out.print("Enter physics mark: ");  
        int phy = scr.nextInt();  
        
       
        int total = math + chem + phy;  
        double average = total / 3.0;   
        double percentage = (total / 300.0) * 100;  
        
    
        System.out.printf("Average Mark: %.2f\n", average);  
        System.out.printf("Percentage: %.2f%%\n", percentage);  
 
        if (percentage >= 80) {  
            System.out.println("GRADE: A Level 4, above agency-normalized standards");  
        } else if (percentage >= 70) {  
            System.out.println("GRADE: B Level 3, at agency-normalized standards");  
        } else if (percentage >= 60) {  
            System.out.println("GRADE: C Level 2, below, but approaching agency-normalized standards");  
        } else if (percentage >= 50) {  
            System.out.println("GRADE: D Level 1, well below agency-normalized standards");  
        } else if (percentage >= 40) {  
            System.out.println("GRADE: E Level 1-, too below agency-normalized standards");  
        } else {  
            System.out.println("GRADE: R, Remedial standards");  
        }  
        
 
    }  
}  