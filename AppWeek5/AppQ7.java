import java.util.Scanner;
public class AppQ7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        boolean result = checkValues(num1, num2);
        if (result)
        {
            System.out.println("The two integers meet the criteria.");
        }
        else
        {
            System.out.println("The two integers do not meet the criteria.");
        }
        scanner.close();
    }
    public static boolean checkValues(int a, int b)
    {
        return a == b || Math.abs(a - b) == 5 || (a + b) == 5;
    }
}