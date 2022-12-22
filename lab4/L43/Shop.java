package L43;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main(String[] args)
    {
        int choise = 0, choise1 = 0, sum = 0;
        ArrayList<String> mas = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        enum product
        {
            Vegetables,
            Dairy,
            Bakery
        }

        enum Vegetables
        {
            carrot (30),
            potato (50),
            onion (40),
            cucumber (35)
            ;
            final int price;
            Vegetables(int price)
            {
                this.price = price;
            }
        }

        enum Dairy
        {
            milk (60),
            yogurt (30),
            cheese (100)
            ;
            final int price;
            Dairy (int price)
            {
                this.price = price;
            }
        }

        enum Bakery
        {
            bread (20),
            donut (40),
            bun (15)
            ;
            final int price;
            Bakery (int price)
            {
                this.price = price;
            }
        }
    do {
        System.out.println("Введите номер нужного каталога:");
        System.out.println("1." + product.Vegetables.toString());
        System.out.println("2." + product.Dairy.toString());
        System.out.println("3." + product.Bakery.toString());
        System.out.println("4. Выйти из магазина");
        choise = sc.nextInt();

        switch (choise)
        {
            case 3:
                System.out.println("Каталог товаров Овощи:");
                System.out.println("1." + Bakery.bread.toString() + "  -  " + Bakery.bread.price);
                System.out.println("2." + Bakery.donut.toString() + "  -  " + Bakery.donut.price);
                System.out.println("3." + Bakery.bun.toString() + "  -  " + Bakery.bun.price);
                System.out.println("4. Выйти из каталога");
                choise1 = sc.nextInt();
                switch (choise1)
                {
                    case 1:
                        sum = sum + Bakery.bread.price;
                        break;
                    case 2:
                        sum = sum + Bakery.donut.price;
                        break;
                    case 3:
                        sum = sum + Bakery.bun.price;
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Каталог товаров Овощи:");
                System.out.println("1." + Dairy.milk.toString() + "  -  " + Dairy.milk.price);
                System.out.println("2." + Dairy.yogurt.toString() + "  -  " + Dairy.yogurt.price);
                System.out.println("3." + Dairy.cheese.toString() + "  -  " + Dairy.cheese.price);
                System.out.println("4. Выйти из каталога");
                choise1 = sc.nextInt();
                switch (choise1)
                {
                    case 1:
                        sum = sum + Dairy.milk.price;
                        break;
                    case 2:
                        sum = sum +  Dairy.yogurt.price;
                        break;
                    case 3:
                        sum = sum + Dairy.cheese.price;
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                System.out.println("Каталог товаров Молочные продукты:");
                System.out.println("1." + Vegetables.carrot.toString() + "  -  " + Vegetables.carrot.price);
                System.out.println("2." + Vegetables.potato.toString() + "  -  " + Vegetables.potato.price);
                System.out.println("3." + Vegetables.onion.toString() + "  -  " + Vegetables.onion.price);
                System.out.println("4." + Vegetables.cucumber.toString() + "  -  " + Vegetables.cucumber.price);
                System.out.println("5. Выйти из каталога");
                choise1 = sc.nextInt();
                switch (choise1)
                {
                    case 1:
                        sum = sum + Vegetables.carrot.price;
                        break;
                    case 2:
                        sum = sum + Vegetables.potato.price;
                        break;
                    case 3:
                        sum = sum + Vegetables.onion.price;
                        break;
                    case 4:
                        sum = sum + Vegetables.cucumber.price;
                        break;
                    default:
                        break;
                }
                break;
        }
    }while(choise != 4);

        System.out.println("Итоговая сумма:" + sum);
    }
}
