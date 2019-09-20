import java.awt.Color;

public class Pencil
{
    private double length; //inches
    private String brand;
    private boolean hasEraser;
    private boolean isMechanical;
    private Color color;

    public Pencil()
    {
        length = 6;
        brand = "Ticonderoga";
        hasEraser = true;
        isMechanical = false;
        color = Color.YELLOW;
    }

    public Pencil(double length, String brand, boolean hasEraser, boolean isMechanical, Color color)
    {
        this.length = length;
        this.brand = brand;
        this.hasEraser = hasEraser;
        this.isMechanical = isMechanical;
        this.color = color;
    }

    public void sharpen(double sharpenLength)
    {
        length -= sharpenLength;
    }

    public double getLength()
    {
        return length;
    }
}
