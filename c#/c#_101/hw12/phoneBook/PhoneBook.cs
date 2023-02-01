using System;
using System.Collections.Generic;
namespace hw12;
public class PhoneBook : IPhoneBook
{
    private static List<Contact> contacts = new List<Contact>();

    public PhoneBook()
    {
        // Varsayılan telefon rehberi
        contacts.Add(new Contact("Kodluyoruz", "Com", "05522057019"));
        contacts.Add(new Contact("Backend", "Developer", "05533059022"));
        contacts.Add(new Contact("Patika", "Dev", "02129995577"));
        contacts.Add(new Contact("Param", "Practicum", "05544075038"));
        contacts.Add(new Contact("Anadolu", "Yıldızları", "05519875573"));

    }

    public void AddNewContact()
    {
        Console.WriteLine("#".PadLeft(20, '#') + " ADD A NEW CONTACT " + "#".PadLeft(20, '#'));

        string name = "", surname = "", number = "";

        bool nameIsValid = false, surnameIsValid = false, numberIsValid = false;

        while (true)
        {
            if (!nameIsValid)
            {
                Console.Write("Please Enter Name: ");
                name = Console.ReadLine().Trim();

                if (string.IsNullOrEmpty(name))
                    Console.WriteLine("Name cannot be empty!");
                else
                    nameIsValid = true;
            }
            else if (!surnameIsValid)
            {
                Console.Write("Please Enter Surname: ");
                surname = Console.ReadLine().Trim();

                if (string.IsNullOrEmpty(surname))
                    Console.WriteLine("Surname cannot be empty!");
                else
                    surnameIsValid = true;
            }
            else if (!numberIsValid)
            {
                Console.Write("Please enter the 11 digit phone number: ");
                number = Console.ReadLine().Trim();

                if (string.IsNullOrEmpty(number))
                    Console.WriteLine("Phone number cannot be empty!");
                else if (number.Length == 11)
                {
                    if (long.TryParse(number, out long longNum) == false)
                    {
                        Console.WriteLine("You entered an invalid phone number. Please try again.");
                    }
                    else
                    {
                        numberIsValid = true;
                    }
                }
                else
                    Console.WriteLine("The phone number must be 11 digits. Please try again.");
            }

            if (nameIsValid && surnameIsValid && numberIsValid)
                break;
        }

        Contact contact = new Contact(name, surname, number);
        contacts.Add(contact);

        Console.WriteLine(name + " " + surname + " has been added to the Phonebook.");

        PreferencesOrExitMenu();

    }

    public void DeleteContact()
    {
        Console.WriteLine("#".PadLeft(20, '#') + " DELETE EXISTING CONTACT " + "#".PadLeft(20, '#'));
        bool isChoiceOk = false;
        int choose = 0;
        while (!isChoiceOk)
        {
            Console.WriteLine("Please write the number of the transaction you want to do.");
            Console.WriteLine("-".PadLeft(50, '-'));
            Console.WriteLine(""
                + "(1) Delete by name,\n"
                + "(2) Delete by surname,\n"
                + "(3) Delete by phone number,\n"
                + "(4) Return to main menu... ,\n"
                );

            string userInput = Console.ReadLine().Trim();

            if (userInput.Equals("1"))
            {
                isChoiceOk = true;
                choose = 1;
            }
            else if (userInput.Equals("2"))
            {
                isChoiceOk = true;
                choose = 2;
            }
            else if (userInput.Equals("3"))
            {
                isChoiceOk = true;
                choose = 3;
            }
            else if (userInput.Equals("4"))
            {
                isChoiceOk = true;
                choose = 4;
            }
            else
            {
                Console.WriteLine("Invalid entry,Please re-enter!");
                isChoiceOk = false;
                choose = 0;
            }
        }

        switch (choose)
        {
            case 1:
                DeleteByName();
                break;
            case 2:
                DeleteBySurname();
                break;
            case 3:
                DeleteByPhoneNumber();
                break;
            case 4:
                ReturnToMainMenu();
                break;
        }
    }

    private void DeleteByName()
    {
        Console.WriteLine("Enter the contact name you want to delete.");

        string name = Console.ReadLine().Trim();
        Contact contact = GetContactByName(name);

        if (contact == null)
        {
            Console.WriteLine("Name: {" + name + "} invalid or not found!");
        TryAgainForName:
            Console.WriteLine(""
                    + "(1) Try again,\n"
                    + "(2) Return to main menu.\n"
                    );
            string choose = Console.ReadLine();
            if (choose.Equals("1"))
            {
                DeleteByName();
            }
            else if (choose.Equals("2"))
            {
                ReturnToMainMenu();
            }
            else
            {
                Console.WriteLine("Invalid entry!");
                goto TryAgainForName;
            }
        }
        else
        {
            while (true)
            {
                Console.WriteLine("{" + contact.GetFullName + ", " + contact.PhoneNumber + "} will be deleted from phone book. Do you confirm? (y/n)");

                string confirm = Console.ReadLine();
                if (confirm.Equals("y", StringComparison.InvariantCultureIgnoreCase))
                {
                    Console.WriteLine(contact.GetFullName + " has been deleted.");
                    contacts.Remove(contact);
                    break;
                }
                else if (confirm.Equals("n", StringComparison.InvariantCultureIgnoreCase))
                {
                    Console.WriteLine("Contact deletion was cancelled.");
                    break;
                }
                else
                {
                    Console.WriteLine("Invalid entry, Please re-enter!");
                }
            }

            ReturnToMainMenu();
        }
    }

    private void DeleteBySurname()
    {
        Console.WriteLine("Enter the contact surname you want to delete.");

        string surname = Console.ReadLine().Trim();
        Contact contact = GetContactBySurname(surname);

        if (contact == null)
        {
            Console.WriteLine("Surname: {" + surname + "} invalid or not found!");

        TryAgainForSurname:

            Console.WriteLine(""
                    + "(1) Try again,\n"
                    + "(2) Return to main menu.\n"
                    );
            string choose = Console.ReadLine();
            if (choose.Equals("1"))
            {
                DeleteBySurname();
            }
            else if (choose.Equals("2"))
            {
                ReturnToMainMenu();
            }
            else
            {
                Console.WriteLine("Invalid entry!");
                goto TryAgainForSurname;
            }
        }
        else
        {
            while (true)
            {
                Console.WriteLine("{" + contact.GetFullName + ", " + contact.PhoneNumber + "} will be deleted from phone book. Do you confirm? (y/n)");

                string confirm = Console.ReadLine();
                if (confirm.Equals("y", StringComparison.InvariantCultureIgnoreCase))
                {
                    Console.WriteLine(contact.GetFullName + " has been deleted.");
                    contacts.Remove(contact);
                    break;
                }
                else if (confirm.Equals("n", StringComparison.InvariantCultureIgnoreCase))
                {
                    Console.WriteLine("Contact deletion was cancelled.");
                    break;
                }
                else
                {
                    Console.WriteLine("Invalid entry,Pleae re-enter!");
                }
            }

            ReturnToMainMenu();
        }
    }

    private void DeleteByPhoneNumber()
    {
        Console.WriteLine("Please enter the 11-digit phone number that you want to delete.");

        string number = Console.ReadLine().Trim();
        Contact contact = GetContactByPhoneNumber(number);

        if (contact == null)
        {
            Console.WriteLine("Number: {" + number + "} invalid or not found!");
        TryAgainForNumber:
            Console.WriteLine(""
                    + "(1) Try again,\n"
                    + "(2) Return to main menu.\n"
                    );
            string choose = Console.ReadLine();
            if (choose.Equals("1"))
            {
                DeleteByPhoneNumber();
            }
            else if (choose.Equals("2"))
            {
                ReturnToMainMenu();
            }
            else
            {
                Console.WriteLine("Invalid entry,Pleae re-enter!");
                goto TryAgainForNumber;
            }
        }
        else
        {
            while (true)
            {
                Console.WriteLine("{" + contact.GetFullName + ", " + contact.PhoneNumber + "} will be deleted from phone book. Do you confirm? (y/n)");

                string confirm = Console.ReadLine();
                if (confirm.Equals("y", StringComparison.InvariantCultureIgnoreCase))
                {
                    Console.WriteLine("{" + contact.GetFullName + ", " + contact.PhoneNumber + "} has been deleted.");
                    contacts.Remove(contact);
                    break;
                }
                else if (confirm.Equals("n", StringComparison.InvariantCultureIgnoreCase))
                {
                    Console.WriteLine("Contact deletion was cancelled.");
                    break;
                }
                else
                {
                    Console.WriteLine("Invalid entry!");
                }
            }

            ReturnToMainMenu();
        }
    }

    public void ExitPhoneBook()
    {
        Console.WriteLine("Exiting the phone book app,Please push a key!");
        Console.ReadKey();
    }

    public void ListAllContacts()
    {
        Console.WriteLine("#".PadLeft(20, '#') + " ALL CONTACTS " + "#".PadLeft(20, '#'));
        Console.WriteLine("-".PadLeft(50, '-'));

        foreach (Contact contact in contacts)
        {
            Console.Write(contact.ToString());
        }

        ReturnToMainMenu();

    }

    public void SearchContact()
    {
        Console.WriteLine("#".PadLeft(20, '#') + " SEARCH CONTACT " + "#".PadLeft(20, '#'));

    TryAgainForSearch:
        bool isChoiceOk = false;
        int choose = 0;
        while (!isChoiceOk)
        {
            Console.WriteLine("Please write the number of the transaction you want to do.");
            Console.WriteLine("----------------------------------------------------------");
            Console.WriteLine(""
                + "(1) Search by name,\n"
                + "(2) Search by surname,\n"
                + "(3) Search by phone number,\n"
                + "(4) Return to main menu... ,\n"
                );

            string userInput = Console.ReadLine().Trim();

            if (userInput.Equals("1"))
            {
                isChoiceOk = true;
                choose = 1;
            }
            else if (userInput.Equals("2"))
            {
                isChoiceOk = true;
                choose = 2;
            }
            else if (userInput.Equals("3"))
            {
                isChoiceOk = true;
                choose = 3;
            }
            else if (userInput.Equals("4"))
            {
                isChoiceOk = true;
                choose = 4;
            }
            else
            {
                Console.WriteLine("Invalid entry,Please re-enter!");
                isChoiceOk = false;
                choose = 0;
            }
        }

        Contact contact = null;
        bool found = true;
        switch (choose)
        {
            case 1:
                Console.WriteLine("Please enter contact name.");
                string name = Console.ReadLine().Trim();
                contact = GetContactByName(name);
                if (contact == null)
                {
                    Console.WriteLine("Name: {" + name + "} not found!");
                    goto TryAgainForSearch;
                }
                break;
            case 2:
                Console.WriteLine("Please enter contact surname.");
                string surname = Console.ReadLine().Trim();
                contact = GetContactBySurname(surname);
                if (contact == null)
                {
                    Console.WriteLine("Surname: {" + surname + "} not found!");
                    goto TryAgainForSearch;
                }
                break;
            case 3:
                Console.WriteLine("Please enter phone number.");
                string number = Console.ReadLine().Trim();
                contact = GetContactByPhoneNumber(number);
                if (contact == null)
                {
                    Console.WriteLine("Phone Number: {" + number + "} not found!");
                    goto TryAgainForSearch;
                }
                break;
            case 4:
                found = false;
                ReturnToMainMenu();
                break;
        }

        if (found)
        {
            Console.WriteLine(contact.ToString());
            ReturnToMainMenu();
        }
    }

    private Contact GetContactByName(string name)
    {
        foreach (Contact contact in contacts)
        {
            if (contact.Name.Equals(name, StringComparison.InvariantCultureIgnoreCase))
                return contact;
        }
        return null;
    }

    private Contact GetContactBySurname(string surname)
    {
        foreach (Contact contact in contacts)
        {
            if (contact.Surname.Equals(surname, StringComparison.InvariantCultureIgnoreCase))
                return contact;
        }
        return null;
    }

    private Contact GetContactByPhoneNumber(string number)
    {
        foreach (Contact contact in contacts)
        {
            if (contact.PhoneNumber.Equals(number, StringComparison.InvariantCultureIgnoreCase))
                return contact;
        }
        return null;
    }

    public void PreferencesOrExitMenu()
    {
        Console.WriteLine("\nPlease write the number of the transaction you want to do.");
        Console.WriteLine("#".PadLeft(50, '-'));

        Console.WriteLine(""
            + "(0) Close the phone book and finish the program!\n"
            + "(1) Return To Main Menu...,\n"
            );

        string input = Console.ReadLine().Trim();

        if (input.Equals("0"))
            ExitPhoneBook();
        else if (input.Equals("1"))
            ReturnToMainMenu();
        else
        {
            Console.WriteLine("Invalid entry,Please re-enter!");
            PreferencesOrExitMenu();
        }
    }

    private void ReturnToMainMenu()
    {
        Program.PhoneBookMainMenu(this);
    }

    public void UpdateContact()
    {
        Console.WriteLine("#".PadLeft(20, '#') + " UPDATE CONTACT " + "#".PadLeft(20, '#'));
    TryAgainForUpdate:
        bool isChoiceOk = false;
        int choose = 0;
        while (!isChoiceOk)
        {
            Console.WriteLine("Please write the number of the transaction you want to do.");
            Console.WriteLine("-".PadLeft(50, '-'));
            Console.WriteLine(""
                + "(1) Name update,\n"
                + "(2) Surname update,\n"
                + "(3) Phone number update,\n"
                + "(4) Return to main menu... ,\n"
                );

            string userInput = Console.ReadLine().Trim();

            if (userInput.Equals("1"))
            {
                isChoiceOk = true;
                choose = 1;
            }
            else if (userInput.Equals("2"))
            {
                isChoiceOk = true;
                choose = 2;
            }
            else if (userInput.Equals("3"))
            {
                isChoiceOk = true;
                choose = 3;
            }
            else if (userInput.Equals("4"))
            {
                isChoiceOk = true;
                choose = 4;
            }
            else
            {
                Console.WriteLine("Invalid entry,Please re-enter!");
                isChoiceOk = false;
            }
        }

        Contact contact = null;
        bool found = true;
        switch (choose)
        {
            case 1:
                Console.WriteLine("Please enter the name you want to update: ");
                string name = Console.ReadLine().Trim();
                contact = GetContactByName(name);
                if (contact == null)
                {
                    Console.WriteLine("Name: {" + name + "} not found!");
                    goto TryAgainForUpdate;
                }

                Console.WriteLine("Please enter the new name: ");
                string newName = Console.ReadLine().Trim();
                if (string.IsNullOrEmpty(newName))
                {
                    Console.WriteLine("New name cannot be empty!");
                    goto TryAgainForUpdate;
                }
                contact.Name = newName;
                break;
            case 2:
                Console.WriteLine("Please enter the surname you want to update: ");
                string surname = Console.ReadLine().Trim();
                contact = GetContactBySurname(surname);
                if (contact == null)
                {
                    Console.WriteLine("Surname: {" + surname + "} not found!");
                    goto TryAgainForUpdate;
                }
                Console.WriteLine("Please enter the new surname: ");
                string newSurname = Console.ReadLine().Trim();
                if (string.IsNullOrEmpty(newSurname))
                {
                    Console.WriteLine("New surname cannot be empty!");
                    goto TryAgainForUpdate;
                }
                contact.Surname = newSurname;
                break;
            case 3:
                Console.WriteLine("Please enter the phone number you want to update: ");
                string number = Console.ReadLine().Trim();
                contact = GetContactByPhoneNumber(number);
                if (contact == null)
                {
                    Console.WriteLine("Phone Number: {" + number + "} not found!");
                    goto TryAgainForUpdate;
                }
                Console.WriteLine("Please enter the new 11 digit phone number.");
                string newPhoneNumber = Console.ReadLine().Trim();
                if (string.IsNullOrEmpty(newPhoneNumber))
                {
                    Console.WriteLine("New phone number cannot be empty!");
                    goto TryAgainForUpdate;
                }
                else if (newPhoneNumber.Length == 11)
                {
                    if (long.TryParse(number, out long longNum) == false)
                    {
                        Console.WriteLine("You entered an invalid phone number. Please try again.");
                        goto TryAgainForUpdate;
                    }
                }
                contact.PhoneNumber = newPhoneNumber;
                break;
            case 4:
                found = false;
                ReturnToMainMenu();
                break;
        }

        if (found)
        {
            Console.WriteLine("Phone book updated.");
            ReturnToMainMenu();
        }
    }
}
