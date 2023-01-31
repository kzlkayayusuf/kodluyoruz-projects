using System;
namespace hw9;
class Program
{
    static void Main(string[] args)
    {
        SpecialMethods methods = new SpecialMethods();
        //methods.stringMetodlar();
        //methods.dateTimeMetodlar();
        methods.mathMetodlar();

        Console.ReadLine();
    }

}

public class SpecialMethods
{
    public void mathMetodlar()
    {
        System.Console.WriteLine(Math.Abs(-25));
        System.Console.WriteLine(Math.Sin(90));
        System.Console.WriteLine(Math.Cos(90));
        System.Console.WriteLine(Math.Tan(90));

        System.Console.WriteLine(Math.Ceiling(2.5));
        System.Console.WriteLine(Math.Round(2.5));
        System.Console.WriteLine(Math.Round(2.3));
        System.Console.WriteLine(Math.Round(2.7));
        System.Console.WriteLine(Math.Floor(2.5));

        System.Console.WriteLine(Math.Max(1, 15));
        System.Console.WriteLine(Math.Min(1, 15));
        System.Console.WriteLine(Math.Pow(3, 4));
        System.Console.WriteLine(Math.Sqrt(25));
        System.Console.WriteLine(Math.Log(25));
        System.Console.WriteLine(Math.Exp(25));
        System.Console.WriteLine(Math.Log10(100));
        System.Console.WriteLine(Math.Log2(8));

    }
    public void dateTimeMetodlar()
    {
        System.Console.WriteLine(DateTime.Now);
        System.Console.WriteLine(DateTime.Now.Date);
        System.Console.WriteLine(DateTime.Now.Day);
        System.Console.WriteLine(DateTime.Now.Month);
        System.Console.WriteLine(DateTime.Now.Year);
        System.Console.WriteLine(DateTime.Now.Hour);
        System.Console.WriteLine(DateTime.Now.Minute);
        System.Console.WriteLine(DateTime.Now.Second);

        System.Console.WriteLine(DateTime.Now.DayOfWeek);
        System.Console.WriteLine(DateTime.Now.DayOfYear);
        System.Console.WriteLine(DateTime.Now.ToLongDateString());
        System.Console.WriteLine(DateTime.Now.ToShortDateString());

        System.Console.WriteLine(DateTime.Now.ToLongTimeString());
        System.Console.WriteLine(DateTime.Now.ToShortTimeString());

        System.Console.WriteLine(DateTime.Now.AddDays(5));
        System.Console.WriteLine(DateTime.Now.AddHours(12));
        System.Console.WriteLine(DateTime.Now.AddMonths(9));
        System.Console.WriteLine(DateTime.Now.AddSeconds(60));
        System.Console.WriteLine(DateTime.Now.AddMilliseconds(1L));

        // DateTime format
        System.Console.WriteLine(DateTime.Now.ToString("dd"));
        System.Console.WriteLine(DateTime.Now.ToString("ddd"));
        System.Console.WriteLine(DateTime.Now.ToString("dddd"));

        System.Console.WriteLine(DateTime.Now.ToString("MM"));
        System.Console.WriteLine(DateTime.Now.ToString("MMM"));
        System.Console.WriteLine(DateTime.Now.ToString("MMMM"));

        System.Console.WriteLine(DateTime.Now.ToString("yy"));
        System.Console.WriteLine(DateTime.Now.ToString("yyy"));
        System.Console.WriteLine(DateTime.Now.ToString("yyyy"));

    }
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