import java.util.Scanner;
public class AppQ1 
{
    public static void printMirrorImage(String input) 
    {
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Mirror Image: " + reversed);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        printMirrorImage(input);
        scanner.close();
    }
}