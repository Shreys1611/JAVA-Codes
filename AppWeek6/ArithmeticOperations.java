import java.util.Scanner;
public class ArithmeticOperations 
{    
    public int add(int a, int b) 
    {
        return a + b;
    }

    public double add(double a, double b) 
    {
        return a + b;
    }

    public int subtract(int a, int b) 
    {
        return a - b;
    }

    public double subtract(double a, double b) 
    {
        return a - b;
    }

    public int multiply(int a, int b) 
    {
        return a * b;
    }

    public double multiply(double a, double b) 
    {
        return a * b;
    }

    public int divide(int a, int b) 
    {
        if (b != 0) 
        {
            return a / b;
        }
        else
        {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }
    public double divide(double a, double b) 
    {
        if (b != 0) 
        {
            return a / b;
        }
        else
        {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the secon integer number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the first double number: ");
        double num3 = scanner.nextDouble();

        System.out.print("Enter the second double number: ");
        double num4 = scanner.nextDouble();
        
        ArithmeticOperations calculator = new ArithmeticOperations();

        int sumInt = calculator.add(num1, num2);
        int differenceInt = calculator.subtract(num1, num2);
        int productInt = calculator.multiply(num1, num2);
        int quotientInt = calculator.divide(num1, num2);

        double sumDouble = calculator.add(num3, num4);
        double differenceDouble = calculator.subtract(num3, num4);
        double productDouble = calculator.multiply(num3, num4);
        double quotientDouble = calculator.divide(num3, num4);

        System.out.println("Integer Sum: " + sumInt);
        System.out.println("Integer Difference: " + differenceInt);
        System.out.println("Integer Product: " + productInt);
        System.out.println("Integer Quotient: " + quotientInt);

        System.out.println("Double Sum: " + sumDouble);
        System.out.println("Double Difference: " + differenceDouble);
        System.out.println("Double Product: " + productDouble);
        System.out.println("Double Quotient: " + quotientDouble);

        scanner.close();
    }    
}
