import java.util.Scanner;
public class AppQ6 
{   public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your password: ");
        String password = scanner.nextLine();
        scanner.close();
        if (isValidPassword(password)) 
        {
            System.out.println("Valid Password");
        } 
        else 
        {
            System.out.println("Not a Valid Password");
        }
    }
    public static boolean isValidPassword(String password) 
    {
        if (password.length() < 6 || password.length() > 16) 
        {
            return false;
        }
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (int i = 0; i < password.length(); i++) 
        {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) 
            {
                hasLowerCase = true;
            } 
            else if (Character.isUpperCase(ch)) 
            {
                hasUpperCase = true;
            } 
            else if (Character.isDigit(ch)) 
            {
                hasDigit = true;
            } 
            else if (ch == '$' || ch == '#' || ch == '@') 
            {
                hasSpecialChar = true;
            }
        }
        return hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;
    }
}
