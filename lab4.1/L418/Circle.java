package L418;

class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea()
    {
        return radius * radius * Math.PI;
    }

    @Override
    double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    @Override
    String tooString()
    {
        return "Радиус: " + radius + "; Цвет: " + color + ";";
    }
}
