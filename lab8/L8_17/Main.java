package L8_17;

import java.util.Scanner;

public class Main
{
    public static int max()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) return 0;
        else return Math.max(n,max());
    }

    public static void main(String[] args)
    {
        System.out.println(max());
    }
}
