using System;
namespace hw11;
class Program
{
    static void Main(string[] args)
    {
        Employee e1 = new Employee();
        e1.Name = "yusuf";
        e1.Surname = "kızılkaya";
        e1.No = 23415634;
        e1.Department = "Engineering";
        e1.printEmployeeInformation();
        Console.WriteLine("-".PadLeft(50, '-'));
        Employee e2 = new Employee();
        e2.Name = "zeynep";
        e2.Surname = "kızılkaya";
        e2.No = 25646789;
        e2.Department = "Engineering";
        e2.printEmployeeInformation();

        Console.ReadLine();
    }
}

class Employee
{
    public string Name;
    public string Surname;
    public int No;
    public string Department;

    public void printEmployeeInformation()
    {
        System.Console.WriteLine("Employee Name: {0}", Name);
        System.Console.WriteLine("Employee Surname: {0}", Surname);
        System.Console.WriteLine("Employee Number: {0}", No);
        System.Console.WriteLine("Employee Department: {0}", Department);
    }
}