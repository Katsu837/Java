package L35;

import java.util.Scanner;

public class UseDouble
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x и c");

        Double x = Double.valueOf(sc.nextDouble());
        Double c = Double.valueOf(sc.nextDouble());

        Double o = Double.parseDouble("34,56");

        byte q = Byte.valueOf(Double.toString(c));
        short w = Short.valueOf(Double.toString(c));
        int e = Integer.valueOf(Double.toString(c));
        long r = Long.valueOf(Double.toString(c));
        float t = Float.valueOf(Double.toString(c));
        //boolean u = Boolean.valueOf(Double.toString(c));
        //char i = (Double.toString(c)).charAt(1);

        //System.out.println(q + " " + w + " " + e + " " + r + " " + t + " "); //+ u + " " + i);

        Double j = Double.valueOf(Double.toString(3.14));
        System.out.println(j);

    }
}