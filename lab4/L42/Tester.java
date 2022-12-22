package L42;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Size size = new Size();
        Size.Sizes sizes = Size.Sizes.XS;
        int sizer;
        String str;

        System.out.println("Введите свой размер: 32, 34, 36, 38, 40");
        sizer = sc.nextInt();

        switch (sizer)
        {
            case 32:
                sizes = Size.Sizes.XXS;
                break;
            case 34:
                sizes = Size.Sizes.XS;
                break;
            case 36:
                sizes = Size.Sizes.S;
                break;
            case 38:
                sizes = Size.Sizes.M;
                break;
            case 40:
                sizes = Size.Sizes.L;
                break;
            default:
                System.out.println("Такого размера нет!");
                break;
        }

        System.out.println(size.getDescripton(sizes));
        sc.nextLine();
        System.out.println("Выберете отдел: Мужской или Женский");
        str = sc.nextLine();
        if(str.equals("Мужской"))
        {
            size.menClothing();
        }
        else size.womenClothing();
    }
}
