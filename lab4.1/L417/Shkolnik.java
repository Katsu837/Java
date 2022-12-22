package L417;

class Shkolnik extends Uchashiysy
{
    private String direction;

    public Shkolnik(String direction)
    {
        super();
        this.direction = direction;
    }

    public String toString()
    {
        return super.toString() + " класс, " + direction;
    }

}
