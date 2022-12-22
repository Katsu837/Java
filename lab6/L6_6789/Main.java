package L6_6789;

public class Main
{
    public static void main(String[] args)
    {
        Printable[] printable = {new Books("Война и мир", "Лев Толстой", 1863), new Journal("Esquire"), new Journal("Русский репортер")};

        for (int i = 0; i < printable.length; i++)
        {
            printable[i].print();
        }
    }
}