import java.util.Scanner;

interface Resizable 
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable
{
    private int width;
    private int height;
    
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    
    public void resizeWidth(int width) 
    {
        if (width > 0)
        {
            this.width = width;
        } 
        else 
        {
            System.out.println("Width must be greater than 0.");
        }
    }
    
    public void resizeHeight(int height)
    {
        if (height > 0) 
        {
            this.height = height;
        } 
        else 
        {
            System.out.println("Height must be greater than 0.");
        }
    }
    
    public void displayDimensions()
    {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the initial width of the rectangle: ");
        int initialWidth = scanner.nextInt();
        
        System.out.print("Enter the initial height of the rectangle: ");
        int initialHeight = scanner.nextInt();
        
        Rectangle rectangle = new Rectangle(initialWidth, initialHeight);

        System.out.println("Initial dimensions of the rectangle:");
        rectangle.displayDimensions();
        
        System.out.print("Enter the new width for resizing: ");
        int newWidth = scanner.nextInt();
        rectangle.resizeWidth(newWidth);
        
        System.out.print("Enter the new height for resizing: ");
        int newHeight = scanner.nextInt();
        rectangle.resizeHeight(newHeight);
        
        System.out.println("Dimensions of the resized rectangle:");
        rectangle.displayDimensions();
        scanner.close();
    }
}
