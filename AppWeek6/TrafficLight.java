public class TrafficLight
{
    
    private String color;
    private int duration;

    public TrafficLight(String initialColor, int initialDuration)
    {
        color = initialColor;
        duration = initialDuration;
    }

    public void changeColor(String newColor, int newDuration)
    {
        color = newColor;
        duration = newDuration;
    }

    public boolean isRed()
    {
        return color.equals("Red");
    }

    public boolean isGreen()
    {
        return color.equals("Green");
    }

    public String getColor()
    {
        return color;
    }

    public int getDuration()
    {
        return duration;
    }

    public static void main(String[] args)
    {
        TrafficLight trafficLight = new TrafficLight("Red", 30);

        System.out.println("Initial Color: " + trafficLight.getColor());
        System.out.println("Initial Duration: " + trafficLight.getDuration() + " seconds");

        trafficLight.changeColor("Green", 20);

        System.out.println("New Color: " + trafficLight.getColor());
        System.out.println("New Duration: " + trafficLight.getDuration() + " seconds");

        if (trafficLight.isRed())
        {
            System.out.println("The traffic light is currently Red.");
        }
        else if (trafficLight.isGreen())
        {
            System.out.println("The traffic light is currently Green.");
        }
        else
        {
            System.out.println("The traffic light is in an unknown state.");
        }
    }
}
