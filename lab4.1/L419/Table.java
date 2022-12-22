package L419;

class Table extends Furniture
{
    private double hight;

    public Table (String type, double hight, String material, int price)
    {
        super(material, price, type);
        this.hight = hight;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setHight(double hight) {
        this.hight = hight;
    }

    public String getType() {
        return type;
    }
    public double getHight() {
        return hight;
    }

    @Override
    public String tooString()
    {
        return "Тип стола: " + type + "; Высота стола: " + hight + "; Материал стола: " + material + "; Цена стола: " + price;
    }
}
