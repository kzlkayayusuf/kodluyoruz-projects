using System;
namespace hw4;
class Program
{
    static void Main(string[] args)
    {
        try
        {
            Console.WriteLine("Bir sayı giriniz: ");
            int a = int.Parse(Console.ReadLine());
            Console.WriteLine("Bir sayı giriniz: ");
            int b = int.Parse(Console.ReadLine());

            int c = a / b;

            Console.WriteLine(c);
        }
        catch (DivideByZeroException ex)
        {
            Console.WriteLine("Sıfıra bölünemez: " + ex.Message);
        }
        catch (Exception ex)
        {
            Console.WriteLine("Bir Hata Oluştu: " + ex.Message);
        }
        finally
        {
            Console.WriteLine("İşlem tamamlandı.");
        }

        try
        {
            int n = int.Parse(null);
        }
        catch (ArgumentNullException ex)
        {
            Console.WriteLine("Boş değer girdiniz! : " + ex);
        }
        catch (FormatException ex)
        {
            Console.WriteLine("Veri tipi uygun değil : " + ex);
        }
        catch (OverflowException ex)
        {
            Console.WriteLine("Çok küçük yada çok büyük bir değer girdiniz : " + ex);
        }

        System.Console.ReadLine();
    }

}