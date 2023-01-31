using System;
namespace hw8;
class Program
{
    static void Main(string[] args)
    {
        // 1.
        //_01();

        // 2.
        //_02();

        // 3.
        //_03();

        // 4.
        _04();

        Console.ReadLine();
    }

    public static void _04()
    {
        System.Console.WriteLine("Lütfen Bir Cümle Yazınız: ");
        string param = Console.ReadLine();
        int kelimeSayisi = 0, harfSayisi = 0;
        var strArr = param.Split(" ");
        foreach (var kelime in strArr)
        {
            kelimeSayisi++;
            for (int i = 0; i < kelime.Length; i++)
            {
                harfSayisi++;
            }
        }

        System.Console.WriteLine(param + " -> cümlesinde " + kelimeSayisi + " tane kelime var ve " + harfSayisi + " tane harf var.");


    }

    public static void _03()
    {
        System.Console.Write("Lütfen Pozitif Bir Sayı Giriniz: ");
        int n = int.Parse(Console.ReadLine());
        if (n < 0)
            System.Console.WriteLine("Tekrar deneyiniz!");
        else
        {
            string[] strs = new string[n];
            for (int i = 0; i < n; i++)
            {
                Console.Write(i + 1 + ". kelimeyi giriniz: ");
                strs[i] = Console.ReadLine();
            }
            System.Console.WriteLine("########## Tersten Kelimeler ##########");
            Array.Reverse(strs);
            foreach (var str in strs)
            {
                System.Console.WriteLine(str);
            }
        }
    }

    public static void _02()
    {
        System.Console.Write("Lütfen Pozitif Bir Sayı Giriniz: ");
        int n = int.Parse(Console.ReadLine());
        System.Console.Write("Lütfen Başka Bir Pozitif Bir Sayı Giriniz: ");
        int m = int.Parse(Console.ReadLine());
        if (n < 0 || m < 0)
            System.Console.WriteLine("Tekrar deneyiniz!");
        else
        {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                Console.Write(i + 1 + ". sayıyı giriniz: ");
                arr[i] = int.Parse(Console.ReadLine());
            }
            System.Console.WriteLine("########## Tam bölen veya eşit ##########");
            foreach (var i in arr)
            {
                if (i == m || m % i == 0)
                {
                    System.Console.WriteLine(m + "'ye eşit ya da tam bölen sayılar: " + i);
                }
            }
        }
    }

    public static void _01()
    {
        System.Console.Write("Lütfen Pozitif Bir Sayı Giriniz: ");
        int n = int.Parse(Console.ReadLine());
        if (n < 0)
            System.Console.WriteLine("Tekrar deneyiniz!");
        else
        {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                Console.Write(i + 1 + ". sayıyı giriniz: ");
                arr[i] = int.Parse(Console.ReadLine());
            }
            System.Console.WriteLine("########## Çift Sayılar ##########");
            foreach (var number in arr)
            {
                if (number % 2 == 0)
                    System.Console.WriteLine(number);
            }
        }
    }
}
