package L44;

public class Processor
{
    private String name;
    private int procGh;

    public Processor(){}

    public String getName() {
        return name;
    }
    public int getProcGh() {
        return procGh;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setProcGh(int procGh) {
        this.procGh = procGh;
    }

    public String toString()
    {
        return "Название поцессора: " + name + "; частота работы поцессора: " + procGh;
    }
}
