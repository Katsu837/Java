package L37;

import java.util.Scanner;

public class Employee
{
    Scanner sc = new Scanner(System.in);
    private String fullname;
    private double salry;

    public Employee(){}

    public double getSalry() {
        return salry;
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public void setSalry(double salry) {
        this.salry = salry;
    }

}
