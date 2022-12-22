package L610;

public class Monitor
{
    private int inch;
    private int monGh;

    public int getMonGh() {
        return monGh;
    }
    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
    public void setMonGh(int monGh) {
        this.monGh = monGh;
    }

    public String toString()
    {
        return "Монитор " + inch + " дюймов; герцовка монитора: " + monGh;
    }
}
