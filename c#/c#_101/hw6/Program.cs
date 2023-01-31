using System;
namespace hw6;
class Program
{
    static void Main(string[] args)
    {
        // döngüler
        // for döngüsü
        System.Console.WriteLine("Bir sayı giriniz: ");
        int sayac = int.Parse(Console.ReadLine());
        System.Console.WriteLine("###########For Loop###########");
        System.Console.WriteLine("###########Tek Sayılar###########");
        for (int i = 1; i <= sayac; i++)
        {
            if (i % 2 == 0)
                continue;
            System.Console.WriteLine(i);
        }

        // 1 ile 1000 arasındaki tek ve çift sayıların toplamı
        int tekToplam = 0, ciftToplam = 0;
        for (int i = 1; i < 1001; i++)
        {
            if (i % 2 == 0)
                ciftToplam += i;
            else
                tekToplam += i;
        }

        System.Console.WriteLine("Tek Toplam: " + tekToplam);
        System.Console.WriteLine("Çift Toplam: " + ciftToplam);

        // break-> döngüyü sonlandırır, continue-> kendisinden sonraki kodu çalıştırmayıp döngüyü devam ettirir
        for (int i = 0; i < 155; i++)
        {
            if (i == 4)
                break;
            System.Console.WriteLine(i);
        }

        //hackerrank challenge
        staircase(6);

        // while loop
        System.Console.WriteLine("###########While Loop###########");
        //1 den n ye kadar ortalama hesapla
        System.Console.WriteLine("Bir sayı giriniz: ");
        int n = int.Parse(Console.ReadLine());
        int m = 1, toplam = 0;
        while (n >= m)
        {
            toplam += m;
            m++;
        }
        System.Console.WriteLine("1'den " + n + "'de dahil ortalama= " + toplam / n);

        // 'a' dan 'z' ye kadar tüm harfleri yaz
        char character = 'a';
        while (character <= 'z')
        {
            Console.Write(character);
            character++;
        }

        Console.WriteLine();
        // Foreach
        System.Console.WriteLine("###########Foreach Loop###########");
        string[] cars = { "TOGG", "BMW", "Ferrari", "Toyota", "Nissan" };
        foreach (var car in cars)
        {
            System.Console.WriteLine(car);
        }

        Console.ReadLine();
    }

    public static void staircase(int n)
    {
        string empty = null;
        string c = null;
        for (int i = 0; i < n; i++)
        {
            empty = null;
            c = null;
            for (int j = 0; j < (n - 1 - i); j++)
            {
                empty += " ";
            }
            for (int k = 0; k < (i + 1); k++)
            {
                c += '#';
            }

            Console.WriteLine(empty + c);
        }
    }
}
