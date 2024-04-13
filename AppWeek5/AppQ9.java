import java.util.Scanner;
public class AppQ9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three digits (e.g., 0 1 2): ");
        int digit1 = scanner.nextInt();
        int digit2 = scanner.nextInt();
        int digit3 = scanner.nextInt();
        if (isValidDigit(digit1) && isValidDigit(digit2) && isValidDigit(digit3))
        {
            System.out.println("All possible combinations from the entered digits:");
            generateCombinations(digit1, digit2, digit3);
        }
        else
        {
            System.out.println("Invalid input. Please enter three digits between 0 and 9.");
        }
        scanner.close();
    }
    public static boolean isValidDigit(int digit)
    {
        return digit >= 0 && digit <= 9;
    }
    public static void generateCombinations(int digit1, int digit2, int digit3)
    {
        System.out.println(digit1 + "" + digit2 + "" + digit3);
        System.out.println(digit1 + "" + digit3 + "" + digit2);
        System.out.println(digit2 + "" + digit1 + "" + digit3);
        System.out.println(digit2 + "" + digit3 + "" + digit1);
        System.out.println(digit3 + "" + digit1 + "" + digit2);
        System.out.println(digit3 + "" + digit2 + "" + digit1);
    }
}
