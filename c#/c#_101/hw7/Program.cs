using System;

namespace hw7;
class Program
{
    static void Main(string[] args)
    {
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
        Console.ReadLine();
    }
}
