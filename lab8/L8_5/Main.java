package L8_5;

import java.util.Scanner;

public class Main
{
    public static int sumer(int N)
    {
        if(N > 0) return N % 10 +sumer(N / 10);
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sumer(N));
    }
}
