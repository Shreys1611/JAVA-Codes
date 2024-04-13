import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AppQ8 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text or string: ");
        String input = scanner.nextLine();
        scanner.close();
        Map<Character, Integer> charCount = countCharacters(input);
        System.out.println("Character count in the input:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet())
        {
            char character = entry.getKey();
            int count = entry.getValue();
            System.out.println("'" + character + "': " + count);
        }
    }
    public static Map<Character, Integer> countCharacters(String input)
    {
        Map<Character, Integer> charCount = new HashMap<>();
        input = input.toLowerCase();
        for(char character : input.toCharArray())
        {
            if (Character.isLetter(character))
            {
                charCount.put(character, charCount.getOrDefault(character, 0) + 1);
            }
        }
        return charCount;
    }
}
