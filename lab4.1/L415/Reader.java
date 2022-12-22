package L415;

public class Reader
{
    private String fullname;
    private int readerNum;
    private String fakultet;
    private int bornDate;
    private int phoneNum;

    public Reader(){}
    public Reader(String fullname, int readerNum, String fakultet, int bornDate, int phoneNum)
    {
        this.fullname = fullname;
        this.readerNum = readerNum;
        this.fakultet = fakultet;
        this.bornDate = bornDate;
        this.phoneNum =phoneNum;
    }

    public String takeBook()
    {
        return fullname + "взял книгу";
    }

    public String returnBook()
    {
        return fullname + "вернул книгу";
    }
}
