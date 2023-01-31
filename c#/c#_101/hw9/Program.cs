using System;
namespace hw9;
class Program
{
    static void Main(string[] args)
    {
        SpecialMethods methods = new SpecialMethods();
        methods.stringMetodlar();

        Console.ReadLine();
    }

}

public class SpecialMethods
{
    public void stringMetodlar()
    {
        // String Metotlar
        string str = "Dersimiz CSharp, Hoşgeldiniz!";
        string str1 = "Dersimiz C#, Hoşgeldiniz!";

        // Length
        System.Console.WriteLine(str.Length);

        // ToUpper, ToLower
        System.Console.WriteLine(str.ToUpper());
        System.Console.WriteLine(str.ToLower());

        // Concat
        System.Console.WriteLine(String.Concat(str, " Merhaba!"));

        // Compare, CompareTo
        System.Console.WriteLine(str.CompareTo(str1)); //0,1 veya -1 döner
        System.Console.WriteLine(String.Compare(str, str1, true));
        System.Console.WriteLine(String.Compare(str, str1, false));

        // Contains
        System.Console.WriteLine(str.Contains(str1)); // true or false

        // EndsWith
        System.Console.WriteLine(str.EndsWith("Hoşgeldiniz!"));
        System.Console.WriteLine(str.StartsWith("Merhaba!"));

        //IndexOf
        System.Console.WriteLine(str.IndexOf("CS"));

        //Insert
        System.Console.WriteLine(str.Insert(0, "Merhaba!, "));

        //LastIndexOf
        System.Console.WriteLine(str.LastIndexOf('i'));

        // PedLeft, PedRight
        System.Console.WriteLine(str + str1.PadLeft(30));
        System.Console.WriteLine(str + str1.PadLeft(30, '*'));
        System.Console.WriteLine(str + str1.PadRight(30));
        System.Console.WriteLine(str + str1.PadRight(30, '*'));

        // Remove
        System.Console.WriteLine(str.Remove(10));
        System.Console.WriteLine(str.Remove(10, 7));
        System.Console.WriteLine(str.Remove(0, 1));

        // Replace
        System.Console.WriteLine(str.Replace("CSharp", "C#"));
        System.Console.WriteLine(str.Replace(" ", "?"));

        // Split
        System.Console.WriteLine(str.Split(" ")[1]);

        // Substring
        System.Console.WriteLine(str.Substring(4));
        System.Console.WriteLine(str.Substring(4, 6));
    }
}