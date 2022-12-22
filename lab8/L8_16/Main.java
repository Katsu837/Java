package L8_16;

import java.util.Scanner;

public class Main
{
    public static void countMax(int max, int count)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0)
        {
            if(n > max) countMax(n,1);
            else if(n == max) countMax(n, count+1);
            else countMax(max, count);
        }
        else System.out.println(count);
    }

    public static void main(String[] args)
    {
        countMax(0,0);
    }
}
