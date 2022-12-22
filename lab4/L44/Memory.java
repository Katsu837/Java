package L44;

public class Memory
{
    private int ramGh;
    private int valumeRam;

    public Memory(){}

    public int getRamGh() {
        return ramGh;
    }
    public int getValumeRam() {
        return valumeRam;
    }

    public void setRamGh(int ramGh) {
        this.ramGh = ramGh;
    }
    public void setValumeRam(int valumeRam) {
        this.valumeRam = valumeRam;
    }

    public String toString()
    {
        return "Объем памяти: " + valumeRam + "; частота работы памяти: " + ramGh;
    }

}

