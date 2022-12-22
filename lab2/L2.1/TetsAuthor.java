package Lab2;

import java.util.Scanner;

public class TetsAuthor
{
    public static void main(String[] args)
    {
        String email, name;
        char gender;
        System.out.println("Введите имя, email и пол (m - мужской, f - женский)");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        email = sc.nextLine();
        gender = sc.next().charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println(author.toString());
    }
}
