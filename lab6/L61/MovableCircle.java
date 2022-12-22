package L61;

class MovableCircle extends MovablePoint implements Movable
{
    private int radius;
    MovablePoint center = new MovablePoint(x,y,xSpeed,ySpeed);
    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius)
    {
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public String toString()
    {
        return "Координата по x - " + x + "\n" + "Координата по y - " + y + "\n" + "Скорость по х - " + xSpeed + "\n" + "Cкорость по у - " + ySpeed;
    }

    @Override
    public void moveUp()
    {
        if(ySpeed > 0) System.out.println("Скорость по у положительная");
    }
    @Override
    public void moveDown()
    {
        if(ySpeed < 0) System.out.println("Скорость по у отрицательная");
    }
    @Override
    public void moveLeft()
    {
        if(xSpeed < 0) System.out.println("Скорость по х отрицательная");
    }
    @Override
    public void moveRight()
    {
        if(xSpeed > 0) System.out.println("Скорость по х положительная");
    }
}
