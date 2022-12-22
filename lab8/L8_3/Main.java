package L8_3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 0; i < Math.abs(a-b) + 1; i++)
        {
            if(a < b) System.out.print((i+a) + " ");
            if(a > b) System.out.print((a-i) + " ");
        }
    }
}
