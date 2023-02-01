using System;
using System.Collections.Generic;
using System.Collections;
namespace hw10;
class Program
{
    static void Main(string[] args)
    {
        CollectionsHW hw = new CollectionsHW();
        //hw.CQ1();
        //hw.CQ2();
        hw.CQ3();

        Console.ReadLine();
    }

}

class CollectionsHW
{
    public void CQ3()
    {
        Console.WriteLine("Enter a sentence: ");
        string sentence = Console.ReadLine().ToLower();
        List<char> vowels = new List<char>();
        for (int i = 0; i < sentence.Length; i++)
        {
            if (sentence[i] == 'a' || sentence[i] == 'e' || sentence[i] == 'ı' || sentence[i] == 'i'
            || sentence[i] == 'u' || sentence[i] == 'ü' || sentence[i] == 'o' || sentence[i] == 'ö')
                vowels.Add(sentence[i]);

        }

        vowels.Sort();

        Console.WriteLine("Vowels in the sentence: ");
        foreach (char c in vowels)
        {
            Console.Write(c + ", ");
        }
        Console.WriteLine();
    }

    public void CQ2()
    {
        int[] numbers = new int[20];
        int sum1 = 0, sum2 = 0;

        Console.WriteLine("Enter 20 numbers: ");
        for (int i = 0; i < 20; i++)
        {
            numbers[i] = int.Parse(Console.ReadLine());
        }

        Array.Sort(numbers);
        Array.Reverse(numbers);

        int[] biggest = new int[3];
        int[] smallest = new int[3];

        for (int i = 0; i < 3; i++)
        {
            biggest[i] = numbers[i];
            sum1 += biggest[i];
        }

        for (int i = 19; i >= 17; i--)
        {
            smallest[19 - i] = numbers[i];
            sum2 += smallest[19 - i];
        }

        Console.WriteLine("The biggest 3 numbers :");
        foreach (var number in biggest)
            Console.Write(number + ",");
        Console.WriteLine();
        Console.WriteLine("The smallest 3 numbers :");
        foreach (var number in smallest)
            Console.Write(number + ",");
        Console.WriteLine();
        Console.WriteLine("The average of the biggest 3 numbers is: " + sum1 / 3.0);
        Console.WriteLine("The average of the smallest 3 numbers is: " + sum2 / 3.0);
        Console.WriteLine("The average sum of both is: " + (sum1 + sum2) / 3.0);
    }
    public void CQ1()
    {
        ArrayList primeNumbers = new ArrayList();
        ArrayList nonPrimeNumbers = new ArrayList();

        for (int i = 0; i < 20; i++)
        {
            Console.Write("Enter a positive number: ");
            string input = Console.ReadLine();
            int number;
            if (int.TryParse(input, out number) && number > 0)
            {
                bool isPrime = true;
                if (number > 1)
                {
                    for (int j = 2; j <= Math.Sqrt(number); j++)
                    {
                        if (number % j == 0)
                        {
                            isPrime = false;
                            break;
                        }
                    }
                }
                else
                {
                    isPrime = false;
                }
                if (isPrime)
                {
                    primeNumbers.Add(number);
                }
                else
                {
                    nonPrimeNumbers.Add(number);
                }
            }
            else
            {
                Console.WriteLine("Invalid input. Please enter a positive number.");
                i--;
            }
        }

        primeNumbers.Sort();
        primeNumbers.Reverse();
        Console.WriteLine("Prime numbers: ");
        double totalPrimeNumber = 0;
        foreach (var number in primeNumbers)
        {
            Console.Write(number + ",");
            totalPrimeNumber += Convert.ToDouble(number);
        }
        Console.WriteLine();
        Console.WriteLine("Number of prime numbers: " + primeNumbers.Count);
        Console.WriteLine("Average of prime numbers: " + (primeNumbers.Count > 0 ? (totalPrimeNumber / primeNumbers.Count) : 0));

        nonPrimeNumbers.Sort();
        nonPrimeNumbers.Reverse();
        Console.WriteLine("Non-prime numbers: ");
        double totalNonPrimeNumber = 0;
        foreach (var number in nonPrimeNumbers)
        {
            Console.Write(number + ",");
            totalNonPrimeNumber += Convert.ToDouble(number);
        }
        Console.WriteLine();
        Console.WriteLine("Number of non-prime numbers: " + nonPrimeNumbers.Count);
        Console.WriteLine("Average of non-prime numbers: " + (nonPrimeNumbers.Count > 0 ? (totalNonPrimeNumber / nonPrimeNumbers.Count) : 0));
    }
}

