import java.util.Scanner;

class UnitConverter
{
    public static double convertKmToMiles(double km)
    {
        double km2miles = 0.621371;
        double miles = km * km2miles;

        return miles;
    }

    public static double convertMilesToKM(double miles)
    {
        double miles2km = 1.60934;
        double km = miles * miles2km;

        return km;
    }

    public static double convertMetreToFeet(double metre)
    {
        double metre2feet = 3.28084;
        double feet = metre * metre2feet;

        return feet;
    }

    public static double convertFeetToMetre(double feet)
    {
        double feet2metre = 0.3048;
        double metre = feet * feet2metre;

        return metre;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        double miles2km = UnitConverter.convertKmToMiles(km);
        System.out.println("Distance in miles: " + miles2km);

        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();
        double km2miles = UnitConverter.convertMilesToKM(miles);
        System.out.println("Distance in Kilometres: " + km2miles);

        System.out.print("Enter the distance in metres: ");
        double metres = sc.nextDouble();
        double metre2feet = UnitConverter.convertMetreToFeet(metres);
        System.out.println("Distance in Feet: " + metre2feet);

        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        double feet2metre = UnitConverter.convertFeetToMetre(feet);
        System.out.println("Distance in Metres: " + feet2metre);

    }
}
