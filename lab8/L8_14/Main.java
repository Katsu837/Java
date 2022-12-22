package L8_14;

import java.util.Scanner;

public class Main
{
    public static String str(int n)
    {
        if(n < 10) return Integer.toString(n);
        else return str(n/10) + " " + n%10;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(str(n));
    }
}
