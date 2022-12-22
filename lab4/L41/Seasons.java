package L41;

public class Seasons
{
    public enum Season
    {
        Summer (25),
        Fall (10),
        Winter (-10),
        Spring (15)
        ;
        private final int seasonTemp;
        private Season (int seasonTemp)
        {
            this.seasonTemp  = seasonTemp;
        }
        public int getSeasonTemp() {
            return seasonTemp;
        }
    }

    private Season season;

    public Season getSeason() {
        return season;
    }
    public void setSeason(Season season) {
        this.season = season;
    }

    public void iLike(Season season1)
    {
        switch (season1)
        {
            case Winter: System.out.println("Я люблю зиму!"); break;
            case Fall: System.out.println("Я люблю осень!"); break;
            case Summer: System.out.println("Я люблю лето!"); break;
            case Spring: System.out.println("Я люблю весну!"); break;
        }
    }

    public String detDescription()
    {
        if (season == Season.Winter) return "Холодное время года";
        else if (season == Season.Summer) return "Теплое время года";
        else return "";
    }

    public void out()
    {
        for (Season season : Season.values())
        {
            System.out.println(season + " средняя температура равна: " + season.seasonTemp);
        }
    }
}
