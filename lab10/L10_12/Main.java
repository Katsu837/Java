package L10_12;

public class Main
{
    public static void main(String[] args)
    {
        idNumber num = new idNumber(3);
        idNumber mun = new idNumber(5);

        num.to_string();
        System.out.println("Сортировка слиянием");
        num.mergeSort(num.mas,0,2);
        num.to_string();


        mun.to_string();
        System.out.println("Быстрая сортировка");
        mun.quickSort(mun.mas, 0, 4);
        mun.to_string();
    }
}
