public class PencilRunner
{
    public static void main(String[] args)
    {
        Pencil pencil = new Pencil();
        pencil.sharpen(2);
        System.out.println(pencil.getLength());
    }
}