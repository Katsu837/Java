package L41;

import java.util.Scanner;

public class Testet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Seasons seasons = new Seasons();
        System.out.println("Введите любимое время года:");
        String str = sc.nextLine();
        Seasons.Season season1;

        if(str.equals("Лето")) season1 = Seasons.Season.Summer;
        else if(str.equals("Зима")) season1 = Seasons.Season.Winter;
        else if(str.equals("Весна")) season1 = Seasons.Season.Spring;
        else season1 = Seasons.Season.Fall;


        seasons.iLike(season1);
        seasons.setSeason(season1);
        System.out.println(seasons.detDescription());
        seasons.out();
    }
}
