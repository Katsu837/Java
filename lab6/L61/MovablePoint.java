package L61;

class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
