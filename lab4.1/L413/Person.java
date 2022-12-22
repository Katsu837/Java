package L413;

public class Person
{
    private String fullName;
    private int age;

    public Person(){}
    public Person(String fullName, int age)
    {
        this.fullName = fullName;
        this.age = age;
    }

    public String move()
    {
        return fullName + " (Возраст: " + age + ") идет";
    }

    public String talk()
    {
        return fullName + " (Возраст: " + age + ") говорит";
    }


}
