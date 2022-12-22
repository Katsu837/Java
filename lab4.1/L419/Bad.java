package L419;

class Bad extends Furniture
{
    private double area;
    private double hight;

    public Bad(double area, double hight, String material, int price, String type)
    {
        super(material, price, type);
        this.area = area;
        this.hight = hight;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getArea() {
        return area;
    }
    public double getHight() {
        return hight;
    }

    @Override
    public String tooString()
    {
        return "Тип кровати: " + type + "; Площадь кровати: " + area + "; Высота кровати: " + hight + "; Материал кровати: " + material + "; Цена кровати: " + price;
    }
}
