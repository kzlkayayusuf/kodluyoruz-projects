using System;
namespace hw12;
class Program
{
    static void Main(string[] args)
    {
        PhoneBook phoneBook = new PhoneBook();

        PhoneBookMainMenu(phoneBook);

        Console.ReadLine();
    }

    public static void PhoneBookMainMenu(PhoneBook phoneBook)
    {
        Console.WriteLine("#".PadLeft(20, '#') + " PHONE BOOK MAIN MENU " + "#".PadLeft(20, '#'));
        Console.WriteLine("Please write the number of the transaction you want to do.");
        Console.WriteLine("-".PadLeft(50, '-'));
        Console.WriteLine(""
            + "(1) Create a new contact,\n"
            + "(2) Delete existing contact,\n"
            + "(3) Update existing contact,\n"
            + "(4) List all contacts,\n"
            + "(5) Search in the Phonebook,\n"
            + "(0) Exit the Phonebook,\n"
            );

        string input = Console.ReadLine().Trim();

        switch (input)
        {
            case "1":
                phoneBook.AddNewContact();
                break;

            case "2":
                phoneBook.DeleteContact();
                break;

            case "3":
                phoneBook.UpdateContact();
                break;

            case "4":
                phoneBook.ListAllContacts();
                break;

            case "5":
                phoneBook.SearchContact();
                break;

            case "0":
                phoneBook.ExitPhoneBook();
                break;

            default:
                Console.WriteLine("Invalid entry,Please re-enter!");
                PhoneBookMainMenu(phoneBook);
                break;
        }

    }
}
