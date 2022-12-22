package L6_6789;

class Journal implements Printable
{
    private String name;

    public Journal(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }

    @Override
    public void print()
    {
        System.out.println(toString());
    }
}
