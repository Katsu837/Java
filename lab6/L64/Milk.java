package L64;

public class Milk implements Pricable
{
    private int countMilk;
    private int priceMilk;

    @Override
    public String getPrice()
    {
        return "Цена молока за литр - " + priceMilk;
    }
}
