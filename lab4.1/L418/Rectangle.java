package L418;

class Rectangle extends Shape
{
    protected double wight;
    protected double hight;

    public Rectangle(){}
    public Rectangle(double wight, double hight)
    {
        super();
        this.hight = hight;
        this.wight = wight;
    }

    public Rectangle(double wight, double hight, String colore, boolean filled)
    {
        super(colore, filled);
        this.hight = hight;
        this.wight = wight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHight() {
        return hight;
    }
    public double getWight() {
        return wight;
    }

    @Override
    double getArea()
    {
        return wight * hight;
    }

    @Override
    double getPerimeter()
    {
        return wight * 2 + hight * 2;
    }

    @Override
    String tooString()
    {
        return "Высота: " + hight + "; Ширина: " + wight + "; Цвет: " + color;
    }
}
