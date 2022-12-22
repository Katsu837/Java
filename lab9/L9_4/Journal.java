package L9_4;

class Journal extends Array
{
    int counts;
    String name;

    public Journal(int counts, String name)
    {
        this.counts = counts;
        this.name = name;
    }

    public String toString()
    {
        return "Counts: " + counts + "; Name: " + name;
    }
}
