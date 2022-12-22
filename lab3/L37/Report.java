package L37;

import java.util.Scanner;

public class Report
{
    public Report(){}
    private Employee[] mas = new Employee[5];
    private Scanner sc = new Scanner(System.in);

    public void addMas()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Введите фИО сотрудника и его оклад");
            mas[i] = new Employee();
            mas[i].setFullname(sc.nextLine());
            mas[i].setSalry(sc.nextDouble());
            sc.nextLine();
        }
    }

    public void generateReport()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("%s", mas[i].getFullname());
            System.out.printf("%20s", Double.toString(mas[i].getSalry()));
            System.out.println();
        }
    }
}
