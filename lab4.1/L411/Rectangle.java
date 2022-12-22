package L411;

class Rectangle extends Shape
{
    private double a;
    private double b;

    public Rectangle()
    {
        super();
    }

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }

    public String getType()
    {
        return "Rectangle";
    }

    public double getArea()
    {
        return a*b;
    }

    public double getPerimeter()
    {
        return a+b+a+b;
    }
}
