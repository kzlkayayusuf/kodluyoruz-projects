using System;
namespace hw11;
class Program
{
    static void Main(string[] args)
    {
        /*
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
        */

        /*
        //HackerRank Challenge
        int T = int.Parse(Console.In.ReadLine());
        for (int i = 0; i < T; i++)
        {
            int age = int.Parse(Console.In.ReadLine());
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++)
            {
                p.yearPasses();
            }
            p.amIOld();
            Console.WriteLine();
        }
        */

        Student student = new Student("yusuf", "kızılkaya", 279, 5);
        student.GetStudentInformation();

        student.PassClass();
        student.GetStudentInformation();

        Student student1 = new Student("zeynep", "kızılkaya", 322, 0);
        student1.FlunkClass();
        student1.GetStudentInformation();

        Console.ReadLine();
    }
}

class Student
{
    private string name;
    private string surname;
    private int no;
    private int classNo;

    public Student(string name, string surname, int no, int classNo)
    {
        Name = name;
        Surname = surname;
        No = no;
        ClassNo = classNo;
    }
    public Student()
    {

    }

    public string Name
    {
        get { return name; }
        set { name = value; }
    }

    public string Surname { get => surname; set => surname = value; }
    public int No { get => no; set => no = value; }
    public int ClassNo
    {
        get => classNo;
        set
        {
            if (value < 1)
                System.Console.WriteLine("The Class can be at least 1.");
            classNo = value < 1 ? 1 : value;
        }
    }

    public void GetStudentInformation()
    {
        Console.WriteLine("-".PadLeft(10, '-') + " Student Information " + "-".PadLeft(10, '-'));
        System.Console.WriteLine("Student Name:      {0}", this.Name);
        System.Console.WriteLine("Student Surname:   {0}", this.Surname);
        System.Console.WriteLine("Student No:        {0}", this.No);
        System.Console.WriteLine("Student Class:     {0}", this.ClassNo);
    }

    public void PassClass()
    {
        this.ClassNo++;
    }

    public void FlunkClass()
    {
        this.ClassNo--;
    }

}
class Person
{
    public int age;
    public Person(int initialAge)
    {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0)
            System.Console.WriteLine("Age is not valid, setting age to 0.");
        age = initialAge < 0 ? 0 : initialAge;
    }
    public void amIOld()
    {
        // Do some computations in here and print out the correct statement to the console 
        if (this.age < 13)
            System.Console.WriteLine("You are young.");
        else if (this.age >= 13 && this.age < 18)
            System.Console.WriteLine("You are a teenager.");
        else
            System.Console.WriteLine("You are old.");
    }

    public void yearPasses()
    {
        // Increment the age of the person in here
        this.age++;
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