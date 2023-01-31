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

        Console.ReadLine();
    }

    //string.Format("{0:0.##}", 256.583); // "256.58"
}
