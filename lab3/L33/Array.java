package L33;

public class Array
{
    public static void main(String[] args)
    {
        int[] mas = new int[4];
        int flag = 0;

        for (int i = 0; i < 4; i++)
        {
            mas[i] = (int) (Math.random() * 89 + 10);
        }

        for (int i = 0; i < 4; i++)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 4; i++)
        {
            if(mas[i] >= mas[i+1])
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
        {
            System.out.println("Массив не строго возрастающий");
        }
        else
        {
            System.out.println("Массив строго возрастающий");
        }

    }
}
