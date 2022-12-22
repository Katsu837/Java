package L6_6789;

class Books implements Printable
{
    private String name;
    private String author;
    private int date;

    public Books(String name, String author, int date)
    {
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public String toString()
    {
        return name + " " + author + " " + date;
    }

    @Override
    public void print()
    {
        System.out.println(toString());
    }
}
