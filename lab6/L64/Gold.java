package L64;

public class Gold implements Pricable
{
    private int goldPrice;

    @Override
    public String getPrice()
    {
        return "Цена золота за грамм - " + goldPrice;
    }
}
