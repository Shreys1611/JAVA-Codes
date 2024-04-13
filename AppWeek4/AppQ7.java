public class AppQ7 
{
    public static void main(String[] args) 
    {
        for (int i = 100; i <= 400; i++) 
        {
            if (isEvenDigitNumber(i)) 
            {
                System.out.print(i + ", ");
            }
        }
    }
    
    public static boolean isEvenDigitNumber(int n) 
    {
        while (n > 0) 
        {
            int digit = n % 10;
            if (digit % 2 != 0) 
            {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}