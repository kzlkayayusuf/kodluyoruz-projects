using System.Collections.Generic;
namespace hw13;

public interface IBoard
{
    void AddCard(string title, string content, TeamMember assignedTo, CardSize size, BoardColumn column);
    Card UpdateCard(Card card, string title, string content, TeamMember assignedTo, CardSize size);
    void DeleteCard(Card card);
    void MoveCard(Card card, BoardColumn column);
    void PrintBoard();
    List<Card> GetCards();
    List<TeamMember> GetTeamMembers();
    TeamMember GetTeamMemberById(int id);
    Card GetCardByTitle(string title);
    void AddNewMember(string name);
}