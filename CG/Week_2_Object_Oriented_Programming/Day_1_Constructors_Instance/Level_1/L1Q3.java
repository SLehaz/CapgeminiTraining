class Person
{
    private String name;
    private int height;
    private int weight;
    private int age;

    Person(String personName, int personHeight, int personWeight, int personAge)
    {
        this.name = personName;
        this.height = personHeight;
        this.weight = personWeight;
        this.age = personAge;
    }

    Person (Person clone)
    {
        this.name = clone.name;
        this.height = clone.height;
        this.weight = clone.weight;
        this.age = clone.age;
    }

    void displayDetails()
    {
        System.out.println("The name of the person is: " + name);
        System.out.println("They are " + age + " years old.");
        System.out.println("His/Her height is " + height + " cm.");
        System.out.println("His/Her weight is " + weight + " kg.");
    }
}

class MainL1_03
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Ann", 178, 60, 21);
        Person p2 = new Person(p1);
        p1.displayDetails();
        p2.displayDetails();
    }
}