package java102.adventureGame.game;

import java.util.Scanner;

import java102.adventureGame.location.Cave;
import java102.adventureGame.location.Forest;
import java102.adventureGame.location.Location;
import java102.adventureGame.location.Mine;
import java102.adventureGame.location.River;
import java102.adventureGame.location.SafeHouse;
import java102.adventureGame.location.ToolStore;
import java102.adventureGame.player.Player;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("welcome to adventure game!");
        System.out.print("Please enter your name: ");
        String playerName = input.nextLine();
        while (playerName.length() < 3 || playerName.isBlank() || playerName.isEmpty()) {
            System.out.print("invalid name, please re-enter: ");
            playerName = input.nextLine();
        }

        Player player = new Player(playerName.toUpperCase());
        System.out.println(player.getName() + " welcome to this dark and foggy island");

        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println(
                    "############################################ Locations ############################################");
            System.out.println();
            System.out.println("1 - Safe House  --> Here haven't any enemy");
            System.out.println("2 - Tool Store --> Here you can buy weapon or shield");
            System.out.println("3 - Cave --> Enter the cave, Award: <Food>, The zombie may come out, be careful! ");
            System.out.println(
                    "4 - Forest --> Enter the forest, Award: <Firewood>, The vampire may come out, be careful! ");
            System.out.println("5 - River --> Enter the river, Award: <Water>, The bear may come out, be careful! ");
            System.out.println("6 - Mine --> Enter the mine, Award: <Surprise>, The snake may come out, be careful! ");
            System.out.println("0 - End the Game");
            System.out.println(
                    "###################################################################################################");
            System.out.print("Please choose a location: ");
            int selectLocation = input.nextInt();
            switch (selectLocation) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().getAwards()[0] != null) {
                        System.out.println("You won the award here, you can't fight again!");
                        continue;
                    }
                    location = new Cave(player);
                    break;
                case 4:
                    if (player.getInventory().getAwards()[1] != null) {
                        System.out.println("You won the award here, you can't fight again!");
                        continue;
                    }
                    location = new Forest(player);
                    break;
                case 5:
                    if (player.getInventory().getAwards()[2] != null) {
                        System.out.println("You won the award here, you can't fight again!");
                        continue;
                    }
                    location = new River(player);
                    break;
                case 6:
                    if (player.getInventory().getAwards()[3] != null) {
                        System.out.println("You won the award here, you can't fight again!");
                        continue;
                    }
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Please select a valid field!");
                    continue;
            }
            if (location == null || !(location.onLocation())) {
                System.out.println(
                        location == null ? "You quickly gave up on this dark and foggy island :) , see you again"
                                : "Game Over!");
                break;
            }
        }
    }
}
