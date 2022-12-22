package L8_12;

import java.util.Scanner;

public class Main
{
    public static void odd()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0)
        {
            if(n % 2 == 1)
            {
                System.out.println(n);
                odd();
            }
            else odd();
        }
    }

    public static void main(String[] args)
    {
        odd();
    }
}
