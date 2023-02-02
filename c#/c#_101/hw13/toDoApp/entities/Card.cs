namespace hw13;

public class Card
{
    private string title;
    private string content;
    private TeamMember assignedTo;
    private CardSize size;
    private BoardColumn column;

    public Card(string title, string content, TeamMember assignedTo, CardSize size, BoardColumn column)
    {
        this.Title = title;
        this.content = content;
        this.AssignedTo = assignedTo;
        this.Size = size;
        this.Column = column;
    }

    public string Title { get => title; set => title = value; }
    public string Content { get => content; set => content = value; }
    public TeamMember AssignedTo { get => assignedTo; set => assignedTo = value; }
    public CardSize Size { get => size; set => size = value; }
    public BoardColumn Column { get => column; set => column = value; }

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
        return "Başlık: " + Title + "\n" +
        "İçerik: " + Content + "\n" +
        "Atanan Kişi: " + AssignedTo.Name + "\n" +
        "Büyüklük: " + Size + "\n" +
        "Line: " + Column + "\n" + '-';
    }
}