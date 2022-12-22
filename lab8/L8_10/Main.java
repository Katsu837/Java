package L8_10;

import java.util.Scanner;

public class Main
{
    public static int reverse(int n, int i)
    {
        return (n == 0) ? i : reverse(n/10, i*10 + n%10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n,0));
    }
}
