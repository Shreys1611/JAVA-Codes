import java.util.Scanner;
class Shape 
{
    public double getPerimeter() 
    {
        return 0.0;
    }

    public double getArea() 
    {
        return 0.0;
    }
}

class Circle extends Shape
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double getPerimeter() 
    {
        return 2 * Math.PI * radius;
    }

    public double getArea() 
    {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        double perimeter = circle.getPerimeter();
        double area = circle.getArea();

        System.out.println("Circle Perimeter: " + perimeter);
        System.out.println("Circle Area: " + area);

        scanner.close();
    }
}
