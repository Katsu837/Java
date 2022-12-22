package L417;

class Student extends Uchashiysy
{
    private String fakultet;
    public Student(String fakultet)
    {
        super();
        this.fakultet = fakultet;
    }

    public String toString()
    {
        return super.toString() + " курс, " + fakultet;
    }
}
