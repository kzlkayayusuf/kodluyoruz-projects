namespace hw13;

public class TeamMember
{
    private int id;
    private string name;

    public TeamMember(int id, string name)
    {
        this.Id = id;
        this.Name = name;
    }

    public int Id { get => id; set => id = value; }
    public string Name { get => name; set => name = value; }

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
        return Id + ":" + Name;
    }
}