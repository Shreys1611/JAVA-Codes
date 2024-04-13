import java.util.Scanner;
interface Sortable 
{
    void sort(int[] arr);
}

class BubbleSort implements Sortable
{
    
    public void sort(int[] arr)
    {
        int n = arr.length;
        boolean swapped;
        do 
        {
            swapped = false;
            for (int i = 1; i < n; i++)
            {
                if (arr[i - 1] > arr[i])
                {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        }
        while (swapped);
    }
}

class SelectionSort implements Sortable
{
    public void sort(int[] arr)
    {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        int choice = scanner.nextInt();
        scanner.close();
        Sortable sorter;
        if (choice == 1)
        {
            sorter = new BubbleSort();
        }
        else if (choice == 2)
        {
            sorter = new SelectionSort();
        }
        else
        {
            System.out.println("Invalid choice. Exiting.");
            return;
        }
        sorter.sort(arr);
        
        System.out.println("Sorted array in ascending order:");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
