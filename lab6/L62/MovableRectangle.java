package L62;

class MovableRectangle extends MovablePoint implements Movable
{
    MovablePoint topLeft = new MovablePoint(x,y,xSpeed, ySpeed);
    MovablePoint bottomRight = new MovablePoint(x,y,xSpeed, ySpeed);

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed)
    {
        super(x,y,xSpeed,ySpeed);
    }

    public String toString()
    {
        return "Координата верхней левой точки по x - " + topLeft.getX() + "\n" + "Координата верхней левой точки по y - " + topLeft.getY() + "\n" + "Координата нижней правой точки по x - " + bottomRight.getX() + "\n" + "Координата нижней правой точки по y - " + bottomRight.getY();
    }

    @Override
    public void moveUp()
    {
        if(topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed)
            if(ySpeed > 0) System.out.println("Скорость по у положительная");
    }
    @Override
    public void moveDown()
    {
        if(topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed)
            if(ySpeed < 0) System.out.println("Скорость по у отрицательная");
    }
    @Override
    public void moveLeft()
    {
        if(topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed)
            if(xSpeed < 0) System.out.println("Скорость по х отрицательная");
    }
    @Override
    public void moveRight()
    {
        if(topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed)
            if(xSpeed > 0) System.out.println("Скорость по х положительная");
    }
}
