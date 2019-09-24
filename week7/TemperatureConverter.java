public class TemperatureConverter
{
    private double temperature;
    private boolean isCelsius;

    public TemperatureConverter(double celsius)
    {
        temperature = celsius;
        isCelsius = true;
    }

    public void convertToF()
    {
        if (isCelsius)
        {
            temperature = (temperature * 9 / 5) + 32;
            isCelsius = false;
        }
    }

    public void convertToC()
    {
        if (!isCelsius)
        {
            temperature = (temperature - 32) * 5 / 9;
            isCelsius = true;
        }
    }

    public String toString()
    {
        String result = "The current temperature is " + temperature + " degrees";
        if (isCelsius)
        {
            result += " Celsius";
        }
        else
        {
            result += " Fahrenheit";
        }
        return result;
    }

    public static void main(String[] args)
    {
        TemperatureConverter myTemp = new TemperatureConverter(25.6);
        System.out.println(myTemp);
        myTemp.convertToF();
        System.out.println(myTemp);
        myTemp.convertToC();
        System.out.println(myTemp);
    }
}