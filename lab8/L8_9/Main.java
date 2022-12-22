package L8_9;

import java.util.Scanner;

public class Main
{
    public static int zero(int a, int b)
    {
        if(a > b + 1) return 0;
        if(a == 0 | b == 0) return 1;
        return zero(a, b-1) + zero(a-1, b-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(zero(a,b));
    }
}
