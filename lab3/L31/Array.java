package L31;

import java.util.Random;

public class Array
{
    public static void main(String[] args)
    {
        float[] mas = new float[10];
        float[] mas2 = new float[10];
        float a;
        Random random = new Random();

        for (int i = 0; i < 10; i++)
        {
            mas[i] = random.nextFloat(100);
        }

        for (int i = 0; i < 10; i++)
        {
            mas2[i] =(float) (Math.random() * 100);
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10 - i - 1; j++)
            {
                if(mas[j] > mas[j+1])
                {
                    a = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = a;
                }
            }
        }

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10 - i - 1; j++)
            {
                if(mas2[j] > mas2[j+1])
                {
                    a = mas2[j];
                    mas2[j] = mas2[j+1];
                    mas2[j+1] = a;
                }
            }
        }


        for (int i = 0; i < 10; i++)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            System.out.print(mas2[i] + " ");
        }
    }
}
