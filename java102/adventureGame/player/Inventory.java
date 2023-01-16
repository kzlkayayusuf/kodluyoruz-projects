package java102.adventureGame.player;

import java102.adventureGame.stuff.Armor;
import java102.adventureGame.stuff.Weapon;

public class Inventory {

    private Weapon weapon;
    private Armor armor;

    public Inventory() {
        this.weapon = new Weapon(-1, 0, 0, "punch");
        this.armor = new Armor(-1, "Bum Fodder", 0, 0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

}
