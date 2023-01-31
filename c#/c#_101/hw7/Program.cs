using System;

namespace hw7;
class Program
{
    static void Main(string[] args)
    {
        /*
        // Dizi tanımlama
        string[] renkler = new string[5];
        string[] hayvanlar = { "Kedi", "köpek", "Kuş", "Maymun" };
        int[] dizi;
        dizi = new int[4];

        // Dizilere değer atama ve erişim
        renkler[0] = "mavi";
        System.Console.WriteLine(hayvanlar[2]);
        dizi[3] = 10;
        System.Console.WriteLine(dizi[3]);
        System.Console.WriteLine(renkler[0]);

        // döngülerle dizi
        //ortalama hesaplama
        System.Console.Write("Lütfen dizinin eleman sayısını giriniz: ");
        int diziUzunlugu = int.Parse(Console.ReadLine());
        int[] sayi = new int[diziUzunlugu];
        for (int i = 0; i < diziUzunlugu; i++)
        {
            System.Console.Write("Lütfen {0}. sayıyı giriniz: ", i + 1);
            sayi[i] = int.Parse(Console.ReadLine());
        }

        int toplam = 0;
        foreach (var item in sayi)
            toplam += item;

        System.Console.WriteLine("Ortalama: " + toplam / diziUzunlugu);
        */

        // Array sınıfı metodları
        // Sort
        int[] numberArray = { 23, 12, 55, 72, 3, 11, 17, 4 };
        Console.WriteLine("####### Sırasız Dizi #######");
        foreach (var number in numberArray)
            System.Console.Write(number + ",");

        Console.WriteLine();
        Array.Sort(numberArray);
        Console.WriteLine("####### Sıralı Dizi #######");
        foreach (var number in numberArray)
            System.Console.Write(number + ",");

        // Clear
        Console.WriteLine();
        Array.Clear(numberArray, 2, 2);
        Console.WriteLine("####### Array Clear #######");
        foreach (var number in numberArray)
            System.Console.Write(number + ",");

        // Reverse
        Console.WriteLine();
        Array.Reverse(numberArray);
        Console.WriteLine("####### Array Reverse #######");
        foreach (var number in numberArray)
            System.Console.Write(number + ",");

        // IndexOf
        Console.WriteLine();

        Console.WriteLine("####### Array IndexOf #######");
        System.Console.WriteLine(Array.IndexOf(numberArray, 72));
        System.Console.WriteLine(Array.IndexOf(numberArray, 77));

        // Resize
        Console.WriteLine();

        Console.WriteLine("####### Array Resize #######");
        Array.Resize<int>(ref numberArray, 12);
        numberArray[11] = 99;
        foreach (var number in numberArray)
            System.Console.Write(number + ",");


        // methods
        Console.WriteLine();
        Console.WriteLine("####### C# Methods #######");
        int t = Topla(3, 4);

        Metotlar metotlar = new Metotlar();
        metotlar.EkranaYazdir(Convert.ToString(t));
        int n1 = 4;
        int n2 = 5;
        int t1 = metotlar.ArtirTopla(ref n1, ref n2);
        metotlar.EkranaYazdir(Convert.ToString(t1));
        metotlar.EkranaYazdir(Convert.ToString(n1 + n2));

        //out parametreler
        Console.WriteLine("####### Out #######");
        string sayi = "999";
        bool b = int.TryParse(sayi, out int outSayi);
        if (b)
        {
            metotlar.EkranaYazdir("Başarılı");
            metotlar.EkranaYazdir(Convert.ToString(outSayi));
        }
        else
        {
            metotlar.EkranaYazdir("Başarısız!");
        }

        Console.WriteLine("####### Method Overloading #######");
        metotlar.Topla(1, 2, out int sonuc);
        metotlar.EkranaYazdir(Convert.ToString(sonuc));
        string message = "message";
        metotlar.EkranaYazdir(message);
        int veri = 5;
        metotlar.EkranaYazdir(veri);

        //metot imzası-> metod adı, parametre sayısı, parametre tipi. Erişim belirteci imzaya dahil değil
        metotlar.EkranaYazdir("yusuf", "kızılkaya");

        // Rekürsif(Öz Yinelemeli) Metot Kullanımı
        // 3^4 = 3*3*3*3
        Console.WriteLine("####### Rekürsif(Öz Yinelemeli) Metot #######");
        int result = 1;
        for (int i = 1; i < 5; i++)
            result = result * 3;
        Console.WriteLine(result);

        Islemler islem = new(); // c# 9 ile birlikte instance ı böyle de oluşturur
        Console.WriteLine(islem.Expo(3, 4));

        // Extension(Genişletilmiş) Metot Kullanımı
        //metodlar ve class ları static olmalı, this ifadesi olmalı
        Console.WriteLine("####### Extension(Genişletilmiş) Metot #######");
        string ifade = "C# Patikası";
        bool b2 = ifade.CheckSpaces();
        Console.WriteLine(b2);
        if (b2)
            Console.WriteLine(ifade.RemoveWhiteSpaces());

        Console.WriteLine(ifade.MakeUpperCase());
        Console.WriteLine(ifade.MakeLowerCase());

        int[] newArr = { 9, 3, 6, 2, 1, 5, 5, 0 };
        newArr.EkranaYazdir();
        Console.WriteLine();
        newArr.SortArray();
        newArr.EkranaYazdir();
        Console.WriteLine();

        int number3 = 9;
        System.Console.WriteLine(number3.isEvenNumber());

        System.Console.WriteLine(ifade.GetFirstCharacter());
        Console.ReadLine();
    }

    private static int Topla(int number1, int number2)
    {
        return number1 + number2;
    }

    //string.Format("{0:0.##}", 256.583); // "256.58"
}

public static class Extension
{
    public static bool CheckSpaces(this string ifade)
    {
        return ifade.Contains(" ");
    }
    public static string RemoveWhiteSpaces(this string ifade)
    {
        string[] dizi = ifade.Split(" ");
        return string.Join("*", dizi);
    }
    public static string MakeUpperCase(this string ifade)
    {
        return ifade.ToUpper();
    }
    public static string MakeLowerCase(this string ifade)
    {
        return ifade.ToLower();
    }
    public static int[] SortArray(this int[] param)
    {
        Array.Sort(param);
        return param;
    }
    public static void EkranaYazdir(this int[] param)
    {
        foreach (var item in param)
        {
            Console.Write(item + ",");
        }
    }
    public static bool isEvenNumber(this int param)
    {
        return param % 2 == 0;
    }
    public static string GetFirstCharacter(this string param)
    {
        return param.Substring(0, 1);
    }
}

public class Islemler
{
    public int Expo(int sayi1, int üs)
    {
        if (üs < 2)
            return sayi1;
        return Expo(sayi1, üs - 1) * sayi1;
    }
}

class Metotlar
{
    public void EkranaYazdir(string veri)
    {
        System.Console.WriteLine(veri);
    }
    public void EkranaYazdir(int veri)
    {
        System.Console.WriteLine(veri);
    }

    public void EkranaYazdir(string veri1, string veri2)
    {
        System.Console.WriteLine(veri1 + " " + veri2);
    }

    public int ArtirTopla(ref int number1, ref int number2)
    {
        number1 += 1;
        number2 += 1;

        return number1 + number2;
    }

    public int Topla(int a, int b, out int toplam)
    {
        toplam = a + b;
        return toplam;
    }

}
