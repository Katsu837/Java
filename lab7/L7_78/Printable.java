package L7_78;

public interface Printable
{
    public static void printMagazine(Printable printable[])
    {
        for (int i = 0; i < printable.length; i++)
        {
            if(printable[i].getClass() == Journal.class) System.out.print(printable[i] + "  ");
        }
    }
    public static void printBooks(Printable printable[])
    {
        for (int i = 0; i < printable.length; i++)
        {
            if(printable[i].getClass() == Books.class) System.out.print(printable[i] + "  ");
        }
    }

}
