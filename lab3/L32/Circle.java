package L32;

public class Circle
{
    private Point point = new Point();
    private double r = 0.0;

    public Circle(){}

    public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
    public Point getPoint() {
        return point;
    }

    public double CircleLen()
    {
        return r*2*Math.PI;
    }

    public String toString()
    {
        return "X = " + point.getX() + "; Y = " + point.getY() + "; R = " + r;
    }
}
