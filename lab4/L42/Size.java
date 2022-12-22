package L42;

public class Size
{
    public enum Sizes
    {
        XXS (32),
        XS (34),
        S (36),
        M (38),
        L (40)
        ;

        private final int EuroSize;
        private Sizes(int EuroSize)
        {
            this.EuroSize = EuroSize;
        }
    }

    public String getDescripton(Sizes sizes)
    {
        if(sizes == Sizes.XXS) return "Детский размер";
        else return "Взрослый размер";
    }

    public void menClothing()
    {
        enum Cloth
        {
            Tshirt,
            Tie,
            Jacket,
            Coat
        }

        System.out.println("Мужская одежда:");
        for (Cloth cloth : Cloth.values())
        {
            System.out.println(cloth.toString() + " ");
        }
    }

    public void womenClothing()
    {
        enum Cloth
        {
            Blouse,
            Skirt,
            Topics,
            Coat
        }

        System.out.println("Женская одежда:");
        for (Cloth cloth : Cloth.values())
        {
            System.out.println(cloth.toString() + " ");
        }
    }

}
