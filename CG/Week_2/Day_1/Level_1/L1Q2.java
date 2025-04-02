class Circle
{
    private int radius;
    private final double pi = 3.14;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    public void circumference()
    {
        System.out.println("The circumference of the circle is; " + (2 * pi * radius));
    }

    public void area()
    {
        System.out.println("The Area of the circle is; " + (pi * radius * radius));
    }
}

class MainaL1_02
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(5);
        c1.circumference();
        c1.area();
    }
}
