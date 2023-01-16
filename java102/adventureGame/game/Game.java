package java102.adventureGame.game;

import java.util.Scanner;

import java102.adventureGame.location.Location;
import java102.adventureGame.location.SafeHouse;
import java102.adventureGame.location.ToolStore;
import java102.adventureGame.player.Player;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("welcome to adventure game!");
        System.out.print("Please enter your name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " welcome to this dark and foggy island");

        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("**********Locations**********");
            System.out.println();
            System.out.println("1 - Safe House  --> Here haven't any enemy");
            System.out.println("2 - Tool Store --> Here you can buy weapon or shield");
            System.out.print("Please choose a location: ");
            int selectLocation = input.nextInt();
            switch (selectLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if (!location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }
    }
}
