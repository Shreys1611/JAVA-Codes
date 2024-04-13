import Add.Addition;
import Sub.Subtraction;

public class Calculate 
{
    public static void main(String[] args) 
    {
        int num1 = 100;
        int num2 = 57;

        int sum = Addition.add(num1, num2);
        int difference = Subtraction.subtract(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
