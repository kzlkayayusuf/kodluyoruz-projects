using System;
namespace hw13;
class Program
{
    static void Main(string[] args)
    {
        Management management = new Management(new Board());
        management.ShowMenu();
        Console.ReadKey();
    }
}
