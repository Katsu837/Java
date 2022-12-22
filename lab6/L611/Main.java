package L611;

class Main implements Convertable
{
    private int degreesCelcia;

    @Override
    public String convert()
    {
        return "Цельсия в Фаренгейты: " + degreesCelcia + " -> " + (degreesCelcia * 1.8 + 32) + "\n"
                + "Цельсия в Кельвины: " + degreesCelcia + " -> " + (degreesCelcia + 273.15);
    }
}
