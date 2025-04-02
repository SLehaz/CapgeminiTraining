import java.util.Scanner;

class MovieTicket
{
    public String movieName;
    private int seatNumber;
    private int price = 0;

    public int[][] createarr()
    {
        return new int[5][20];
    }

    public MovieTicket(String name)
    {
        this.movieName =  name;
    }

    public void display(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayTicket(String row)
    {
        System.out.println("Row and Seat number booked: " + row + seatNumber);
        System.out.println("Total Price: " + price);
    }

    public void bookTicket(int[][] arr)
    {
        Scanner s = new Scanner(System.in);
        display(arr);
        System.out.println("Enter the row to book: ");
        String row = s.nextLine();
        System.out.println("Enter the seat number: ");
        seatNumber = s.nextInt();

        if (arr[(int)(row.charAt(0)) - 65][seatNumber] == 0)
        {
            arr[(int)(row.charAt(0)) - 65][seatNumber] = 1;
            price += 120;
            displayTicket(row);
        }
        else
        {
            System.out.println("That Seat is already taken. Try Another Seat.");
        }
    }
}

class MainL2_04
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to movie ticket System!");
        MovieTicket m1 = new MovieTicket("Thuppaki");
        int[][] arr = m1.createarr();
        int count = 0;

        while (true)
        {
            System.out.println("Do you want to book tickets for " + m1.movieName + "? (Yes/No)");
            String variable = s.nextLine();

            if (variable.equals("No"))
            {
                break;
            }
            else
            {
                m1.bookTicket(arr);
            }
        }

        System.out.println("Thank you for Booking!");
    }
}