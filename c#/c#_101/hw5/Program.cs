using System;
namespace hw5;
class Program
{
    static void Main(string[] args)
    {
        int hour = DateTime.Now.Hour;
        if (hour >= 6 && hour < 11)
            System.Console.WriteLine("Günaydın");
        else if (hour <= 18)
            System.Console.WriteLine("İyi Günler");
        else
        {
            System.Console.WriteLine("İyi Geceler");
        }

        // ternory operator ? (true) : (false)
        string message = (hour >= 6 && hour < 11) ? "Günaydın" : (hour <= 18) ? "İyi Günler" : "İyi Geceler";
        // Console.WriteLine()'ı kısa yoldan cw yazıp enterlayarak yazdır 
        System.Console.WriteLine("Ternory Operator ile: " + message);
        Console.ReadLine();
    }
}
