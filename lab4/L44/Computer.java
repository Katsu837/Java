package L44;

import java.util.Scanner;

public class Computer
{
    private enum namePC
    {
        Asus,
        Acer,
        Lenovo,
        HP,
        Huawei,
        Mac
    }
    Memory memory = new Memory();
    Monitor monitor = new Monitor();
    Processor processor = new Processor();
    private Scanner sc = new Scanner(System.in);

    String str;
    public Computer(){}

    public void addComputer()
    {
        System.out.println("Введите название процессора и его тактовую частоту:");
        processor.setName(sc.nextLine());
        processor.setProcGh(sc.nextInt());
        sc.nextLine();

        System.out.println("Введите размер монитора (в дюймах) и герцовку экрана:");
        monitor.setInch(sc.nextInt());
        monitor.setMonGh(sc.nextInt());
        sc.nextLine();

        System.out.println("Введите объем оперативной памяти и ее частоту:");
        memory.setValumeRam(sc.nextInt());
        memory.setRamGh(sc.nextInt());
        sc.nextLine();
    }

    public void choiseName()
    {
        int i = 1;
        int choice = 0;
        System.out.println("Выберете название компьютера из предложенного списка:");
        for (namePC namepc : namePC.values())
        {
            System.out.println(i + ". " + namepc.toString());
            i++;
        }
        choice = sc.nextInt();

        i = 0;
        for (namePC namepc : namePC.values())
        {
            i++;
            if(choice == i)
            {
                str = namepc.toString();
                break;
            }
        }
    }


    public String toString()
    {
        return "Название компьютера: " + str + "\n" + processor.toString() + "\n" + memory.toString() + "\n" + monitor.toString();
    }
}
