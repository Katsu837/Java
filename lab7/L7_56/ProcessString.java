package L7_56;

import java.util.ArrayList;
import java.util.Arrays;

class ProcessString implements ActionWithString
{
    private String string = "Avengers... Assemble!";

    public ProcessString() {}

    @Override
    public int SymbolCounter()
    {
        return string.length(); //21
    }

    @Override
    public String OddSymbol()
    {
        char[] chr = string.toCharArray();
        String stroka = "";
        for (int i = 0; i < chr.length; i = i + 2)
        {
            stroka += chr[i];
        }
        return stroka;
    }

    @Override
    public String invertString()
    {
        char[] chr = string.toCharArray();
        String stroka = "";
        for (int i = chr.length - 1; i >= 0; i--)
        {
            stroka += chr[i];
        }
        return stroka;
    }
}
