package L418;

class Square extends Rectangle
{
    private double side;

    public Square()
    {
        super();
    }

    public Square(double side)
    {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public void setHight(double side) {
        super.setHight(side);
    }
    @Override
    public void setWight(double side) {
        super.setWight(side);
    }

    @Override
    String tooString()
    {
        return "Сторона: " + side + "; Цвет: " + color;
    }
}
