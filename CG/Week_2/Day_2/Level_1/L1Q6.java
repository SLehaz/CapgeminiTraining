class CarRental
{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int totalCost;

    CarRental()
    {
        customerName = "Guest";
        carModel = "Model 1";
        rentalDays = 3;
    }

    CarRental(String name, String model, int days)
    {
        this.customerName = name;
        this.carModel = model;
        this.rentalDays = days;
        this.totalCost = calculateCost();
    }

    CarRental(CarRental car1)
    {
        this.customerName = car1.customerName;
        this.carModel = car1.carModel;
        this.rentalDays = car1.rentalDays;
        this.totalCost = calculateCost();
    }

    int calculateCost()
    {
        int cost = switch (carModel.toLowerCase())
        {
            case "sedan" -> 70;
            case "hatchback" -> 50;
            case "suv" -> 90;
            default -> 70;
        };

        return cost * rentalDays;
    }

    void displayDetails()
    {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("No of Days Taken for Rent: " + rentalDays);
        System.out.println("Total Cost for Rent: $  " + totalCost);
    }
}

class MainL1_06
{
    public static void main(String[] args)
    {
        CarRental car1 = new CarRental();
        CarRental car2 = new CarRental("Jay", "Sedan", 5);
        CarRental car3 = new CarRental(car1);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
