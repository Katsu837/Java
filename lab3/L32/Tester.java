package L32;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count, mini, maxi;
        double min = 1000000000, max = 0;
        System.out.println("Введите количество окружностей");
        count = sc.nextInt();
        Circle[] mas = new Circle[count];

        for (int i = 0; i < count; i++)
        {
            Circle circle = new Circle();
            Point point = new Point();
            System.out.println("Введите координаты x,y:");
            circle.setR(Math.random() * 100);
            if(circle.getR() < min) mini = count;
            if (circle.getR() > max) maxi = count;
            point.setX(sc.nextDouble());
            point.setY(sc.nextDouble());
            circle.setPoint(point);
            mas[i] = circle;
        }

        for (int i = 0; i < count; i++)
        {
            System.out.println(mas[i].toString());
        }

        for (int i = 0; i < count; i++)
        {
            for (int j = 0; j < count - i -1; j++)
            {
                if(mas[j].getR() > mas[j+1].getR())
                {
                    Circle circle1 = new Circle();
                    circle1 = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = circle1;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < count; i++)
        {
            System.out.println(mas[i].toString());
        }
    }
}
