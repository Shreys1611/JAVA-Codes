import java.util.Scanner;
public class AppQ5
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        int letters = 0;
        int digits = 0;
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) 
            {
                letters++;
            } 
            else if (Character.isDigit(ch)) 
            {
                digits++;
            }
        }
        System.out.println("Letters " + letters);
        System.out.println("Digits " + digits);
    }
}