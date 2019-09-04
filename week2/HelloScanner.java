import java.util.Scanner;

public class HelloScanner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name);
        keyboard.close();
    }
}