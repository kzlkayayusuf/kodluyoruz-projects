package java102.adventureGame.player;

import java.util.Scanner;

import java102.adventureGame.character.Archer;
import java102.adventureGame.character.Cavalier;
import java102.adventureGame.character.GameCharacter;
import java102.adventureGame.character.Samurai;

public class Player {
    private int damage;
    private int health;
    private int coin;
    private String name;
    private String charName;
    private Inventory inventory;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameCharacter[] charList = { new Samurai(), new Archer(), new Cavalier() };

        System.out.println("Characters");
        System.out.println("****************************************************************");

        for (GameCharacter gameCharacter : charList) {
            System.out.println("ID: " + gameCharacter.getId() +
                    "\t Character: " + gameCharacter.getName() +
                    "\t Damage: " + gameCharacter.getDamage() +
                    "\t Health: " + gameCharacter.getHealth() +
                    "\t Coin: " + gameCharacter.getCoin());
        }
        System.out.println("****************************************************************");
        System.out.print("Please choose a character: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Cavalier());
                break;

            default:
                initPlayer(new Samurai());
                break;
        }
        System.out.println("Character: " + this.getCharName() + ", Damage: " + this.getDamage() + ", Health: "
                + this.getHealth() + ", Coin: " + this.getCoin());
    }

    public void printInfo() {
        System.out.println(
                "Your Weapon: " + this.getInventory().getWeapon().getName() +
                        ", Your Damage: " + this.getDamage() +
                        ", Your Health: " + this.getHealth() +
                        ", Your Coin: " + this.getCoin());
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setCoin(gameCharacter.getCoin());
        this.setCharName(gameCharacter.getName());
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
