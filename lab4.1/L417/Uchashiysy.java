package L417;

public class Uchashiysy
{
    private String fullName;
    private int clas;

    public Uchashiysy(){}

    public Uchashiysy(String fullName, int clas)
    {
        this.fullName = fullName;
        this.clas = clas;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setClas(int clas) {
        this.clas = clas;
    }

    public String getFullName() {
        return fullName;
    }
    public int getClas() {
        return clas;
    }

    public String toString()
    {
        return fullName + " " + clas;
    }
}
