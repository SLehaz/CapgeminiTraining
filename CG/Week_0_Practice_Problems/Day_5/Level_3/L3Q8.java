import java.util.Scanner;

class SimpleCalendar {

    private static final String[] MONTHS = {  
        "January", "February", "March", "April", "May", "June",  
        "July", "August", "September", "October", "November", "December"  
    };  

    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30,  
                                                 31, 31, 30, 31, 30, 31};  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter month (1-12): ");  
        int month = scanner.nextInt();  
        System.out.print("Enter year: ");  
        int year = scanner.nextInt();  

        displayCalendar(month, year);  
    }  

    public static void displayCalendar(int month, int year) {  
        System.out.println("\n  " + MONTHS[month - 1] + " " + year);  
        System.out.println("Su Mo Tu We Th Fr Sa");  

        int days = getDaysInMonth(month, year);  

        int firstDay = getFirstDayOfMonth(month, year);  

        for (int i = 0; i < firstDay; i++) {  
            System.out.print("   "); 
        }  

        for (int day = 1; day <= days; day++) {  
            System.out.printf("%2d ", day);  
            if ((firstDay + day) % 7 == 0) {  
                System.out.println();  
            }  
        }  
        System.out.println(); 
    }  

   
    public static int getDaysInMonth(int month, int year) {  
        if (month == 2 && isLeapYear(year)) {  
            return 29;
        }  
        return DAYS_IN_MONTH[month - 1];   
    }  

    public static boolean isLeapYear(int year) {  
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);  
    }  

    public static int getFirstDayOfMonth(int month, int year) {  
        if (month < 3) {  
            month += 12; 
            year--; 
        }  
        int K = year % 100;  
        int J = year / 100;  
        int dayOfWeek = (1 + (13 * (month + 1)) / 5 + K + (K / 4) + (J / 4) - 2 * J) % 7;  
        return (dayOfWeek + 7) % 7;  
    }  
}  