import java.util.Scanner;
class TravelComputation {
   
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = s.nextLine();

		System.out.println("Enter your from city : ");
		String fromCity = s.nextLine();

		System.out.println("Enter your via city : ");
		String viaCity = s.nextLine();

		System.out.println("Enter your to city : ");
		String toCity = s.nextLine();

		System.out.println("Enter distance between from city and via city : ");
		double distanceFromToVia =s.nextDouble();

		int timeFromToVia = 4 * 60 + 4;

		System.out.println("Enter distance between via city to final city : ");
		double distanceViaToFinalCity =s.nextDouble();

		int timeViaToFinalCity = 4 * 60 + 25;
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;
		int totalTime = timeFromToVia + timeViaToFinalCity;
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
		s.close();
		
   }
}
