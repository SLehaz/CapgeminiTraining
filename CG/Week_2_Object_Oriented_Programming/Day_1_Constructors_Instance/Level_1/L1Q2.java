class Circle
{
    private int radius;

    Circle()
    {
        radius = 4;
    }

    Circle(int radius)
    {
        this.radius = radius;
    }

    Circle(Circle prevCircle)
    {
        this.radius = prevCircle.radius;
    }

    void displayRadius()
    {
        System.out.println("The radius of the circle is: " + radius);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(5);
        c1.displayRadius();
        Circle c2 = new Circle(c1);
        c2.displayRadius();
        Circle c3 = new Circle();
        c3.displayRadius();
    }
}