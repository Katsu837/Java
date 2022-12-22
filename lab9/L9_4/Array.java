package L9_4;

class Array implements Comparable
{
    Book[] masB = new Book[5];
    Journal[] masJ = new Journal[5];

    public Array()
    {
        for (int i = 0; i < 5; i++) masB[i] = new Book(1900+i, "Author " + i);
        for (int i = 0; i < 5; i++) masJ[i] = new Journal(1000+i, "Name " + i);
    };

    @Override
    public boolean compareTo(Comparable x, Comparable y)
    {
        if(x.getClass() == Book.class & y.getClass() == Book.class)
        {
            if(((Book) x).date > ((Book) y).date) return true;
            else return false;
        }
        else
        {
            if(((Journal) x).counts > ((Journal) y).counts) return true;
            else return false;
        }
    }

    @Override
    public void bubbleSort(Comparable[] mas)
    {
        Comparable temp;
        for (int i = 0; i < mas.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if(compareTo(mas[j], mas[j+1]))
                {
                    temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }
        }
    }

    public void to_string()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(masB[i].toString());
        }
        System.out.println();
        for (int i = 0; i < 5; i++)
        {
            System.out.println(masJ[i].toString());
        }
    }
}
