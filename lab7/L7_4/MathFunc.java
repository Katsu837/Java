package L7_4;

class MathFunc implements MathCalculable
{
    private int radius = 15;
    private String complexNum = "5 + 4i";

    MathFunc(int radius)
    {
        this.radius = radius;
    }

    @Override
    public double inDegree(int degree)
    {
        return Math.pow(radius, degree);
    }

    @Override
    public int modComplexNum(String complexNum)
    {
        String first[] = complexNum.split(" ", 2);
        return Integer.parseInt(first[0]);
    }

    public double CircleArea()
    {
        return radius*radius*MathCalculable.pi;
    }
}
