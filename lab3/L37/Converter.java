package L37;

import java.util.Scanner;

public class Converter
{
    private Scanner sc = new Scanner(System.in);

    private double input;

    public Converter(double Input)
    {
        this.input = input;
    }
    public Converter(){}

    public double getInput() {
        return input;
    }
    public void setInput(double input) {
        this.input = input;
    }

    public double toEuro()
    {
        return input / 7.04;
    }

    public double toDollar()
    {
        return input / 6.93;
    }

}
