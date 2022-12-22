package L416;

class Manager extends Employer
{
    private int averageSum;

    public Manager(String fullName, int income, int averageSum)
    {
        super(fullName, income);
        this.averageSum = averageSum;
    }

    public int getIncome()
    {
        return super.getIncome() + averageSum;
    }
}
