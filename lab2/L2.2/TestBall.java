package Lab2;

import java.util.Scanner;

public class TestBall
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x, y, xDisp, yDisp;
        System.out.println("Введите начальное положение мяча (координату x и y):");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Ball ball = new Ball();
        Ball ball2 = new Ball(x,y);

        System.out.println("Введите изменение координаты по x: ");
        xDisp = sc.nextDouble();
        System.out.println("Введите изменение координаты по y: ");
        yDisp = sc.nextDouble();

        ball.move(xDisp, yDisp);
        ball2.move(xDisp, yDisp);

        System.out.println(ball2.toString());
        System.out.println(ball.toString());
    }
}
