package java102.adventureGame.player;

import java102.adventureGame.stuff.Armor;
import java102.adventureGame.stuff.Weapon;

public class Inventory {

    private Weapon weapon;
    private Armor armor;
    private String[] awards;

    public Inventory() {
        this.weapon = new Weapon(-1, "Punch", 0, 0);
        this.armor = new Armor(-1, "Bum Fodder", 0, 0);
        this.awards = new String[4];
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

    public String[] getAwards() {
        return awards;
    }

    public void setAwards(String[] awards) {
        this.awards = awards;
    }

    public String printAwards() {
        String item = "";
        for (String award : getAwards()) {
            item += (award + ", ");
        }
        return item;
    }

}
