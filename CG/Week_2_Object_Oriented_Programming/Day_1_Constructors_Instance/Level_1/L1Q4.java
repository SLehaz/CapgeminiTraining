class HotelBooking
{
    private String guestName;
    private String roomType;
    private int nights;
    private int price;

    HotelBooking()
    {
        guestName = "Default";
        roomType  = "Normal";
        nights = 1;
        price = calculatePrice();
    }

    HotelBooking(String name, String type, int nights)
    {
        this.guestName = name;
        this.roomType = type;
        this.nights = nights;
        this.price = calculatePrice();
    }

    HotelBooking(HotelBooking booking1)
    {
        this.guestName = booking1.guestName;
        this.roomType = booking1.roomType;
        this.nights = booking1.nights;
        this.price = calculatePrice();
    }

    private int calculatePrice()
    {
        int pricePerNight = switch (roomType.toLowerCase())
        {
            case "normal" -> 100;
            case "deluxe" -> 150;
            case "suite" -> 200;
            default -> 100;
        };

        return pricePerNight * nights;
    }

    void displayDetails()
    {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
        System.out.println("Total Price: $" + price);

    }
}

class MainL1_04
{
    public static void main(String[] args)
    {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Jayasree", "Deluxe", 1);
        HotelBooking booking3 = new HotelBooking(booking2);

        booking1.displayDetails();
        booking2.displayDetails();
        booking3.displayDetails();
    }
}