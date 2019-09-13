public class PetRunner
{
    public static void main(String[] args)
    {
        Pet myDog = new Pet();
        myDog.eat(12.6);
        System.out.println(myDog.getWeight());
    }
}