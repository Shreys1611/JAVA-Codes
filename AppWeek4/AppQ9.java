import java.util.Scanner;
public class AppQ9 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int sum = num1 + num2;
        if (sum >= 105 && sum <= 200) 
        {
            System.out.println("Sum is " + sum + ". Returning 200.");
            sum = 200;
        }
        System.out.println("Sum is " + sum);
    }
}
