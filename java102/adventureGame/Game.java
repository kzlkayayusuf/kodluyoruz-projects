package java102.adventureGame;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("welcome to adventure game!");
        System.out.print("Please enter your name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " welcome to this dark and foggy island");
        System.out.println("Please choose a character: ");
        player.selectChar();
    }
}
