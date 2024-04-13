import java.util.ArrayList;
import java.util.List;
public class AppQ3 
{
    public static void printEvenNumbers(List<Integer> numbers) 
    {
        System.out.println("Even numbers in the list:");
        for (int num : numbers) 
        {
            if (num % 2 == 0) 
            {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) 
    {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(180);
        numberList.add(5);
        numberList.add(89);
        numberList.add(13);
        numberList.add(27);
        numberList.add(72);
        numberList.add(234);
        numberList.add(24543);
        numberList.add(56);
        numberList.add(45);
        printEvenNumbers(numberList);
    }
}