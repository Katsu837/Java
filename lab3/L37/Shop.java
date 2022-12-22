package L37;

import java.util.Scanner;

public class Shop
{
    private Scanner sc = new Scanner(System.in);
    private double price;
    private int choise;

    public Shop(){}

    public double getPrice() {
        return price;
    }
    public int getChoise() {
        return choise;
    }

    public void setChoise(int choise) {
        this.choise = choise;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void Menu()
    {
        System.out.println("1.Cola   -   7 YUAN ");
        System.out.println("2.Fanta  -   7 YUAN ");
        System.out.println("3.MaxFun -  70 YUAN ");
        System.out.println("4.Ball   - 210 YUAN ");
        System.out.println("Выберете номер товара:");
        choise = sc.nextInt();
        sc.nextLine();
        switch (choise)
        {
            case 1:
                price = 7;
                break;
            case 2:
                price = 7;
                break;
            case 3:
                price = 70;
                break;
            case 4:
                price = 210;
                break;
        }
    }

    public int ChoiseCurrency()
    {
        System.out.println("Выберете валюту для оплаты:\n 1. YUAN\n 2. EURO\n 3. DOLLAR");
        choise = sc.nextInt();
        sc.nextLine();
        return choise;
    }
}
