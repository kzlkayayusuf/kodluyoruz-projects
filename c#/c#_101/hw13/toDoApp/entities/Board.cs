using System;
using System.Collections.Generic;
namespace hw13;
public class Board : IBoard
{

    private List<TeamMember> teamMembers;
    private List<Card> cards;

    public Board()
    {
        teamMembers = new List<TeamMember>()
            {
                new TeamMember(1,"Yusuf"),
                new TeamMember(2,"Mustafa"),
                new TeamMember(3,"Zeynep")
            };
        Cards = new List<Card>()
            {
                new Card("Card 1","Card 1 content", TeamMembers[0],CardSize.XS,BoardColumn.TODO),
                new Card("Card 2","Card 2 content", TeamMembers[1],CardSize.L,BoardColumn.DONE),
                new Card("Card 3","Card 3 content", TeamMembers[2],CardSize.M,BoardColumn.IN_PROGRESS)
            };
    }

    public List<TeamMember> TeamMembers { get => teamMembers; set => teamMembers = value; }
    public List<Card> Cards { get => cards; set => cards = value; }

    public void AddCard(string title, string content, TeamMember assignedTo, CardSize size, BoardColumn column)
    {
        Card card = new Card(title, content, assignedTo, size, column);
        Cards.Add(card);
    }

    public void AddNewMember(string name)
    {
        TeamMember newMember = new TeamMember(teamMembers.Count + 1, name);
        teamMembers.Add(newMember);
    }

    public void DeleteCard(Card card)
    {
        Cards.Remove(card);
    }

    public Card GetCardByTitle(string title)
    {
        return Cards.Find(t => t.Title == title);
    }

    public List<Card> GetCards()
    {
        return Cards;
    }

    public TeamMember GetTeamMemberById(int id)
    {
        return TeamMembers.Find(x => x.Id == id);
    }

    public List<TeamMember> GetTeamMembers()
    {
        return TeamMembers;
    }

    public void MoveCard(Card card, BoardColumn column)
    {
        card.Column = column;
    }

    public void PrintBoard()
    {
        throw new NotImplementedException();
    }

    public Card UpdateCard(Card card, string title, string content, TeamMember assignedTo, CardSize size)
    {
        card.Title = title;
        card.Content = content;
        card.AssignedTo = assignedTo;
        card.Size = size;
        return card;
    }
}
