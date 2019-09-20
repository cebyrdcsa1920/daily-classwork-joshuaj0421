public class Highway
{
    private int numberOfLanes;
    private boolean isDivided;
    private String name;
    private double length; //miles

    public Highway()
    {
        numberOfLanes = 4;
        isDivided = true;
        name = "Jeffrey";
        length = 126.3;
    }

    public Highway(int numberOfLanes, boolean isDivided, String name, double length)
    {
        this.numberOfLanes = numberOfLanes;
        this.isDivided = isDivided;
        this.name = name;
        this.length = length;
    }

    public void drive(double distance)
    {
        length -= distance;
    }

    public double getHighwayLeft()
    {
        return length;
    }

}
