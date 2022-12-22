package L37;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        Locale localeGer = new Locale("Ger");
        Locale localeUsa = new Locale("USA");
        Locale.setDefault(Locale.CHINA);

        //CONVERTER
        System.out.println("Введите сумму в Юанях:");
        double input = sc.nextDouble();
        sc.nextLine();
        Converter converter = new Converter(input);
        converter.setInput(input);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        NumberFormat numberFormatUsa = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatFra = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Денежная еденица в текущей валюте: " + numberFormat.format(input));
        System.out.println("Денежная еденица в валюте - Доллар: " + numberFormatUsa.format(converter.toDollar()));
        System.out.println("Денежная еденица в валюте - Евро: " + numberFormatFra.format(converter.toEuro()));

        System.out.println("\n");

        //SHOP
        shop.Menu();
        converter.setInput(shop.getPrice());
        switch (shop.ChoiseCurrency())
        {
            case 1:
                System.out.println("Cтоимость в Юанях: " + numberFormat.format(converter.getInput()));
                break;
            case 2:
                System.out.println("Cтоимость в Евро: " + numberFormatFra.format(converter.toEuro()));
                break;
            default:
                System.out.println("Cтоимость в Долларах: " + numberFormatUsa.format(converter.toDollar()));
                break;
        }

        System.out.println("\n");

        //Otchet
        Report report = new Report();
        report.addMas();
        System.out.println();
        report.generateReport();

    }
}
