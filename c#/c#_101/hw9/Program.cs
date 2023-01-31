using System;
using System.Collections.Generic;
using System.Collections;
namespace hw9;
class Program
{
    static void Main(string[] args)
    {
        //SpecialMethods methods = new SpecialMethods();
        //methods.stringMetodlar();
        //methods.dateTimeMetodlar();
        //methods.mathMetodlar();

        Collections collections = new Collections();
        //collections.Examples();
        collections.ArrayListExample();

        Console.ReadLine();
    }

}

public class Collections
{
    public void ArrayListExample()
    {
        ArrayList liste = new ArrayList();
        //liste.Add("Ayşe");
        liste.Add(2);
        //liste.Add(true);
        //liste.Add('A');
        //liste.Add(2.5);

        //System.Console.WriteLine(liste[2]);
        foreach (var item in liste)
            System.Console.WriteLine(item);

        // AddRange
        System.Console.WriteLine("#".PadLeft(10, '#') + " Add Range " + "#".PadLeft(10, '#'));
        //string[] renkler = { "siyah", "beyaz", "turuncu" };
        //liste.AddRange(renkler);
        List<int> sayilar = new List<int>() { 1, 8, 7, 99, -88, 12, 0 };
        liste.AddRange(sayilar);
        foreach (var item in liste)
            System.Console.WriteLine(item);

        System.Console.WriteLine("#".PadLeft(10, '#') + " Sort " + "#".PadLeft(10, '#'));
        liste.Sort();
        foreach (var item in liste)
            System.Console.WriteLine(item);

        //Binary Search kullanılırken önce sort ile sıralama yapılmalı
        System.Console.WriteLine("#".PadLeft(10, '#') + " Binary Search " + "#".PadLeft(10, '#'));
        System.Console.WriteLine(liste.BinarySearch(99));

        System.Console.WriteLine("#".PadLeft(10, '#') + " Reverse " + "#".PadLeft(10, '#'));
        liste.Reverse();
        foreach (var item in liste)
            System.Console.WriteLine(item);

        System.Console.WriteLine("#".PadLeft(10, '#') + " Clear " + "#".PadLeft(10, '#'));
        liste.Clear();
        foreach (var item in liste)
            System.Console.WriteLine(item);


    }
    public void Examples()
    {
        List<int> sayiListesi = new List<int>();
        sayiListesi.Add(23);
        sayiListesi.Add(4);
        sayiListesi.Add(5);
        sayiListesi.Add(92);
        sayiListesi.Add(14);
        sayiListesi.Add(34);

        List<string> renkListesi = new List<string>();
        renkListesi.Add("kırmızı");
        renkListesi.Add("mavi");
        renkListesi.Add("sarı");
        renkListesi.Add("turuncu");
        renkListesi.Add("siyah");
        renkListesi.Add("beyaz");

        // Count
        System.Console.WriteLine("Renk Listesi boyutu " + renkListesi.Count);
        System.Console.WriteLine("Sayı Listesi boyutu " + sayiListesi.Count);

        //foreach
        System.Console.WriteLine("#".PadLeft(10, '#') + " Sayı Listesi " + "#".PadLeft(10, '#'));
        foreach (var item in sayiListesi)
            System.Console.WriteLine(item);
        Console.WriteLine("-".PadLeft(10, '-') + " Sayı Listesi " + "-".PadLeft(10, '-'));
        sayiListesi.ForEach(sayi => Console.WriteLine(sayi));
        System.Console.WriteLine("#".PadLeft(10, '#') + " Renk Listesi " + "#".PadLeft(10, '#'));
        foreach (var item in renkListesi)
            System.Console.WriteLine(item);
        Console.WriteLine("-".PadLeft(10, '-') + " Renk Listesi " + "-".PadLeft(10, '-'));
        renkListesi.ForEach(renk => Console.WriteLine(renk));

        // listeden eleman çıkarma
        Console.WriteLine("-".PadLeft(10, '-') + " Eleman Çıkarma " + "-".PadLeft(10, '-'));
        sayiListesi.Remove(34);
        renkListesi.Remove("sarı");

        sayiListesi.RemoveAt(1);
        renkListesi.RemoveAt(3);

        Console.WriteLine("-".PadLeft(10, '-') + " Sayı Listesi " + "-".PadLeft(10, '-'));
        sayiListesi.ForEach(sayi => Console.WriteLine(sayi));
        Console.WriteLine("-".PadLeft(10, '-') + " Renk Listesi " + "-".PadLeft(10, '-'));
        renkListesi.ForEach(renk => Console.WriteLine(renk));

        // listede arama
        Console.WriteLine("-".PadLeft(10, '-') + " Contains " + "-".PadLeft(10, '-'));
        if (sayiListesi.Contains(92))
            System.Console.WriteLine("92 listede var");
        //eleman ile index e erişme
        Console.WriteLine("-".PadLeft(10, '-') + " Binary Search " + "-".PadLeft(10, '-'));
        System.Console.WriteLine(renkListesi.BinarySearch("beyaz"));
        //diziyi listeye çevirme
        Console.WriteLine("-".PadLeft(10, '-') + " Diziyi listeye çevirme " + "-".PadLeft(10, '-'));
        string[] hayvanlar = { "kedi", "köpek", "kuş", "kaplumbağa" };
        List<string> listHayvanlar = new List<string>(hayvanlar);
        listHayvanlar.ForEach(h => Console.WriteLine(h));

        Console.WriteLine("-".PadLeft(10, '-') + " Listeyi temizle " + "-".PadLeft(10, '-'));
        listHayvanlar.Clear();
        listHayvanlar.ForEach(h => Console.WriteLine(h));

        Console.WriteLine("-".PadLeft(10, '-') + " Listede nesne tutma " + "-".PadLeft(10, '-'));
        List<Users> users = new List<Users>();
        Users user1 = new Users();
        user1.Name = "Ayşe";
        user1.Surname = "Kara";
        user1.Age = 25;

        Users user2 = new Users();
        user2.Name = "Ali";
        user2.Surname = "Kara";
        user2.Age = 32;
        users.Add(user1);
        users.Add(user2);

        List<Users> newUsers = new List<Users>();
        newUsers.Add(new Users()
        {
            Name = "Fatma",
            Surname = "Kara",
            Age = 18
        });

        users.ForEach(u => Console.WriteLine("Name: " + u.Name + " Surname: " + u.Surname + " Age: " + u.Age));
        newUsers.ForEach(u => Console.WriteLine("Name: " + u.Name + " Surname: " + u.Surname + " Age: " + u.Age));

    }
}

public class Users
{
    string name;
    string surname;
    int age;

    public string Name { get => name; set => name = value; }
    public string Surname { get => surname; set => surname = value; }
    public int Age { get => age; set => age = value; }
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

        string s = "07:05:45PM";
        System.Console.WriteLine(DateTime.Parse(s).ToString("HH:mm:ss"));
        s = "07:05:45AM";
        System.Console.WriteLine(DateTime.Parse(s).ToString("HH:mm:ss"));
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