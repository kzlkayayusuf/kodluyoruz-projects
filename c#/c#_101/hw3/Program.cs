using System;
namespace hw3;
class Program
{
    static void Main(string[] args)
    {
        //tip dönüşümleri
        //Implicit Conversion (Bilinçsiz ya da kapalı dönüşüm)
        byte b = 5;
        sbyte sb = 30;
        short sh = 10;

        int n = b + sb + sh;
        Console.WriteLine("int n= " + n);

        long l = n;
        Console.WriteLine("long l= " + l);

        float f = l;
        Console.WriteLine("float f= " + l);

        string str = "abc";
        char c = 'k';
        object obj = str + c + f;
        Console.WriteLine("object o= " + obj);

        //Explicit Conversion (Bilinçli ya da açık dönüşüm)
        int x = 4;
        byte y = (byte)x; // type casting
        Console.WriteLine(y);

        float f1 = 17.6f;
        byte b1 = (byte)f1; // veri kaybı
        Console.WriteLine(b1);

        // ToString
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        Console.WriteLine(array.ToString());
        int i = 5;
        string newI = i.ToString();
        Console.WriteLine(newI);

        // System.Convert
        string s1 = "10", s2 = "20";
        int sayi1, sayi2;
        int Toplam;
        sayi1 = Convert.ToInt32(s1);
        sayi2 = Convert.ToInt32(s2);
        Toplam = sayi1 + sayi2;
        Console.WriteLine("toplam: " + Toplam);

        // Parse
        ParseMethod();
        Console.ReadLine();
    }

    public static void ParseMethod()
    {
        string metin1 = "10";
        string metin2 = "10,25";
        int rakam;
        double d;

        rakam = Int32.Parse(metin1);
        d = Double.Parse(metin2);
        Console.WriteLine("Rakam: " + rakam);
        Console.WriteLine("Double: " + d);

    }
}
