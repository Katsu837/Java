package L8_11;

import java.util.Scanner;

public class Main
{
    public static int count()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1)
        {
            int m = sc.nextInt();
            if(m == 1) return count() + n + m;
            else
            {
                int k = sc.nextInt();
                if(k == 1) return count() + n + m + k;
                else return n + m + k;
            }
        }
        else
        {
            int m = sc.nextInt();
            if(m == 1) return count() + n + m;
            else return n + m;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(count());
    }
}

