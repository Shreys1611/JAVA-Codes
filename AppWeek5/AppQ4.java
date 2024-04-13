import java.util.Scanner; 
public class AppQ4 
{
    public static boolean isPalindrome() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        input = input.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        while (left < right) 
        {
            if (input.charAt(left) != input.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        boolean result = isPalindrome();
        if (result) 
        {
            System.out.println("The entered string is a palindrome.");
        }
        else
        {
            System.out.println("The entered string is not a palindrome.");
        }
    }
}