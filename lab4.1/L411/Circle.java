package L411;

class Circle extends Shape
{
    private double r;

    public Circle()
    {
        super();
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getType()
    {
        return "String";
    }

    public double getArea()
    {
        return r*r*Math.PI;
    }

    public double getPerimeter()
    {
        return 2*r*Math.PI;
    }
}
