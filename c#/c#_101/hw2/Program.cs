using System;
namespace hw2;
class Program
{
    static void Main(string[] args)
    {
        // Atama ve işlemli atama
        int x = 3;
        int y = 2;
        y += 2;
        Console.WriteLine(y);
        x *= 2;
        Console.WriteLine(x);
        x /= 2;
        Console.WriteLine(x);

        // Mantıksal operatörler
        // ||,&&,!

        bool isSuccess = true;
        bool isCompleted = false;
        if (isSuccess && isCompleted)
            Console.WriteLine("Perfect!");

        if (isSuccess || isCompleted)
            Console.WriteLine("Great!");

        if (isSuccess && !isCompleted)
            Console.WriteLine("Fine!");

        // ilişkisel operatörler
        // <,>,==,>=,<=,!=
        int a = 3;
        int b = 4;
        bool result = a < b;
        Console.WriteLine("a<b: " + result);
        result = a >= b;
        Console.WriteLine("a>=b: " + result);
        result = a <= b;
        Console.WriteLine("a<=b: " + result);
        result = a == b;
        Console.WriteLine("a==b: " + result);
        result = a != b;
        Console.WriteLine("a!=b: " + result);

        // Aritmetik operatörler
        // /,*,-,+
        int number = 10;
        int number1 = 5;
        int sonuc = number / number1;
        Console.WriteLine(sonuc);

        // % -> mod alma, kalanı verir
        sonuc = number % number1;
        Console.WriteLine(sonuc);


        Console.ReadLine();

    }
}
