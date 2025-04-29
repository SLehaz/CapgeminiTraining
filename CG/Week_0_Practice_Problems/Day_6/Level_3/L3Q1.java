import java.util.Scanner;  

class BMICalculator {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        double[][] data = new double[10][2];  

        for (int i = 0; i < 10; i++) {  
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");  
            data[i][0] = scanner.nextDouble();  
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");  
            data[i][1] = scanner.nextDouble();  
        }  

        String[][] bmiData = calculateBMI(data);  
        displayBMI(bmiData);  
        
        scanner.close();  
    }  

    public static String[][] calculateBMI(double[][] data) {  
        String[][] result = new String[10][4];  
        for (int i = 0; i < 10; i++) {  
            double weight = data[i][0];  
            double heightInMeters = data[i][1] / 100;  
            double bmi = weight / (heightInMeters * heightInMeters);  
            String status = getBMIStatus(bmi);  
            result[i][0] = String.valueOf(data[i][1]); // height in cm  
            result[i][1] = String.valueOf(weight); // weight in kg  
            result[i][2] = String.format("%.2f", bmi); // BMI  
            result[i][3] = status; // BMI status  
        }  
        return result;  
    }  

    public static String getBMIStatus(double bmi) {  
        if (bmi < 18.5) return "Underweight";  
        if (bmi < 24.9) return "Normal weight";  
        if (bmi < 29.9) return "Overweight";  
        return "Obesity";  
    }  

    public static void displayBMI(String[][] bmiData) {  
        System.out.println("\nHeight (cm)\tWeight (kg)\tBMI\tStatus");  
        for (String[] person : bmiData) {  
            System.out.println(person[0] + "\t\t" + person[1] + "\t\t" + person[2] + "\t" + person[3]);  
        }  
    }  
}  