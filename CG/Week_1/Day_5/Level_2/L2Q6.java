import java.util.Scanner;

class TempConv {
    public void farhenheit2celsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        System.out.println("The converted Farhenheit to Celsius : " + farhenheit2celsius );
    }

    public void celsius2farhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        System.out.println("The converted Celsius to Farhenheit: " + celsius2farhenheit);
    }

    public void pounds2kilograms(double pounds) {
        double pounds2kilograms = 0.453592 * pounds;
        System.out.println("The converted Pounds to Kilogram: " + pounds2kilograms);
    }

    public void kilograms2pounds(double kilo) {
        double kilograms2pounds = 2.20462* kilo;
        System.out.println("The converted Kilograms to Pounds: " + kilograms2pounds);
    }

    public void gallons2liters(double gallon) {
        double gallons2liters = 3.7854 * gallon;
        System.out.println("The converted Gallon to Liters: " + gallons2liters);
    }
	    public void liters2gallons(double liter) {
        double liters2gallons = 0.264172 * liter;
        System.out.println("The converted Gallon to Liters: " + liters2gallons);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TempConv obj = new TempConv();

        System.out.println("Enter the Farhenheit: ");
        double farhenheit = s.nextDouble();

        System.out.println("Enter the Celsius: ");
        double celsius = s.nextDouble();

        System.out.println("Enter the Pounds: ");
        double pounds = s.nextDouble();

        System.out.println("Enter the kilo: ");
        double kilo = s.nextDouble();
		
		System.out.println("Enter the Gallon: ");
        double gallon = s.nextDouble();
		
		System.out.println("Enter the liter: ");
        double liter = s.nextDouble();


        obj.farhenheit2celsius(farhenheit);
        obj.celsius2farhenheit(celsius);
        obj.pounds2kilograms(pounds);
        obj.kilograms2pounds(kilo);
        obj.gallons2liters(gallon);
		obj.liters2gallons(liter);
        s.close();  // Close scanner to prevent resource leak
    }
}
