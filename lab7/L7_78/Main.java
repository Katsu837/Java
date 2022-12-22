package L7_78;

public class Main
{
    public static void main(String[] args)
    {
        Printable[] printable = {new Books("Война и мир", "Лев Толстой", 1863), new Journal("Esquire"), new Journal("Русский репортер")};
        System.out.println("Журналы:");
        Printable.printMagazine(printable);
        System.out.println("\n\nКниги:");
        Printable.printBooks(printable);
    }
}
