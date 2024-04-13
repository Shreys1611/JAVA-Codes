import java.util.Scanner;
public class AppQ10 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];
        System.out.println("Enter 15 elements in the array:");
        for (int i = 0; i < 15; i++)
        {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        int uniqueCount = countUniqueValues(array);
        System.out.println("Number of unique values in the array: " + uniqueCount);
    }
    public static int countUniqueValues(int[] arr)
    {
        int uniqueCount = 0;
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            if (!visited[i])
            {
                uniqueCount++;
                visited[i] = true;
                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        visited[j] = true;
                    }
                }
            }
        }
        return uniqueCount;
    }
}