package L418;

public abstract class Shape
{
    protected String color;
    protected boolean filled = true;

    public Shape(){}
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }

    abstract String tooString();
    abstract double getArea();
    abstract double getPerimeter();
}
