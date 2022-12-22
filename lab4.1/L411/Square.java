package L411;

public class Square
{
    private double a;

    public Square()
    {
        super();
    }

    public String getType()
    {
        return "Square";
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea()
    {
        return a*a;
    }

    public double getPerimeter()
    {
        return 2*a;
    }
}
