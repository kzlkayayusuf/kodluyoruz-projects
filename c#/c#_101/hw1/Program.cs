using System;

namespace hw1;
class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Hello, World!");
        Console.WriteLine("Enter your name: ");
        string name = Console.ReadLine();
        Console.WriteLine("Enter your surname: ");
        string surname = Console.ReadLine();
        Console.WriteLine("Welcome " + name.ToUpper() + " " + surname.ToUpper());

        //değişkenler
        //rakam ,-,+,/,* ile başlamaz. _ ile başlayabilir 
        //değişken isimleri case sensitive'dir yani büyük küçük harf duyarlıdır.
        string _ilkString = "ilk String"; //sınırsız
        String str = " ";
        Console.WriteLine(_ilkString + " " + str);
        int numara = 5;
        int Numara = 10;
        Console.WriteLine(numara * Numara);

        byte b = 5; //1 byte yer kaplar, 0 ila 255 arasında değer alır
        sbyte sb = -128; //1 byte yer kaplar. -128 ila 127 arasında değer alır
        short sh = 25; //2 byte yer kaplar.-32.768 ila +32.768 arasında tam sayı değerleri alır.
        ushort ush = 65365; //2byte yer kaplar. 0 ila 65.365 arasında değer alır.
        Int16 i = 2; //2byte yer kaplar.
        int sayi = 2; //4 byte.
        Int32 i1 = 2; //4byte.
        Int64 i2 = 2; //8byte

        uint u1 = 4; //4byte
        long l = 8; //8byte
        ulong ul = 10; //8byte

        //Reel sayılar
        float f = 1.2f; //4byte
        double d = 1.9; //8byte
        decimal deger = 5; //16 byte 

        char c = 'y'; //2byte
        bool isTrue = false;

        DateTime dt = DateTime.Now;
        Console.WriteLine(dt);


        object obj = "x";
        obj = 4;
        obj = 1.2;
        obj = true;

        //string ifadeler
        string a = string.Empty;
        a = null;
        a = "değer";

        //integer
        int number = 0;
        int number1 = 1;
        int number2 = number * number1;

        Console.WriteLine(number2);

        //değişken dönüşümleri
        string str1 = "20";
        int number3 = 20;
        string strNew = str1 + number3.ToString();
        Console.WriteLine(strNew);
        int newInt = number3 + Convert.ToInt16(str1);
        Console.WriteLine(newInt);

        int yeni = number3 + int.Parse(str1);
        Console.WriteLine(yeni);

        //DateTime
        string dateTime = DateTime.Now.ToString("dd.MM.yyyy");
        Console.WriteLine(dateTime);
        string dateTime2 = DateTime.Now.ToString("dd/MM/yyyy");
        Console.WriteLine(dateTime2);
        string hour = DateTime.Now.ToString("hh:mm");
        Console.WriteLine(hour);

        Console.ReadLine();
    }
}
