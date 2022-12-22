package L7_78;

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
}
