package L10_12;

public class Student
{
    private String name;
    private String secondName;
    private int speciality;
    private int course;
    private int groupe;
    private int sum;

    public Student(String name, String secondName, int speciality, int course, int groupe, int sum)
    {
        this.name = name;
        this.secondName = secondName;
        this.speciality = speciality;
        this.course = course;
        this.groupe = groupe;
        this.sum = sum;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getSpeciality() {
        return speciality;
    }
    public int getCourse() {
        return course;
    }
    public int getGroupe() {
        return groupe;
    }
    public int getSum() {
        return sum;
    }

    public String toString()
    {
        return name + " " + secondName + ": Специальность №" + speciality + ";  Курс №" + course + ";  Группа №" + groupe + ";  Сумма баллов - " + sum;
    }
}
