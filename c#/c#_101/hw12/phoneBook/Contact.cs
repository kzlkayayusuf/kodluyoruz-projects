using System;
namespace hw12;
public class Contact
{
    private string name;
    private string surname;
    private string phoneNumber;

    public Contact(string name, string surname, string phoneNumber)
    {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public string Name { get => name; set => name = value; }
    public string Surname { get => surname; set => surname = value; }
    public string PhoneNumber { get => phoneNumber; set => phoneNumber = value; }
    public string GetFullName { get => Name + " " + Surname; }

    public override bool Equals(object obj)
    {
        return base.Equals(obj);
    }

    public override int GetHashCode()
    {
        return base.GetHashCode();
    }

    public override string ToString()
    {
        return "Contact:\n"
                + "Name          : {" + name
                + "}\nSurname       : {" + surname
                + "}\nPhone Number  : {" + phoneNumber + "}\n";
    }
}