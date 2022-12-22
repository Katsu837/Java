package L34;

import java.util.ArrayList;
import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {
        int count = 16;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, больше чем 15");
        do
        {
            if(count <= 15) System.out.println("Число меньше 15, повторите ввод");
            count = sc.nextInt();
        }while (count <= 15);
        int[] mas = new int[count];
        ArrayList<Integer> masch = new ArrayList();

        for (int i = 0; i < count; i++)
        {
            mas[i] =(int) (Math.random() * 100);
        }

        for (int i = 0; i < count; i++)
        {
            if (mas[i] % 2 == 0) masch.add(mas[i]);
        }

        for (int i = 0; i < count; i++)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < masch.size(); i++)
        {
            System.out.print(masch.get(i) + " ");
        }
    }
}
