import java.util.Scanner;
public class AppQ6 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();
        scanner.close();
        String missingDigits = findMissingDigits(mobileNumber);
        if (missingDigits.isEmpty())
        {
            System.out.println("All digits are present in the mobile number.");
        }
        else
        {
            System.out.println("Digits absent in the mobile number: " + missingDigits);
        }
    }
    public static String findMissingDigits(String number)
    {
        String allDigits = "0123456789";
        StringBuilder missingDigits = new StringBuilder();
        for (char digit : allDigits.toCharArray())
        {
            if (number.indexOf(digit) == -1)
            {
                missingDigits.append(digit);
            }
        }
        return missingDigits.toString();
    }
}