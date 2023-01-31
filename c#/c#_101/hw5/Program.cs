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

        // switch-case
        int month = DateTime.Now.Month;
        switch (month)
        {
            case 1:
                Console.WriteLine("Ocak Ayı!");
                break;
            case 2:
                Console.WriteLine("Şubat Ayı!");
                break;
            case 3:
                Console.WriteLine("Mart Ayı!");
                break;
            case 4:
                Console.WriteLine("Nisan Ayı!");
                break;
            case 5:
                Console.WriteLine("Mayıs Ayı!");
                break;
            case 8:
                Console.WriteLine("Ağustos Ayı!");
                break;
            case 6:
                Console.WriteLine("Haziran Ayı!");
                break;
            case 7:
                Console.WriteLine("Temmuz Ayı!");
                break;
            default:
                Console.WriteLine("Yanlış!");
                break;
            case 9:
                Console.WriteLine("Eylül Ayı!");
                break;
            case 10:
                Console.WriteLine("Ekim Ayı!");
                break;
            case 11:
                Console.WriteLine("Kasım Ayı!");
                break;
            case 12:
                Console.WriteLine("Aralık Ayı!");
                break;

        }

        switch (month)
        {
            case 12:
            case 1:
            case 2:
                System.Console.WriteLine("Kış ayındasınız!");
                break;
            case 3:
            case 4:
            case 5:
                System.Console.WriteLine("İlkbahar ayındasınız!");
                break;
            case 6:
            case 7:
            case 8:
                System.Console.WriteLine("Yaz ayındasınız!");
                break;
            case 9:
            case 10:
            case 11:
                System.Console.WriteLine("Sonbahar ayındasınız!");
                break;
            default:
                System.Console.WriteLine("Yanlış veri");
                break;
        }

        Console.ReadLine();
    }
}
