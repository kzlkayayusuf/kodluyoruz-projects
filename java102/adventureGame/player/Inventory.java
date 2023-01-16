package java102.adventureGame.player;

import java102.adventureGame.weapon.Weapon;

public class Inventory {

    private Weapon weapon;

    public Inventory() {
        this.weapon = new Weapon(0, 0, 0, "punch");
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
