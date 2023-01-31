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

        Console.ReadLine();
    }
}
