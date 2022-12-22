package L8_13;

import java.util.Scanner;

public class Main
{
    public static void odd()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0)
        {
            int m = sc.nextInt();
            System.out.println(n);
            if(m > 0) odd();
        }
    }

    public static void main(String[] args)
    {
        odd();
    }
}
