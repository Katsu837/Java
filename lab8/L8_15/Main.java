package L8_15;

import java.util.Scanner;

public class Main
{
    public static int p(int n)
    {
        if(n < 10) return n;
        else
        {
            System.out.print(n % 10 + " ");
            return p(n/10);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p(n));
    }


}
