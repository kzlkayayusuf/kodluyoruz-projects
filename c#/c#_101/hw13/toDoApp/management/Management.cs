using System;
namespace hw13;
public class Management
{
    private IBoard board;

    public Management(IBoard board)
    {
        this.board = board;
    }

    public void ShowMenu()
    {
        Console.WriteLine();
        Console.WriteLine("(1) Board Listelemek");
        Console.WriteLine("(2) Board'a Kart Eklemek");
        Console.WriteLine("(3) Board'dan Kart Güncellemek");
        Console.WriteLine("(4) Board'dan Kart Silmek");
        Console.WriteLine("(5) Kart Taşımak");
        Console.WriteLine("(6) Yeni Takım Üyesi Ekle");
        Console.WriteLine("*".PadLeft(70, '*'));
        Console.Write("Lütfen yapmak istediğiniz işlemi seçiniz: ");
        int menuOption = int.Parse(Console.ReadLine());
        switch (menuOption)
        {
            case 1:
                ListCards();
                break;
            case 2:
                AddCard();
                break;
            case 3:
                UpdateCard();
                break;
            case 4:
                DeleteCard();
                break;
            case 5:
                MoveCard();
                break;
            case 6:
                AddNewMember();
                break;
            default:
                Console.WriteLine("Hatalı giriş yaptınız, lütfen tekrar deneyin.");
                break;
        }
    }

    public void ShowOptions(string process)
    {
        Console.WriteLine();
        Console.WriteLine("(1)" + process + "'yi sonlandırmak için");
        Console.WriteLine("(2) Yeniden denemek için");
        Console.WriteLine("*".PadLeft(70, '*'));
        Console.Write("Lütfen yapmak istediğiniz işlemi seçiniz: ");


        int option = int.Parse(Console.ReadLine());
        switch (option)
        {
            case 1:
                ShowMenu();
                break;
            case 2:
                if (process == "Card Ekleme")
                    AddCard();
                else if (process == "Card Güncelleme")
                    UpdateCard();
                else if (process == "Card Silme")
                    DeleteCard();
                else if (process == "Card Taşıma")
                    MoveCard();
                else if (process == "Yeni üye Ekleme")
                    AddNewMember();
                else
                    ShowMenu();
                break;
            default:
                Console.WriteLine("Hatalı giriş yaptınız, lütfen tekrar deneyin.");
                break;
        }
    }


    private void ListCards()
    {
        Console.WriteLine();
        Console.WriteLine("TODO Line");
        Console.WriteLine("*".PadLeft(70, '*'));
        ListCardsByColumn(BoardColumn.TODO);
        Console.WriteLine("\nIN PROGRESS Line");
        Console.WriteLine("*".PadLeft(70, '*'));
        ListCardsByColumn(BoardColumn.IN_PROGRESS);
        Console.WriteLine("\nDONE Line");
        Console.WriteLine("*".PadLeft(70, '*'));
        ListCardsByColumn(BoardColumn.DONE);
        Console.WriteLine("\n");
        ShowMenu();
    }

    private void ListCardsByColumn(BoardColumn column)
    {
        int i = 1;
        foreach (var card in board.GetCards())
        {
            if (card.Column == column)
            {
                Console.WriteLine(i + ".\n" + card.ToString());
                i++;
            }
        }
    }

    private void AddCard()
    {
        Console.WriteLine();
        Console.WriteLine("#".PadLeft(10, '#') + " Card Ekle " + "#".PadLeft(10, '#'));
        Console.Write("Kart Başlığı: ");
        string title = Console.ReadLine();
        Console.Write("Kart İçeriği: ");
        string content = Console.ReadLine();
        Console.Write("Kartın Size'ını seçiniz (1: XS, 2: S, 3: M, 4: L, 5: XL): ");
        int size = int.Parse(Console.ReadLine());
        Console.WriteLine("\nTakım üyeleri: ");
        Console.WriteLine("-".PadLeft(70, '-'));
        PrintTeamMembers();
        Console.Write("\nKarta Atanacak Kişi ID'sini Yukarıdaki Listeden seçiniz : ");
        int assignedID = int.Parse(Console.ReadLine());
        TeamMember assignedTo = board.GetTeamMemberById(assignedID);
        if (assignedTo == null)
        {
            Console.WriteLine("Geçersiz takım üyesi id'si girdiniz!");
            ShowOptions("Card Ekleme");
            return;
        }
        board.AddCard(title, content, assignedTo, (CardSize)size, BoardColumn.TODO);
        Console.WriteLine("Kart başarıyla eklendi :)");
        ShowMenu();
    }

    private void PrintTeamMembers()
    {
        foreach (var member in board.GetTeamMembers())
        {
            Console.Write(member.ToString() + ", ");
        }
    }

    private void AddNewMember()
    {
        Console.WriteLine();
        Console.WriteLine("#".PadLeft(10, '#') + " Yeni Takım Üyesi Ekle " + "#".PadLeft(10, '#'));
        Console.Write("Yeni Üye İsmini Giriniz: ");
        string name = Console.ReadLine();
        if (name.Length < 3)
        {
            Console.WriteLine("Geçersiz isim girdiniz!");
            ShowOptions("Yeni üye Ekleme");
            return;
        }
        board.AddNewMember(name);
        Console.WriteLine("Yeni üye başarıyla eklendi :)");
        ShowMenu();
    }
    private void UpdateCard()
    {
        Console.WriteLine();
        Console.WriteLine("#".PadLeft(10, '#') + " Card Güncelleme " + "#".PadLeft(10, '#'));
        Console.WriteLine("Öncelikle güncellemek istediğiniz kartı seçmeniz gerekiyor.");
        Console.Write("Lütfen kart başlığını yazınız: ");
        string checkTitle = Console.ReadLine();
        Card oldCard = board.GetCardByTitle(checkTitle);
        if (oldCard == null)
        {
            Console.WriteLine("Aradığınız krtiterlere uygun kart board'da bulunamadı.");
            ShowOptions("Card Güncelleme");
            return;
        }
        Console.Write("Yeni Kart Başlığı: ");
        string title = Console.ReadLine();
        Console.Write("Yeni Kart İçeriği: ");
        string content = Console.ReadLine();
        Console.Write("Kartın Yeni Size'ını seçiniz (1: XS, 2: S, 3: M, 4: L, 5: XL): ");
        int size = int.Parse(Console.ReadLine());
        Console.WriteLine("\nTakım üyeleri: ");
        Console.WriteLine("-".PadLeft(70, '-'));
        PrintTeamMembers();
        Console.Write("\nKarta Atanacak Kişi ID'sini Yukarıdaki Listeden seçiniz : ");
        int assignedID = int.Parse(Console.ReadLine());
        TeamMember assignedTo = board.GetTeamMemberById(assignedID);
        if (assignedTo == null)
        {
            Console.WriteLine("Geçersiz takım üyesi id'si girdiniz!");
            ShowOptions("Add");
            return;
        }
        Card newCard = board.UpdateCard(oldCard, title, content, assignedTo, (CardSize)size);
        Console.WriteLine("Kart başarıyla güncellendi :)");

        PrintCard(newCard);
        ShowMenu();
    }

    private void DeleteCard()
    {
        Console.WriteLine();
        Console.WriteLine("#".PadLeft(10, '#') + " Card Sil " + "#".PadLeft(10, '#'));
        Console.WriteLine("Öncelikle silmek istediğiniz kartı seçmeniz gerekiyor.");
        Console.Write("Lütfen kart başlığını yazınız: ");
        string checkTitle = Console.ReadLine();
        Card card = board.GetCardByTitle(checkTitle);
        if (card == null)
        {
            Console.WriteLine("Aradığınız krtiterlere uygun kart board'da bulunamadı.");
            ShowOptions("Card Silme");
            return;
        }

        board.DeleteCard(card);
        Console.WriteLine("Kart başarıyla silindi :)");
        ShowMenu();
    }

    private void MoveCard()
    {
        Console.WriteLine();
        Console.WriteLine("#".PadLeft(10, '#') + " Card Taşı " + "#".PadLeft(10, '#'));
        Console.WriteLine("Öncelikle taşımak istediğiniz kartı seçmeniz gerekiyor.");
        Console.Write("Lütfen kart başlığını yazınız: ");
        string checkTitle = Console.ReadLine();
        Card card = board.GetCardByTitle(checkTitle);
        if (card == null)
        {
            Console.WriteLine("Aradığınız krtiterlere uygun kart board'da bulunamadı.");
            ShowOptions("Card Taşıma");
            return;
        }
        Console.WriteLine("Bulunan Kart Bilgileri: ");
        Console.WriteLine("*".PadLeft(70, '*'));
        PrintCard(card);
        Console.Write("(1) TODO \n(2) IN_PROGRESS \n(3) DONE ");
        Console.Write("\nLütfen taşımak istediğiniz Line'ı seçiniz: ");
        int column = int.Parse(Console.ReadLine());
        board.MoveCard(card, (BoardColumn)column);
        Console.WriteLine("Kart başarıyla taşındı :)");
        ShowMenu();
    }

    private void PrintCard(Card card)
    {
        Console.WriteLine(card.ToString());
    }
}