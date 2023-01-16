package java102.adventureGame;

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

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        GameCharacter[] charList = { new Samurai(), new Cavalier(), new Archer() };

        System.out.println("********************************");

        for (GameCharacter gameCharacter : charList) {
            System.out.println("Character: " + gameCharacter.getName() +
                    "\t Damage: " + gameCharacter.getDamage() +
                    "\t Health: " + gameCharacter.getHealth() +
                    "\t Coin: " + gameCharacter.getCoin());
        }
    }

    public int getDamage() {
        return damage;
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

}
