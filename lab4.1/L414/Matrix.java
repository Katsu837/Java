package L414;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix
{
    private int str1, str2;
    private int stb1, stb2;
    private int[][] matrix1;
    private int[][] matrix2;
    private Scanner sc = new Scanner(System.in);

    public Matrix(int str1, int stb1, int str2, int stb2)
    {
        this.str1 = str1;
        this.stb1 = stb1;
        this.str2 = str2;
        this.stb2 = stb2;
    }

    public void setStr1(int str1) {
        this.str1 = str1;
    }
    public void setStr2(int str2) {
        this.str2 = str2;
    }
    public void setStb1(int stb1) {
        this.stb1 = stb1;
    }
    public void setStb2(int stb2) {
        this.stb2 = stb2;
    }

    public void matrixAdd()
    {
        for (int i = 0; i < stb1; i++)
        {
            for (int j = 0; j < str1; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < stb2; i++)
        {
            for (int j = 0; j < str2; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }


    }

    public void matrixSum()
    {
        if(str1 != str2 & stb1 != stb2)
        {
            System.out.println("Сложение не возможно!");
            return;
        }

        for (int i = 0; i < stb1; i++)
        {
            for (int j = 0; j < str1; j++)
            {
                matrix1[i][j] += matrix2[i][j];
            }
        }
        out();
    }

    public void matrixA()
    {
        System.out.println("Введите коэф умножения");
        int a = sc.nextInt();
        for (int i = 0; i < stb1; i++)
        {
            for (int j = 0; j < str1; j++)
            {
                matrix1[i][j] = matrix1[i][j] * a;
            }
        }
    }

    public void out()
    {
        for (int i = 0; i < stb1; i++)
        {
            for (int j = 0; j < str1 ; j++)
            {
                System.out.print(matrix1[i][j] + " ");
                if (j == str1-1) System.out.println();
            }
        }
    }
}
