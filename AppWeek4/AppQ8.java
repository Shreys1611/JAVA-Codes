import java.util.Scanner;
public class AppQ8 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month name: ");
        String monthName = scanner.nextLine();
        int daysInMonth = getDaysInMonth(monthName);
        scanner.close();
        if (daysInMonth == -1) 
        {
            System.out.println("Invalid month name");
        } 
        else 
        {
            System.out.println("Number of days in " + monthName + ": " + daysInMonth);
        }
    }
    public static int getDaysInMonth(String monthName) 
    {
        switch (monthName.toLowerCase()) 
        {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28;
            default:
                return -1;
        }
    }
}