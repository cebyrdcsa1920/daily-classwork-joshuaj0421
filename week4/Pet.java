import java.awt.Color;

public class Pet
{
    private Color color;
    private int legs;
    private double weight;
    private String species;

    public Pet()
    {
        color = Color.DARK_GRAY;
        legs = 4;
        weight = 43.2;
        species = "Dog";
    }

    public Pet(Color color, int legs, double weight, String species)
    {
        this.color = color;
        this.legs = legs;
        this.weight = weight;
        this.species = species;
    }

    public void eat(double food)
    {
        weight += food;
    }

    public double getWeight()
    {
        return weight;
    }
}

