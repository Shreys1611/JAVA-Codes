import java.util.Scanner;
public class AppQ2 
{
    public static boolean areRotationallyEquivalent(String str1, String str2) 
    {
        if (str1.length() != str2.length()) 
        {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String string2 = scanner.nextLine();
        boolean result = areRotationallyEquivalent(string1, string2);
        System.out.println("Are two strings Rotationally equal? : " + result);
        scanner.close();
    }
}