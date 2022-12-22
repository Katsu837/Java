package L9_4;

class Book extends Array
{
    int date;
    String author;

    public Book(int date, String author)
    {
        this.date = date;
        this.author = author;
    }

    public String toString()
    {
        return "Date: " + date + "; Author: " + author;
    }
}
