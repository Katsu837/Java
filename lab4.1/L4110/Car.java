package L4110;

class Car extends Vehicle
{
    private double BenzinePrice;

    public Car(int time, int BenzinePrice)
    {
        super(time, 0);
        this.BenzinePrice = BenzinePrice;
    }

    public void setBenzinePrice(double benzinePrice) {
        BenzinePrice = benzinePrice;
    }
    public double getBenzinePrice() {
        return BenzinePrice;
    }

    @Override
    public String tooString()
    {
        return "Стоимость перезда: " + BenzinePrice * time;
    }
}
