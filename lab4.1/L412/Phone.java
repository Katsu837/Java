package L412;

public class Phone
{
    private String number;
    private String model;
    private String weight;

    public Phone(){}
    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, String weight)
    {
        this.weight = weight;
        new Phone(number, model);
    }

    public String receiveCall(String name)
    {
        return "Звонит " + name;
    }

    public String getNumber() {
        return number;
    }

    public String receiveCall(String name, String number)
    {
        return "Звонит " + name + ": " + number;
    }

    public void sendMassage(String i, String...j)
    {
        for(String x : j)
        {
            System.out.println(x + " ");
        }
    }
}
