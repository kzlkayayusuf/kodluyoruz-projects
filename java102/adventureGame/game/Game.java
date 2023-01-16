package java102.adventureGame.game;

import java.util.Scanner;

import java102.adventureGame.location.Cave;
import java102.adventureGame.location.Forest;
import java102.adventureGame.location.Location;
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
            System.out.println("3 - Cave --> Enter the cave, Award: <Food>, The zombie may come out, be careful! ");
            System.out.println(
                    "4 - Forest --> Enter the forest, Award: <Firewood>, The vampire may come out, be careful! ");
            System.out.println("5 - River --> Enter the river, Award: <Water>, The bear may come out, be careful! ");
            System.out.println("0 - End the Game");

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
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    // System.out.println("please select a valid field!");
                    break;
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
