import BubbleSort.BubbleSort;
import SelectionSort.SelectionSort;

public class Sort
{
    public static void main(String[] args)
    {
        int[] arr = {54, 22, 10, 87, 33};

        System.out.println("Using Bubble Sort:");
        BubbleSort.sort(arr);
        printArray(arr);

        arr = new int[]{54, 22, 10, 87, 33};

        System.out.println("\nUsing Selection Sort:");
        SelectionSort.sort(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr)
    {
        for (int value : arr)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
