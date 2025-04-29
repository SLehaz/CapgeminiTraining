import java.util.Scanner;
class Wind{
    public double calculateWindChill(double temperature, double windSpeed){
        return (35.74+0.6215*temperature+(0.4275*temperature - 35.75)*Math.pow(windSpeed,0.16));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Wind w = new Wind();
        System.out.println("Enter temperature and windspeed :");
        double temperature = s.nextDouble(), windspeed = s.nextDouble();
        double windChill = w.calculateWindChill(temperature,windspeed);
        System.out.println("The wind chill temperature is : "+windChill);
        s.close();
    }
}