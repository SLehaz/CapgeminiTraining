import java.util.Scanner;

class convertM {
    public void convertYardsToFeet(double yards) {
        double yards2feet = 3 * yards;
        System.out.println("The converted Yards To Feet: " + yards2feet);
    }

    public void convertfeet2yards(double feet) {
        double feet2yards = 0.333333 * feet;
        System.out.println("The converted Feet to Yards: " + feet2yards);
    }

    public void convertmeters2inches(double meters) {
        double meters2inches = 39.3701 * meters;
        System.out.println("The converted Meters to Inches: " + meters2inches);
    }

    public void convertYinches2meters(double inches) {
        double inches2meters = 0.0254 * inches;
        System.out.println("The converted Inches to Meters: " + inches2meters);
    }

    public void convertinches2cm(double inches) {
        double inches2cm = 2.54 * inches;
        System.out.println("The converted Inches to cm: " + inches2cm);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        convertM obj = new convertM();

        System.out.println("Enter the Yards: ");
        double yards = s.nextDouble();

        System.out.println("Enter the Feet: ");
        double feet = s.nextDouble();

        System.out.println("Enter the Meters: ");
        double meters = s.nextDouble();

        System.out.println("Enter the Inches: ");
        double inches = s.nextDouble();

        obj.convertYardsToFeet(yards);
        obj.convertfeet2yards(feet);
        obj.convertmeters2inches(meters);
        obj.convertYinches2meters(inches);
        obj.convertinches2cm(inches);

        s.close();  // Close scanner to prevent resource leak
    }
}
